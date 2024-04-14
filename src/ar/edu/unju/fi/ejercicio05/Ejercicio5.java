package ar.edu.unju.fi.ejercicio05;
import java.util.Scanner;


public class Ejercicio5 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("ingrese un numero entero del intervalo [1,9]");
			int num = Integer.valueOf(scanner.nextLine());
			
			scanner.close();
			
			for(int i = 0 ; i<=10 ; i++ ){
				System.out.println(num+" x "+i+" = "+num*i);
			}
	}

}
