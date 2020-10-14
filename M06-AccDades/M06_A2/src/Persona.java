import java.io.File;

public class Persona {
	String nom;
	int edat;
	
	public Persona (String nom, int edat) {
		this.nom = nom;
		this.edat = edat;
	}
	
	public Persona (File ruta) {
		
		
	}
	
	public void imprimir () {
		System.out.println("Nom: "+this.nom);
		System.out.println("Edat: "+this.edat);
	}
}
