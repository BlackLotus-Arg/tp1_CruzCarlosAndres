package ar.edu.unju.fi.ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingrese un numero");
		
		int numero = Integer.valueOf(scanner.nextLine());
		
		scanner.close();
		
		if(numero%2==0){
			System.out.println("par");
			System.out.println(numero*2);
		}else{
			System.out.println("impar");
			System.out.println(numero*3);
		}

	}

}
