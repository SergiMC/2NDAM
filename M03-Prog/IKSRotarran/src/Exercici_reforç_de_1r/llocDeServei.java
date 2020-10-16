package Exercici_reforç_de_1r;

public class llocDeServei {
	private int ID;
	private String nom;
	private String descripcio;
	
	public int getID() {
		return ID;
	}
	
	public void setId(int ID) {
		this.ID = ID;
	}
	
	public String getNom(){
		return nom;
	}
		
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public String getDescripcio(){
		return descripcio;
	}
		
	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}
	
	
	protected llocDeServei(int ID, String nom, String descripcio){
		this.ID = ID;
		this.nom = nom;
		this.descripcio = descripcio;
		
	}
}
