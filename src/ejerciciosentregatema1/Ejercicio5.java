package ejerciciosentregatema1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// creamos las variables de los valores a, b, c y x
		float a, b, c, x;
		//variable para almacenar el resultado
		float y;
		//varaible para el esaner que recpge info del teclado
		Scanner sc = new Scanner(System.in);
		
		//pedimos los distintos valores
		System.out.println("Escribe un valor para a");
		//almacenamos el valor introducid en la variable
		a = sc.nextFloat();
		
		//pedimos los distintos valores
		System.out.println("Escribe un valor para b");
		//almacenamos el valor introducid en la variable
		b = sc.nextFloat();
		
		//pedimos los distintos valores
		System.out.println("Escribe un valor para c");
		//almacenamos el valor introducid en la variable
		c = sc.nextFloat();
		
		//pedimos los distintos valores
		System.out.println("Escribe un valor para x");
		//almacenamos el valor introducid en la variable
		x = sc.nextFloat();
		
		//escribimos el calculo
		y = (float) Math.pow(x, 2f) + b*x + a;
		
		//devolvemos el valor por consola
		System.out.println("El valor de y es de " + y);

	}

}
