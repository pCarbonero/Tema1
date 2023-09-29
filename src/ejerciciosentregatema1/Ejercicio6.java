package ejerciciosentregatema1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//creamos la variable de los segundos solicitados
		int segundosSolicitados;
		// creamos las variables para almacenar los resultados
		int seg, min, h;
		//variable escaner
		Scanner sc = new Scanner(System.in);
		//constante para pasar a horas a segundos
		final int HORASSEGUNDOS = 3600;
		//constante para pasar los minutos a segundos
		final int MINUTOSSEGUNDOS = 60;
		
		//pedimos los segundos
		System.out.println("Dame una cantidad de tiempos en segundos ");
		//guardamos el valor en la variable
		segundosSolicitados = sc.nextInt();
		
		//calculamos las horas
		h = segundosSolicitados/HORASSEGUNDOS;
		//calculamos los minutos
		min = (segundosSolicitados%HORASSEGUNDOS)/MINUTOSSEGUNDOS;
		//calculamos los segundos
		seg = (segundosSolicitados%HORASSEGUNDOS)%MINUTOSSEGUNDOS;
		
		//devolvemos el resultado por consola
		System.out.println("Horas: " + h);
		System.out.println("Minutos: " + min);
		System.out.println("Segundos: " + seg);
		
		//cerramos el ecaner
		sc.close();

	}

}
