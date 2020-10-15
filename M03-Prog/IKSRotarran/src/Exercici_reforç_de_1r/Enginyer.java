package Exercici_reforç_de_1r;

import java.time.LocalDateTime;


public class Enginyer extends Tripulant {
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
	
	
	protected Enginyer (String ID, String nom, boolean actiu, LocalDateTime dataAlta, int departament, int llocDeServei, boolean serveiEnElPont, String descripcioFeina){
		super(ID, nom, actiu, dataAlta, departament, llocDeServei);
		this.serveiEnElPont = serveiEnElPont;
		this.descripcioFeina = descripcioFeina;
	}
	
	
	
}
