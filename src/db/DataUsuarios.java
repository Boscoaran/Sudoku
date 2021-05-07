package db;

import java.sql.*;

import modelo.CatalogoUsuarios;
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
			System.out.println("Conectado");
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
			String query = "INSERT INTO usuario VALUES ("+ st + ", '" + name +"', 0.0)";
			s.execute(query);
			s.close();
		}
		con.close();
	}
	
	public void cargarPuntuaciones() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://sql4.freesqldatabase.com/sql4410920", "sql4410920","k5rSggjwym");
			System.out.println("Conectado");
			Statement s = con.createStatement();
			String query = "SELECT * FROM Usuario ORDER BY maxP DESC";
			ResultSet rs = s.executeQuery(query);
			while (rs.next()) {
				int id = rs.getInt(1);
				String n = rs.getString(2);
				double punt = rs.getDouble(3);
				Usuario u = new Usuario(id,n,punt);
				CatalogoUsuarios.getCatalogoUsuarios().anadirUsuario(u);
			}
			s.close();
			con.close();
			CatalogoUsuarios.getCatalogoUsuarios().mostrar();
		} catch (Exception e) {
			System.out.println("Error al registrar el dirver de MySQL:" + e);
		}
	}
	
	public void anadirRegistro(String user, int id, int dif, double points) {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://sql4.freesqldatabase.com/sql4410920", "sql4410920","k5rSggjwym");
			System.out.println("Conectado");
			Statement s = con.createStatement();
			String query = "SELECT id FROM usuario where nombreUsuario = '" + user +"'";
			ResultSet rs = s.executeQuery(query);
			rs.next();
			int userId = rs.getInt(1);
			
			int idPuntos = 0;
			query = "SELECT idPuntuacion FROM puntuacionSudokus";
			rs = s.executeQuery(query);
			while(rs.next()) {
				idPuntos = rs.getInt(1);
			}
			idPuntos++;
			s = con.createStatement();
			//query = "INSERT INTO puntuacionSudokus VALUES (" + idPuntos + "," + userId + "," + id + "," + dif + "," + puntosStr + ");";
			PreparedStatement st = con.prepareStatement("INSERT INTO puntuacionSudokus (idPuntuacion,idUsuario,idSudoku,dif,puntuacion) VALUES (?,?,?,?,?)");
			st.setInt(1, idPuntos);
			st.setInt(2, userId);
			st.setInt(3, id);
			st.setInt(4, dif);
			st.setDouble(5, points);
			st.execute();
			st.close();
			s.close();
			rs.close();
		} catch (Exception e) {
			System.out.println("Error al registrar el dirver de MySQL:" + e);
		}
	}
}
