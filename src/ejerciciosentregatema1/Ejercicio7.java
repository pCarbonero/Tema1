package ejerciciosentregatema1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//variable distancia en milimetros, centimetros y metros
		float mm, cm, m, mmToCm, mToCm;
		
		//variable para el resultad en cm
		float cmRes;
		
		//Varaible para el escaner
		Scanner sc = new Scanner(System.in);
		
		//Constante para pasar de mm a cm
		final float CONST_MM = 10;
		
		//variable para pasar de m a cm
		final float CONST_M = 100;
		
		//pedimos la medida en mm
		System.out.println("Dime una medida en milimetros ");
		//registramos el valor insertdo a la variable
		mm = sc.nextFloat();
		
		//pedimos la medida en cm
		System.out.println("Dime una medida en centimetros ");
		//registramos el valor insertdo a la variable
		cm = sc.nextFloat();
		
		//pedimos la medida en m
		System.out.println("Dime una medida en metros ");
		//registramos el valor insertdo a la variable
		m = sc.nextFloat();
		
		//pasamos la medida en mm a cm
		mmToCm = mm/CONST_MM;
		//pasamos la medida en m a cm
		mToCm = m*CONST_M;
		
		//hacemos la suma de las 3 medidas en cm
		cmRes = mmToCm + mToCm + cm;
		
		//devolvemos el resultado por la consola
		System.out.println("El resultado de la suma en centimetro es de " + cmRes);
		
		//Cerramos el escaner
		sc.close();
		
		

	}

}
