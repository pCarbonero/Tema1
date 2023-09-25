package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Variables
		String name, dir, num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime tu nombre: ");
		name = sc.nextLine();
		
		System.out.println("Dime tu dirección: ");
		dir = sc.nextLine();
		
		System.out.println("Dime tu tlfn: ");
		num = sc.nextLine();
		
		System.out.println("Nombre: " + name);
		System.out.println("Dirección: " + dir);
		System.out.println("Teléfono: " + num);
		sc.close();

	}

}
