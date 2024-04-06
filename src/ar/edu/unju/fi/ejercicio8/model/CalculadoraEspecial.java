package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	private int n;
	
	public CalculadoraEspecial() {
		
	}
	
	public int getN() {
		return this.n;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	public float calcularSumatoria() {
		float respuesta = 0;
		for(int i=1;i<=this.n;i++) {	
			respuesta+=Math.pow((i*(i+1)/2),2f);
		}
		
		return respuesta;
	}
	
	public int calcularProductoria() {
		int respuesta = 1;
		for(int i=1;i<=this.n;i++) {
			respuesta*=i*(i+4);
		}
		return respuesta;
	}
}
