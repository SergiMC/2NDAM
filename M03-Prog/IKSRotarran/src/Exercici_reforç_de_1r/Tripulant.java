package Exercici_reforç_de_1r;

import java.time.LocalDateTime;

public class Tripulant {
	protected static final String bandol = "Imperi Klingon";
	protected String ID;
	protected String nom;
	protected boolean actiu;		
	protected LocalDateTime dataAlta;
	protected int departament;		
	private int llocDeServei;		


	protected int getLlocDeServei() {
		return llocDeServei;
	}
	
	protected void setLlocDeServei(int llocDeServei) {
		this.llocDeServei = llocDeServei;
	}

	protected Tripulant(String ID, String nom, boolean actiu, LocalDateTime dataAlta, int departament, int llocDeServei){
		this.ID = ID;
		this.nom = nom;
		this.actiu = actiu;
		this.dataAlta = dataAlta;
		this.departament = departament;
		this.llocDeServei = llocDeServei;
	}


}
