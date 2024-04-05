package ar.edu.unju.ji.ejercicio6.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ar.edu.unju.ji.ejercicio6.model.Persona;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		String nombre;
		int dni;
		LocalDate fecha_nacimiento;
		String provincia;
		
		System.out.println("Ingrese los datos de persona1:");
		
		System.out.println("nombre:");
		nombre = scanner.nextLine();
		System.out.println("dni:");
		dni = Integer.valueOf(scanner.nextLine());
		System.out.println("fecha de nacimiento (dd-mm-yyyy):");
		fecha_nacimiento = LocalDate.parse(scanner.nextLine(), formatter);
		System.out.println("provincia:");
		provincia = scanner.nextLine();
		
		Persona persona1 = new Persona();
		
		persona1.setNombre(nombre);
		persona1.setDni(dni);
		persona1.setFecha_nacimiento(fecha_nacimiento);
		persona1.setProvincia(provincia);
		
		System.out.println("Ingrese los datos de persona2:");
		
		System.out.println("nombre:");
		nombre = scanner.nextLine();
		System.out.println("dni:");
		dni = Integer.valueOf(scanner.nextLine());
		System.out.println("fecha de nacimiento (dd-mm-yyyy):");
		fecha_nacimiento = LocalDate.parse(scanner.nextLine(), formatter);
		System.out.println("provincia:");
		provincia = scanner.nextLine();
		
		Persona persona2 = new Persona(dni, nombre, fecha_nacimiento, provincia);
		
		System.out.println("Ingrese los datos de persona3:");
		
		System.out.println("nombre:");
		nombre = scanner.nextLine();
		System.out.println("dni:");
		dni = Integer.valueOf(scanner.nextLine());
		System.out.println("fecha de nacimiento (dd-mm-yyyy):");
		fecha_nacimiento = LocalDate.parse(scanner.nextLine(), formatter);
		
		scanner.close();
		
		Persona persona3 = new Persona(dni, nombre, fecha_nacimiento);
		
		System.out.println("###############################");
		persona1.mostrarDatos();
		System.out.println("\n###############################");
		persona2.mostrarDatos();
		System.out.println("\n###############################");
		persona3.mostrarDatos();
	}

}
