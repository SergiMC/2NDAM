package conectaBD;
import java.sql.*;

public class ModBD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			// Conexió a la base de dades
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/provaabbdd","root","");
			
			//Crear objecte per enviar consultes (statement)
			Statement miStatement = miConexion.createStatement();
			String insertarSql = "INSERT INTO TABLA (Camps de la taula) VALUES ('valors dels camps que insertarem')";
			miStatement.executeUpdate(insertarSql);
			System.out.println("Dades insertades correctament");
			
		}catch(Exception e) {
				System.out.println("No connecta a la base de dades");
				e.printStackTrace();
		}

	}

}
