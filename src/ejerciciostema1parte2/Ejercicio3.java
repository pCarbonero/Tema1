package ejerciciostema1parte2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//variable para almacenar el numero del usuario
		int num;
		//variable para el resto de el num / 2
		int resto;
		//para comaparar
		String par; 
		//Variable para el escaner 
		Scanner sc = new Scanner(System.in);
		
		//pregunto el num
		System.out.println("Dime un numero ");
		//guardo el num en la variable num
		num = sc.nextInt();
		
		//averiguo el resto de el numero / 2
		resto = num % 2;
		
		par = (resto == 0) ? "Tu numero es par " : "Tu numero es impar ";
		
		//Te digo sio tu numero es par o no
		System.out.println(par);
		
		//Cierro el escaer
		sc.close();
	}

}
