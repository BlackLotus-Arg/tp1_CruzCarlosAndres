package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Persona persona;
		
		String nombre;
		
		String str_nacimiento;
		Calendar fecha_nacimiento = Calendar.getInstance();
		
		
		System.out.println("ingrese el nombre de la persona:");
		nombre = sc.next();
		
		System.out.println("ingrese la fecha de nacimento (en formato 'dd/mm/yyyy'):");
		str_nacimiento = sc.next();
		
		fecha_nacimiento.set(Calendar.DATE, Integer.valueOf( str_nacimiento.substring(0,2)));
		fecha_nacimiento.set(Calendar.MONTH, (Integer.valueOf( str_nacimiento.substring(3,5))-1));
		fecha_nacimiento.set(Calendar.YEAR, Integer.valueOf( str_nacimiento.substring(6,10)));
		
		
		persona = new Persona(nombre, fecha_nacimiento);
	
		System.out.println("\n");
		System.out.println("Nombre: "+nombre);
		System.out.println(str_nacimiento);
		System.out.println("Edad: "+persona.edad());
		System.out.println("Zodiaco: "+persona.zodiaco());
		System.out.println("Nacio en: "+persona.estacion());
		
		sc.close();
	
	}
}
