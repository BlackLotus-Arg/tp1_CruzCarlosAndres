package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	private String nombre;
	private Calendar fecha_nacimiento;
	
	public Persona(String nombre, Calendar fecha_nacimiento) {
		this.nombre = nombre;
		
		this.fecha_nacimiento = fecha_nacimiento;
		
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Calendar fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	public String fecha_nacimiento() {
		return fecha_nacimiento.get(Calendar.DATE)+"/"+fecha_nacimiento.get(Calendar.MONTH)+"/"+fecha_nacimiento.get(Calendar.YEAR);
	}

	public int edad() {
		
		Calendar hoy = Calendar.getInstance();
		int edad = hoy.get(Calendar.YEAR)-fecha_nacimiento.get(Calendar.YEAR);
		
		if(fecha_nacimiento.get(Calendar.MONTH) > hoy.get(Calendar.MONTH)) {
			edad--;
		}else if(fecha_nacimiento.get(Calendar.MONTH) == fecha_nacimiento.get(Calendar.MONTH)) {
			if(fecha_nacimiento.get(Calendar.DATE) > hoy.get(Calendar.DATE)) {
				edad--;
			}
		}
		return edad;
	}
	
	public String estacion() {
		//fechas segun https://www.clima.com/meteopedia/hemisferio-sur
		Calendar summer = Calendar.getInstance();
		summer.set(Calendar.DATE, 21);
		summer.set(Calendar.MONTH, Calendar.DECEMBER);
		summer.set(Calendar.YEAR,fecha_nacimiento.get(Calendar.YEAR));
		Calendar autumn = Calendar.getInstance();
		autumn.set(Calendar.DATE, 21);
		autumn.set(Calendar.MONTH, Calendar.MARCH);
		autumn.set(Calendar.YEAR,fecha_nacimiento.get(Calendar.YEAR));
		Calendar winter = Calendar.getInstance();
		winter.set(Calendar.DATE, 21);
		winter.set(Calendar.MONTH, Calendar.JUNE);
		winter.set(Calendar.YEAR,fecha_nacimiento.get(Calendar.YEAR));
		Calendar spring = Calendar.getInstance();
		spring.set(Calendar.DATE, 21);
		spring.set(Calendar.MONTH, Calendar.SEPTEMBER);
		spring.set(Calendar.YEAR,fecha_nacimiento.get(Calendar.YEAR));
		
		if(fecha_nacimiento.after(autumn)) {
			if(fecha_nacimiento.after(winter)) {
				if(fecha_nacimiento.after(spring)) {
					if(fecha_nacimiento.after(summer)) {
						System.out.println(summer.get(Calendar.DATE)+"/"+(summer.get(Calendar.MONTH)+1)+"/"+summer.get(Calendar.YEAR));
						return "Verano";
					}
					return "Primavera";
				}
				return "Invierno";
			}
			return "Otoño";
		}
		
		return "Verano";
	}
	
	public String zodiaco() {
		
		// fuente de los fechas que comprenden los zignos https://es.wikipedia.org/wiki/Zodiaco
		String res="Capricornio";
		
		int[] intervalos_zodiaco = {30, 29, 31, 30, 31, 32, 32, 30, 31, 30, 29,30};
		String[] nombres_zodiaco = {"Capricornio","Acuario","Piscis","Aries","Tauro","Geminis","Cancer","Leo","Virgo","Libra","Escorpio","Sagitario"};
		
		Calendar cambio_zodiaco = Calendar.getInstance();
		
		cambio_zodiaco.set(Calendar.YEAR, fecha_nacimiento.get(Calendar.YEAR));
		cambio_zodiaco.set(Calendar.MONTH, Calendar.JANUARY);
		cambio_zodiaco.set(Calendar.DATE, 20);
		
		for(int i=0;i<=11;i++ ) {
			if(fecha_nacimiento.before(cambio_zodiaco)) {
				res=nombres_zodiaco[i]; 
				return res;
			}

			cambio_zodiaco.add(Calendar.DATE, intervalos_zodiaco[i]);
		}
		
		return res;
		
	}
}
