package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] array;
		
		int num;
		
		boolean flag = true;
		do {
			System.out.println("ingrese un numero entero:");
				num = sc.nextInt();
			if(3<=num && num<=10) {
				flag=false;
			}
		}while(flag);
		
		array = new int[num];
		
		System.out.println("Ingrese los valores para cada posicion:");
		for(int i = 0; i<array.length; i++) {

			System.out.print("array["+i+"]= ");
			array[i]=sc.nextInt();
		}
		
		System.out.println("\nLos valores de cada posicion son:");
		for(int i = 0; i<array.length; i++) {
			System.out.println("array["+i+"] = "+array[i]);
		}
		sc.close();
	}

}
