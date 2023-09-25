package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Variables
		String edad, name;
		Scanner sc = new Scanner(System.in);

		System.out.println("Como te llamas?");
		name = sc.nextLine();
		
		System.out.println("Cuantos años tienes?");
		edad = sc.nextLine();
		
		
		System.out.println("Hola " +  name + ", tienes " + edad +  " años, ¡qué mayor eres!");
		sc.close();
	}

}
