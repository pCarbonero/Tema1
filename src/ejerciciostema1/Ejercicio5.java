package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Variables
		float radio, longitud, area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cual es el radio del circulo ");
		radio = sc.nextFloat();
		
		longitud = (float) (2 * Math.PI * radio);
		area = (float) (Math.PI * (Math.pow(radio, 2)));
		System.out.println("La longitud es " + longitud);
		System.out.println("El area es " + area);
		sc.close();

	}

}
