package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Variables
		int nota1;
		int nota2;
		float media;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Nota del primer examen: ");
		nota1 = sc.nextInt();
		
		System.out.println("Nota del segundo examen: ");
		nota2 = sc.nextInt();
		
		media =(float) (nota1 + nota2) / 2;
		System.out.println("Tu nota media es de: " + media);
		
		
		sc.close();
		
	}

}
