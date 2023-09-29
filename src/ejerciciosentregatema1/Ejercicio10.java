package ejerciciosentregatema1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// variable para guardar el valor del lanzamiento en metros
		double metros;
		
		//variable para guardar el resultado
		int res;
		
		//constante para pasar de metros a centimietros 
		final int CONVERSOR = 100;
		
		//creamos la variable escaner
		Scanner sc = new Scanner(System.in);

		//pedimos el valor en metros por la consola
		System.out.println("Dime en metros la longitud de un lanzamiento"  );
		//guardamos el valor insertado en la variable
		metros = sc.nextDouble();
		
		//hacemos la conversion a cm y nos quedamos con la parte entrea usando 
		// la conversión de tipos
		res = (int) (metros * CONVERSOR);
		

		//devolvemos el resultado por la consola 
		System.out.println("La longitu en cm es de " + res + "cm");
		
		//cerramos el escaner
		sc.close();
		
	}

}
