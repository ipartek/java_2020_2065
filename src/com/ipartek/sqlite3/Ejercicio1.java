package com.ipartek.sqlite3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ejercicio1 {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = DriverManager.getConnection("jdbc:sqlite:ddbb/concesionario.db");
		
		String sql = "SELECT * FROM coche;";		
		PreparedStatement pst = conn.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		
		while( rs.next() ) {
			System.out.println( rs.getInt("id") + " " + rs.getString("nombre"));
			
		}
		
		
		
		System.out.println("terminamos");

	}

}
