package packetExamen;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/*
Sergi Muñoz Carmona
2n DAM
*/

public class ComprovacioRendiment {
	int[] coordenadesTmp = null;
	List<Waypoint_Dades> llistaArrayList;		// = new ArrayList<Waypoint_Dades>();	// Lo del "new ArrayList<Waypoint_Dades>()" s'ha de fer en el constructor perquè sinò no crea la llista.
	
	List<Waypoint_Dades> llistaLinkedList;		// Com que el tipus és List tot i que fem un new ArrayList/LinkedList, només tindrem accés als mètodes definits per la interface List.
	
	//Waypoint_Dades waypoint;					// La idea és que en les llistes tots els elements siguin un clon d'aquest waypoint. El problema
												// és que al fer:
												//		comprovacioRendimentTmp.llistaArrayList.add(comprovacioRendimentTmp.waypoint);
												// estem ficant el mateix waypoint (el mateix objecte) en totes les posicions de la llista de manera
												// que al fer 1 canvi en un waypoint de la llista, es canvia en tots els altres (perquè en realitat
												// són el mateix objecte).
	// Qualsevol cosa que creem amb new() serà un objecte i per tant, quan el copiem d'un lloc a un altre, en realitat lo que estem fent es copiar el punter a l'objecte i no el propi objecte.
	// Això implica que si creo 1 objete i el copio en 30 posicions diferents d'un array, en realitat estarè copiant el punter a l'objecte de manera que quan modifiqui l'objete d'1 de les 
	// posicions en realitat estarè modificant l'objecte i per tant des de les altres 29 posicions veuran el canvi que hagi fet (perquè en les 30 posicions hi ha un punter a l'objecte i no
	// el propi objecte).
	
	LinkedList<Waypoint_Dades> llistaWaypoints = new LinkedList<Waypoint_Dades>();
	LinkedHashMap<Integer, Waypoint_Dades> mapaWaypoints;
	
	Waypoint_Dades wtmp;
	public Deque<Waypoint_Dades> pilaWaypoints;
	
	public ArrayList<Ruta_Dades> llistaRutes;
	
	public LinkedHashMap<Integer, Ruta_Dades> mapaLinkedDeRutes;
	
	
	
	public ComprovacioRendiment() {
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		
		this.coordenadesTmp = new int[] {0,0,0};
		this.llistaArrayList = new ArrayList<Waypoint_Dades>();		//
		this.llistaLinkedList = new LinkedList<Waypoint_Dades>();
		//this.waypoint = new Waypoint_Dades(0, "Òrbita de la Terra", coordenadesTmp, true, LocalDateTime.parse("15-08-1954 00:01", formatter), null, null);
		this.wtmp = null;
		this.pilaWaypoints = new ArrayDeque<Waypoint_Dades>();
		this.llistaRutes = new ArrayList<Ruta_Dades>();
		this.mapaLinkedDeRutes = new LinkedHashMap<Integer, Ruta_Dades>();
	}
	
	
}
