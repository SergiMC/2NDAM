package Exercici_reforç_de_1r;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class IKSRotarran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter formatData = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		
		Oficial capita =  new Oficial("001-A","Martok",true,LocalDateTime.parse("15-08-1954 00:01", formatData),1, 1, true, "Capitanejar la nau.");
		//Mariner mariner_02_03 = new Mariner("758-J","Kurak",true,LocalDateTime.parse("26-12-1981 13:42", formatData),3, 1, true, "Mariner encarregat del timó i la navegació durant el 2n torn.");
		System.out.println("Departament del capita = " + capita.departament);
		System.out.println("Descripcio del capita = " + capita.getDescripcioFeina());
		capita.departament = 10;
		System.out.println("Departament del capita canviat = " + capita.departament);
		System.out.println("Dades del capita:");
		capita.imprimirDadesTripulant();
	}

}
