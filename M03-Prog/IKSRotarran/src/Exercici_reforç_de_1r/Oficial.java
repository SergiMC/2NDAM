package Exercici_reforç_de_1r;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Oficial extends Tripulant {
	private boolean serveiEnElPont;
	private String descripcioFeina;
	
	public boolean isServeiEnElPont() {
		return serveiEnElPont;
	}

	public void setServeiEnElPont(boolean serveiEnElPont) {
		this.serveiEnElPont = serveiEnElPont;
	}

	public String getDescripcioFeina() {
		return descripcioFeina;
	}

	public void setDescripcioFeina(String descripcioFeina) {
		this.descripcioFeina = descripcioFeina;
	}
	
	
	protected Oficial (String ID, String nom, boolean actiu, LocalDateTime dataAlta, int departament, int llocDeServei, boolean serveiEnElPont, String descripcioFeina){
		super(ID, nom, actiu, dataAlta, departament, llocDeServei);
		this.serveiEnElPont = serveiEnElPont;
		this.descripcioFeina = descripcioFeina;
	}
	
	protected void imprimirDadesTripulant(){
		DateTimeFormatter formatData = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        
        System.out.println("Dades Tripulant: \n" + " Bandol: " + bandol + "\n " 
        + "ID" + super.ID + "\n Nom: " + nom + "\n Actiu: " + actiu + "\n Departament: " 
        + departament + "\n LlocDeServei: " + super.getLlocDeServei()+ "\n Descripcio feina: " +
        descripcioFeina + "\n Serveix en pont: " + isServeiEnElPont() + "\n Data Alta: " 
        + dataAlta.format(formatData));
        
        }
	
	
	
}
