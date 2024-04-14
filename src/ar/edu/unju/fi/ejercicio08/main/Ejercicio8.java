package ar.edu.unju.fi.ejercicio08.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio08.model.CalculadoraEspecial;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CalculadoraEspecial calc = new CalculadoraEspecial();;
		int n;
		
		System.out.println("ingrese un valor n para calcular:");
		n = sc.nextInt();
		sc.close();
		
		calc.setN(n);
		
		System.out.println(calc.calcularSumatoria());
		System.out.println(calc.calcularProductoria());
	}

}
