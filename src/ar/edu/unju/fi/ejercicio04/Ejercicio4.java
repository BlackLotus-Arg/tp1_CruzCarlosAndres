package ar.edu.unju.fi.ejercicio04;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingrese un numero entero del intervalo [0,10]");
		int numero = Integer.valueOf(scanner.nextLine());
		
		System.out.println(numero+"! = "+factorial(numero));
		
		scanner.close();
	}
	
	public static int factorial(int n){
		if(n==0){
			return 1;
		}
		int factorial = n*factorial(n-1);
		return factorial;
	}


}
