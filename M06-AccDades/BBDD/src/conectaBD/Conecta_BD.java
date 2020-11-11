package conectaBD;
import java.sql.*;

public class Conecta_BD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			// Conexió a la base de dades
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/provaabbdd","root","");
			
			//Crear objecte per enviar consultes (statement)
			Statement miStatement = miConexion.createStatement();
			
			//Executar SQL
			ResultSet miResultset= miStatement.executeQuery("SELECT * FROM tabla");
			
			//Lectura del resultat
			while(miResultset.next()) {
				System.out.println(miResultset.getString("CAMPTAULA") + " " + miResultset.getString("CAMPTAULA") + " " + miResultset.getString("CMPTL"));
			}
			
			
		}catch(Exception e) {
				System.out.println("No connecta a la base de dades");
				e.printStackTrace();
		}

	}

}
