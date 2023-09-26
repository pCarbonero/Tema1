package ejerciciostema1parte2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Variable de la edad del usuario
		int edad;
		//variable string para saber si es mayor o menor de edad
		String mayor;
		//variable para el escaner
		Scanner sc = new Scanner(System.in);
		
		//pregunto la edad 
		System.out.println("Dime tu edad ");
		//guardo la edad en la variable
		edad = sc.nextInt();
		
		//comparo la edad para saber si es mayor de edad o no
		mayor = (edad>=18) ? "Eres mayor de edad" : "Eres menor de edad";
		//te digo si es true o false
		System.out.println(mayor);
		//cerramos el escaner
		sc.close();
		
		
	}
}
