package ejerciciosentregatema1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Variable para  almacenar el numero entero
		int num;
		// int para almacenar cuanto le falta al numero para ser multiplo de 7
		int res;
		//constante para dividir num entre 7
		final int CONST = 7;
		//variable escaner para recoger info del teclado
		Scanner sc = new Scanner(System.in);
		
		// pedimo el numero entero 
		System.out.println("dame un numero entero ");
		//almaceno el numero insertado en la variable num
		num = sc.nextInt();
		
		//averiguo el resto del numero int entre 7
		res = CONST - ( num % CONST);
		
		//muestro en pantalla el numero 
		System.out.println("Para que sea múltiplo de 7 necesitas sumarle " + res);
		
		//cierro el escaner 
		sc.close();
		

	}

}
