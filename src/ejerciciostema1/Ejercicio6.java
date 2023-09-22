package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		//variables
		float n1, n2, suma, resta, mult, div;
		Scanner sc = new Scanner(System.in);
		
		//cosas 
		System.out.println("Escribe un número: ");
		n1 = sc.nextFloat();
		System.out.println("Dame otro número: ");
		n2 = sc.nextFloat();
		
		suma = n1 + n2;
		resta = n1 - n2;
		mult = n1 * n2;
		div = n1 / n2;
		
		System.out.println("El resultado de la suma es " + suma);
		System.out.println("El resultado de la resta es " + resta);
		System.out.println("El resultado de la multiplicación es " + mult);
		System.out.println("El resultado de la división es " + div);

		sc.close();
		
	}
	
	
}
