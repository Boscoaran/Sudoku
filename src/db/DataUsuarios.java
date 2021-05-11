package db;

import java.sql.*;

import modelo.CatalogoPuntuaciones;
import modelo.CatalogoUsuarios;
import modelo.Puntuacion;
import modelo.Usuario;

public class DataUsuarios {
	private static DataUsuarios mDataUsuarios;
	
	private DataUsuarios() {}
	
	public static DataUsuarios getData() {
		if (mDataUsuarios == null) mDataUsuarios = new DataUsuarios();
		return mDataUsuarios;
	}
	
	public void comprobarUsuario(String name) throws SQLException{
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://sql4.freesqldatabase.com/sql4410920", "sql4410920","k5rSggjwym");
		} catch (ClassNotFoundException e) {
			System.out.println("Error al registrar el dirver de MySQL:" + e);
		}
		Statement s = con.createStatement();
		ResultSet rs1 = s.executeQuery("SELECT * FROM Usuario WHERE Nombre = \"" + name + "\"");
		if (!rs1.next()) {
			String st = "1";
			s = con.createStatement();
			rs1 = s.executeQuery("SELECT id FROM Usuario");
			while(rs1.next()) {
				st = rs1.getString(1);
			}
			int res = Integer.parseInt(st) + 1;
			st = res+"";
			s = con.createStatement();
			String query = "INSERT INTO Usuario VALUES ("+ st + ", '" + name +"', 0.0)";
			s.execute(query);
		}
		rs1 = s.executeQuery("SELECT * FROM Usuario");
		while (rs1.next()) {
			int id = rs1.getInt(1);
			String nombre = rs1.getString(2);
			double puntos = rs1.getDouble(3);
			Usuario u = new Usuario(id, nombre, puntos);
			CatalogoUsuarios.getCatalogoUsuarios().anadirUsuario(u);
		}
		s.close();
		con.close();
	}
	
	public void cargarPuntuaciones() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://sql4.freesqldatabase.com/sql4410920", "sql4410920","k5rSggjwym");
			Statement s = con.createStatement();
			String query = "SELECT * FROM Usuario ORDER BY maxP DESC";
			ResultSet rs = s.executeQuery(query);
			query = "SELECT * FROM puntuacionSudokus";
			rs = s.executeQuery(query);
			while(rs.next()) {
				int idUsuario = rs.getInt(2);
				int idSudoku = rs.getInt(3);
				int dif = rs.getInt(4);
				double puntuacion = rs.getDouble(5);
				Puntuacion points = new Puntuacion (CatalogoUsuarios.getCatalogoUsuarios().getNombre(idUsuario),idSudoku, dif,puntuacion);
				CatalogoPuntuaciones.getCatalogoPuntuaciones().anadirPuntuacion(points);
			}
			s.close();
			con.close();
			CatalogoPuntuaciones.getCatalogoPuntuaciones().puntuacionesMayores();
		} catch (Exception e) {
			System.out.println("Error al registrar el dirver de MySQL:" + e);
		}
	}
	
	public void anadirRegistro(String user, int id, int dif, double points) {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://sql4.freesqldatabase.com/sql4410920", "sql4410920","k5rSggjwym");
			Statement s = con.createStatement();
			String query = "SELECT id FROM Usuario where Nombre = '" + user +"'";
			ResultSet rs = s.executeQuery(query);
			rs.next();
			int userId = rs.getInt(1);
			
			int idPuntos = 0;
			query = "SELECT idP FROM puntuacionSudokus";
			rs = s.executeQuery(query);
			while(rs.next()) {
				idPuntos = rs.getInt(1);
			}
			idPuntos++;
			s = con.createStatement();
			//query = "INSERT INTO puntuacionSudokus VALUES (" + idPuntos + "," + userId + "," + id + "," + dif + "," + puntosStr + ");";
			PreparedStatement st = con.prepareStatement("INSERT INTO puntuacionSudokus (idP, idU, idS, dif, puntuacion) VALUES (?,?,?,?,?)");
			st.setInt(1, idPuntos);
			st.setInt(2, userId);
			st.setInt(3, id);
			st.setInt(4, dif);
			st.setDouble(5, points);
			st.execute();
			anadirMejorPuntuacion(user, con, points);
			st.close();
			s.close();
			rs.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error al registrar el dirver de MySQL:" + e);
		}
	}
	
	private void anadirMejorPuntuacion(String u, Connection c, double points) throws SQLException {
		Statement s = c.createStatement();
		String query = "SELECT maxP FROM Usuario WHERE Nombre = '" + u + "';" ;
		ResultSet rs = s.executeQuery(query);
		rs.next();
		double p = rs.getDouble(1);
		if (p <= points) {
			PreparedStatement st = c.prepareStatement("UPDATE Usuario SET maxP = ? WHERE Nombre = ? ;");
			st.setDouble(1, points);
			st.setString(2, u);
			st.executeUpdate();
		}
	}
}
