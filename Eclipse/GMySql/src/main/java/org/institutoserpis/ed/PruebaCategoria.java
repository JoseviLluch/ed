package org.institutoserpis.ed;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
public class PruebaCategoria {
	
	public static void main(String[]args) throws SQLException{
		System.out.println("GMySql inicio");
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost/dbprueba",
				"root",
				"sistemas"
				);
		//TODO lo que quieras hacer...
		//Leer los registros de la tabla categoria
		Statement selectStatement = connection.createStatement();
		ResultSet resultSet = selectStatement.executeQuery("select * from categoria");
		while (resultSet.next())
			System.out.printf("id=%s nombre=%s \n", resultSet.getObject("id"),
					resultSet.getObject("nombre"));
			selectStatement.close();
		
		
		
		connection.close();
		System.out.println("fin");
	}

}
