package ar.edu.unju.fi.ejercicio17.model;

import java.util.Calendar;

public class Jugador {
	private String nombre;
	private String apellido;
	private Calendar fecha_nacimiento;
	private String nacionalidad;
	private Float estatura;
	private Float peso;
	private String posicion;
	
	public int calcularEdad() {
		int edad;
		Calendar hoy = Calendar.getInstance();
		
		edad = hoy.get(Calendar.YEAR)-fecha_nacimiento.get(Calendar.YEAR);
		if(hoy.get(Calendar.MONTH)< fecha_nacimiento.get(Calendar.MONTH)) {
			edad--;
		}else if(fecha_nacimiento.get(Calendar.MONTH)==hoy.get(Calendar.MONTH)) {
			if(hoy.get(Calendar.DATE) < fecha_nacimiento.get(Calendar.DATE)) {
				edad--;
			}
		}
		return edad;
	}
	
	

	@Override
	public String toString() {
		return "Jugador [apellido=" + apellido + ", nombre=" + nombre + ", fecha_nacimiento=" 
				+ fecha_nacimiento.get(Calendar.DATE)+"/"
				+ fecha_nacimiento.get(Calendar.MONTH)+"/"
				+ fecha_nacimiento.get(Calendar.YEAR)
				+ ", nacionalidad=" + nacionalidad + ", estatura=" + estatura + ", peso=" + peso + ", posicion="
				+ posicion + "]";
	}



	public Jugador(String nombre, String apellido, Calendar fecha_nacimiento, String nacionalidad, Float estatura,
			Float peso, String posicion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nacimiento = fecha_nacimiento;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Calendar getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Calendar fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public Float getEstatura() {
		return estatura;
	}
	public void setEstatura(Float estatura) {
		this.estatura = estatura;
	}
	public Float getPeso() {
		return peso;
	}
	public void setPeso(Float peso) {
		this.peso = peso;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	
}
