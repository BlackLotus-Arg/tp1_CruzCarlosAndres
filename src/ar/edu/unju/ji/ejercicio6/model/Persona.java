package ar.edu.unju.ji.ejercicio6.model;


import java.time.LocalDate;

public class Persona {
	private int dni;
	private String nombre;
	private LocalDate fecha_nacimiento;
	private String provincia;

	public Persona() {
		
	}

	public Persona(int dni, String nombre, LocalDate fecha_nacimiento, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.provincia = provincia;
	}

	public Persona(int dni, String nombre, LocalDate fecha_nacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.provincia = "Jujuy";
	}


	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int calcularEdad(){
		return LocalDate.now().getYear() - this.fecha_nacimiento.getYear();
	}
	
	public boolean mayorDeEdad() {
		return this.calcularEdad() > 18;
	}
	
	public void mostrarDatos() {
		
		System.out.println("nombre: "+this.nombre);
		System.out.println("dni: "+this.dni);
		System.out.println("fecha de nacimiento: "+this.fecha_nacimiento);
		System.out.println("provincia: "+this.provincia);
		if(this.mayorDeEdad()) {
			System.out.println("La persona es mayor de edad.");
		}else {
			System.out.println("La persona NO es mayor de edad.");
		}
	}
	
	
}
