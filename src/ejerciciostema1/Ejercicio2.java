package ejerciciostema1;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VARIABLES
		int n;
		Scanner sc = new Scanner(System.in); // variable del scanner
		
		System.out.println("¿Cuantos años tienes? ");
		n = sc.nextInt() + 1; // establece que n es el numero que insertes en la consola + 1 y permite
		                      // que podamos escribir algo
		
		System.out.println("El año que viene tendrás " + n);
		
		sc.close(); // cerramos el scannner
	}

}
