package db;

import java.sql.*;

import modelo.CatalogoUsuarios;
import modelo.Usuario;

public class DataUsuarios {
	private String url = "jdbc:ucanaccess://C://TEMP//usuarios.accdb";
	private static DataUsuarios mDataUsuarios;
	
	private DataUsuarios() {}
	
	public static DataUsuarios getData() {
		if (mDataUsuarios == null) mDataUsuarios = new DataUsuarios();
		return mDataUsuarios;
	}
	
	public void comprobarUsuario(String name) throws SQLException{
			Connection con = DriverManager.getConnection(url);
			Statement s = con.createStatement();
			ResultSet rs1 = s.executeQuery("SELECT * FROM usuario WHERE nombreUsuario = \"" + name + "\"");
			if (!rs1.next()) {
				String st = "1";
				s = con.createStatement();
				rs1 = s.executeQuery("SELECT id FROM usuario");
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
		try {
			Connection con = DriverManager.getConnection(url);
			Statement s = con.createStatement();
			String query = "SELECT * FROM usuario ORDER BY mejorPuntuacion DESC";
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
			e.printStackTrace();
		}
		
	}
	
	public void anadirRegistro(String user, int id, int dif, double points) {
		try {
			Connection con = DriverManager.getConnection(url);
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
			e.printStackTrace();
		}
	}
}
