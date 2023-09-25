package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Variables
		float precio, iva = 21, total;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cual es el precio del producto? ");
		precio = sc.nextFloat();
		
		total = precio + ((precio * iva)/100f);
		
		System.out.println("El precio total es de " + total + " euros");
		sc.close();
	}

}
