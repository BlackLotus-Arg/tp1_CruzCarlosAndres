package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private int diametro;
	private float precio;
	private double area;
	private boolean especial;
	private final int especial_20=500;
	private final int especial_30=750;
	private final int especial_40=1000;
	
	public Pizza() {
		
	}
	
	public void calcularPrecio() {
		if(this.diametro==20) {
			precio = especial?4500+especial_20:4500;
		}else if(this.area==30) {
			precio = especial?4800+especial_30:4800;
		}else {
			precio = especial?5500+especial_40:5500;
		}
		
		
	}
	
	public void calcularArea() {
		this.area = Math.PI*Math.pow(diametro/2,2);
	}
	
	
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public float getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public boolean isEspecial() {
		return especial;
	}
	public void setEspecial(boolean especial) {
		this.especial = especial;
	}
}
