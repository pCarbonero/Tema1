package ejerciciosentregatema1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//constantes para el precio de las entradas
		final float INFANTIL = 15.50f;
		final float ADULTO = 20f;
		final float DESCUENTO = 0.05f;
		
		//varaible para almacenar el numero de entrada
		int ticketInfantil, ticketAdulto;
		
		//varaible para almacenar el precio total y final con descuento o no
		float precioTotal, precioFinal;
		
		//varaible para el escaner 
		Scanner sc = new Scanner(System.in); 
	
		//pedimos el numero de entradas infantiles
		System.out.println("¿Cuánats entardas infantiles quieres comprar? ");
		//almacenamos el valor en la variable
		ticketInfantil = sc.nextInt();
		
		//pedimos el numero de enradas de adultos
		System.out.println("¿Cuánats entardas de adultos quieres comprar? ");
		//almacenamos el valor en la variable
		ticketAdulto = sc.nextInt();
		
		//hacemos el calculo y comparamo con 100 para saber si tenemos que aplicarle
		//el descuento
		
		precioTotal = ticketInfantil * INFANTIL + ticketAdulto * ADULTO;
		
		precioFinal = (precioTotal >= 100) ? precioTotal - (precioTotal * DESCUENTO) : precioTotal;
		
		//devolvemos el resultado por la consola
		System.out.println("El precio de todas las entradas es de " + precioFinal + "€");
		
		//cerramos el escaner
		sc.close();
	}

}
