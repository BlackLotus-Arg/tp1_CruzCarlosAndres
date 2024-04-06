package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//nombre,legajo,salario
		
		System.out.println("ingrese el nombre del empleado: ");
		String nombre = scanner.nextLine();
		System.out.println("ingrese el numero de legajo: ");
		int legajo = Integer.valueOf(scanner.nextLine());
		System.out.println("ingrese el salario: ");
		float salario = Float.valueOf(scanner.nextLine());
		
		scanner.close();
		
		Empleado empleado = new Empleado(nombre, legajo, salario);
		
		System.out.println("\n");
		empleado.mostrarDatos();
		
		empleado.darAumento();
		
		System.out.println("\n");
		empleado.mostrarDatos();
	}

}
