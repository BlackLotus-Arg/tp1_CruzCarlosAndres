package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[8];
		
		for(int i = 0; i<8; i++) {

			System.out.println("ingrese un numero entero: ");
			array[i]=sc.nextInt();
		}
		
		for(int i = 0; i<array.length; i++) {
			System.out.println("array["+i+"] = "+array[i]);
		}
		sc.close();
	}
}
