package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private int legajo;
	private float salario;
	
	private final float basico = 210000.00f;
	private final float aumento_por_merito = 20000.00f;
	
	public Empleado(String nombre, int legajo, float salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		if(this.basico <= salario) {
			this.salario = salario;
		}else {
			this.salario = this.basico;
		}
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre del empleado: "+this.nombre);
		System.out.println("Legajo: "+this.legajo);
		System.out.println("Salario: "+this.salario);
	}
	
	public void darAumento() {
		this.salario += aumento_por_merito;
	}
}
