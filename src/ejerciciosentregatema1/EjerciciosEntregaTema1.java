package ejerciciosentregatema1;

import java.util.Scanner;

public class EjerciciosEntregaTema1 {

	public static void main(String[] args) {
		//Variable float para almacenar el numero con decimales
		float num;
		//variable float para guardar solo la parte decimal del 
		//numero introducido
		float decimal;
		//variable para sacar la comparacion  de la parte decimal con 0.5
		// y para guardar el valor redondeado
		int resultado;
					
		//variable Scanner para crear el escaner que recoge info del teclado
		Scanner sc = new Scanner(System.in);
		
		//pregunto al usuario por el numero para que lo introduzca
		System.out.println("Escribe un número ");
		
		//almaceno el numero que has introducido en la variable num
		num = sc.nextFloat();
		//calculo cual es la parte decimal del numero introducido para tenrlo por separado
		decimal = num - (int) num;
		
		//comparo la variable decimal con 0.5 para saber hacia donde hay que redondearlo
		//y lo almaceno en la variable
		resultado = (decimal >= 0.5f) ? ((int) num + 1) : ((int) num);
		
		
		//devuelvo por consola el resultado final
		System.out.println("Tu resultado es " + resultado);
		
		//cierro el escaner
		sc.close();
	}

}
