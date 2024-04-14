package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] array;
		
		int num;
		
		byte indice;
		
		boolean flag = true;
		do {
			System.out.println("ingrese la longitud del array:");
				num = sc.nextInt();
			if(3<=num && num<=10) {
				flag=false;
			}
		}while(flag);
		
		array = new String[num];
		
		System.out.println("Ingrese un nombre para cada posicion:");
		for(int i = 0; i<array.length; i++) {

			System.out.print("array["+i+"]= ");
			array[i]=sc.next();
		}
		
		System.out.println("\nValores desde el primer indice:");
		
		int counter = 0;
		while(counter<array.length) {
			System.out.println("array["+counter+"] = "+array[counter]);
			counter++;
		}
		
		System.out.println("longitud del array: "+array.length);
		
		do {
		System.out.println("ingrese el indice del nombre para eliminar:");
		indice=sc.nextByte();
		
		}while(0>=indice && indice>=array.length);
		
		for(int i = indice;i<array.length-1;i++) {
			array[i]=array[i+1];
		}
		
		array[array.length-1]="-";

		for(int i = 0; i < array.length; i++) {
			System.out.println("array["+i+"] = "+array[i]);
		}
		
		sc.close();
	}
}
