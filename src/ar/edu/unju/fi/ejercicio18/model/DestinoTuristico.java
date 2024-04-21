package ar.edu.unju.fi.ejercicio18.model;

public class DestinoTuristico {

	private Integer codigo;
	private String nombre;
	private Float precio;
	private Pais pais;
	private Integer cantidad_dias;
	
	public DestinoTuristico(Integer codigo, String nombre, Float precio, Pais pais, Integer cantidad_dias) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.pais = pais;
		this.cantidad_dias = cantidad_dias;
	}
	@Override
	public String toString() {
		return "DestinoTuristico:\n"
				+ "[codigo=" + codigo 
				+ ",\npais=" + pais
				+ ",\nnombre=" + nombre 
				+ ",\nprecio=" + precio 	
				+ ",\ncantidad_dias=" + cantidad_dias + "]";
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Integer getCantidad_dias() {
		return cantidad_dias;
	}
	public void setCantidad_dias(Integer cantidad_dias) {
		this.cantidad_dias = cantidad_dias;
	}
	
	
}
