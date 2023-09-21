package ejerciciostema1;
import java.util.Scanner;


public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int edad;
		int anyoActual;
		int anyoNacimiento;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("En que año estamos: ");
		anyoActual = sc.nextInt();
		
		System.out.println("En que año naciste: ");
		anyoNacimiento = sc.nextInt();
		
		edad = anyoActual - anyoNacimiento;
		
		System.out.println("Tienes " + edad + " años");
		
		sc.close();
	}

}
