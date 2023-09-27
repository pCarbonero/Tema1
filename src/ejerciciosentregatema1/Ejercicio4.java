package ejerciciosentregatema1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Variable para la altura
		float h;
		//variable para la base
		float b;
		//variable para el area del triángulo
		float area;
		//variable para el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos la base del triángulo
		System.out.println("Dime la base de tu triangulo ");
		//Almacenamos el valo insertado en la variable
		b = sc.nextFloat();
		
		//Pedimos la altura del triángulo
		System.out.println("Dime la base de tu triangulo ");
		//Almacenamos el valo insertado en la variable
		h = sc.nextFloat();
		
		//Calculamos el area
		
		area = (b*h)/2;
		
		//Devolvemos el resultado por la consola
		System.out.println("El área del triángulo es de " + area);
		//cerramos el scaner
		sc.close();
		
	}

}
