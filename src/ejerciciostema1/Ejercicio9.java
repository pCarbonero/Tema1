package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Variables
		float euro, peseta;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el valor de las pesetas ");
		peseta = sc.nextFloat();
		
		euro = peseta/166f;
		
		System.out.println("Tienes " + euro + " euros");
		sc.close();
	}

}
