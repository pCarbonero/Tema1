package ejerciciostema1parte2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//variable biblioteca para saber si va a la biblio o no
		boolean biblioteca;
		boolean noLLueve;
		boolean acabado;
		String salir;
		
		
		
		Scanner sc = new Scanner(System.in);
		
		//pregunto si no está lloviendo
		System.out.println("no Llueve ");
		noLLueve = sc.nextBoolean();
		
		//pregunto si ha acbado los deberes
		System.out.println("Has acabado ");
		acabado = sc.nextBoolean();
		
		//pregunto si vas a la biblioteca
		System.out.println("vas a la biblioteca?  ");
		biblioteca = sc.nextBoolean();
		
		/*De esta forma comparamos si va a la biblio con lo demas, al ser || es "o" 
		  entonces si una de las dos es true te devolverá true, entonces si biblio es 
		  true si va a salir true independientemente de lo demas. Si biblio
		  es false entonces depende de los otros que si o si tienen que ser iguales*/
		
		salir = biblioteca || (noLLueve && acabado) ? "SI sales" : "NO sales";
		
		//cierro el escaner
		sc.close();
		
		System.out.println(salir);
	}

}
