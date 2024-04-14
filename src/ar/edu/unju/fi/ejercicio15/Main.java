package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] array;
		
		int num;
		
		boolean flag = true;
		do {
			System.out.println("ingrese un numero entero:");
				num = sc.nextInt();
			if(3<=num && num<=10) {
				flag=false;
			}
		}while(flag);
		
		array = new String[num];
		
		System.out.println("Ingrese los valores para cada posicion:");
		for(int i = 0; i<array.length; i++) {

			System.out.print("array["+i+"]= ");
			array[i]=sc.next();
		}
		
		System.out.println("\nValores desde el primer indice:");
		for(int i = 0; i<array.length; i++) {
			System.out.println("array["+i+"] = "+array[i]);
		}
		
		System.out.println("\nValores desde el ultimo indice:");
		for(int i = array.length-1; 0<=i; i--) {
			System.out.println("array["+i+"] = "+array[i]);
		}
		
		sc.close();
	}

}
