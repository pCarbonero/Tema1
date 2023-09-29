package ejerciciosentregatema1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// variables de los numeros
		float num1, num2;
		
		//variable boleana para saer si es true o false
		boolean res;
		
		//variable para el escaner
		Scanner sc = new Scanner(System.in);
		
		//pedimos el num1
		System.out.println("Escribe un número ");
		//guardamos el valor insertado en la variable
		num1 = sc.nextFloat();
		
		//pedimos el num2
		System.out.println("Escribe un número ");
		//guardamos el valor insertado en la variable
		num2 = sc.nextFloat();
		
		//igualamos la booleana comparando los dos valores insertados 
		// para sabe si es true o false
		
		res = (num1 == num2);
		
		//devolvemos el valor po la consola
		System.out.println(res);
		
		//cerramos el escaner
		sc.close();

	}

}
