import java.io.File;

public class Comp_files {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir1 = new File ("/tmp/provadir1");
		File dir2 = new File ("/tmp/provadir2");
		for (File fill1 : dir1.listFiles()) {
			for (File fill2 : dir2.listFiles()) {
				if (fill1.getName().equals(fill2.getName())){
					System.out.println(" El fitxer " + "'" + fill1.getName() + "'" + " es igual al fitxer " + "'" + fill2.getName() + "'");
					if (fill1.lastModified() != fill2.lastModified()) {
						if (fill1.lastModified() > fill2.lastModified()) {
							System.out.println("El fitxer" + "'" + fill1.getName() + "'" + " al directori A és mes nou que el fitxer " + "'" + fill2.getName() + "'" + " al directori B");
						}
						else {
							System.out.println("El fitxer" + "'" + fill2.getName() + "'" + " al directori B és mes nou que el fitxer " + "'" + fill2.getName() + "'" + " al directori A");
						}
					}
					else 
						System.out.println("Tenen la mateixa data");
					
					if (fill1.length() != fill2.length()) {
						if (fill1.length() > fill2.length()) {
							System.out.println("El fitxer" + "'" + fill1.getName() + "'" + " al directori A és mes gran que el fitxer " + "'" + fill2.getName() + "'" + " al directori B");						}
						else  {
							System.out.println("El fitxer" + "'" + fill2.getName() + "'" + " al directori B és mes gran que el fitxer " + "'" + fill2.getName() + "'" + " al directori A");
						}
					}
					else
						System.out.println("Tenen la mateixa mida");									
		}
				else
					System.out.println(" El fitxer " + "'" +fill1.getName() + "'" + " no es igual al fitxer " + "'" + fill2.getName() + "'");
	}
  }
 }
}
