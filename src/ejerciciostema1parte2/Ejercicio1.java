package ejerciciostema1parte2;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		//para guardar la cantidad de kg de manzanas
		float manzanas;
		//para guardar la cantidad de kg de peras
		float peras;
		//variables para los precios/kg de manzanas y peras
		float precioManzanas;
		float precioPeras;
		float total;
		//variable para crear el escaner que guarda lo que escribes
		Scanner sc = new Scanner(System.in);
		
		//pregunto la cantidad de manzanas
		System.out.println("Cuantos kg de manzanas tienes? ");
		//guardo el valor insertado en la variable manzanas
		manzanas = sc.nextFloat();
		
		//pregunto por la cantidad de peras
		System.out.println("Cuantos kg de peras tienes? ");
		//guardo el valor insertado en la variable peras
		peras = sc.nextFloat();
		
		//calculo el valor de las manzanas
		precioManzanas = manzanas * 2.35f;
		
		//calculo el valor de las peras
		precioPeras = peras * 1.95f;
		
		//calculo las ganancias
		total = precioPeras + precioManzanas;
		
		//Devuelvo el resultado 
		System.out.println("Has ganado un total de " + total + " euros");
		
		
			
		}
	
	

}
