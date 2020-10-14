import java.util.Scanner;

public class M06_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Escull opcio:");
		Scanner consola = new Scanner(System.in);
		int opcio = Integer.parseInt(consola.nextLine());
		consola.close();
		System.out.println("Opcio escollida:" + opcio);
		
		if (opcio == 1){
			System.out.println("Aqui programarem escriure els enters");
			
		}
		else {
			System.out.println("Aqui programarem la lectura");
		}
	}

}
