package db;

import java.sql.*;


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
}
