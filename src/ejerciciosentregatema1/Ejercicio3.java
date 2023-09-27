package ejerciciosentregatema1;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		// Variable para  almacenar el numero entero
		int num1;
		// Variable para almacenar de que numero num1 tiene que ser multiplo
		int num2;
		// int para almacenar cuanto le falta al numero para ser multiplo de num1
		int res;
		
		//variable escaner para recoger info del teclado
		Scanner sc = new Scanner(System.in);
		
		// pedimo el numero entero 
		System.out.println("dame un numero entero ");
		//almaceno el numero insertado en la variable num1
		num1 = sc.nextInt();
		
		// pedimo el numero del que tiene que ser multiplo
		System.out.println("dame un numero entero ");
		//almaceno el numero insertado en la variable num2
		num2 = sc.nextInt();
		
		
		//averiguo el resto del num1 entre num2
		res = ( num1 % num2);
		
		//hago que si el resto es distinto de 0 averigue cuanto le falta para ser multiplo
		res = (res == 0) ? res: num2 - res;
		
		//muestro en pantalla el numero 
		System.out.println("Para que sea múltiplo de " + num2 + " necesitas sumarle " + res);
		
		//cierro el escaner 
		sc.close();
		

	}

}
