package ar.edu.unju.fi.ejercicio1;

public class Ejercicio1 {
	//Dentro del paquete creado para el ejercicio crear la clase Main que contenga al método main().
	//Declare 5 variables de tipo entero para almacenar valores numéricos.
	//Asigne valores numéricos a cada una de las variables.
	//Calcule el promedio y guarde el resultado en otra variable. Muestre por consola el resultado 
	//obtenido.

	public static void main(String[] args) {
		
		int val_1;		
		int val_2;
		int val_3;
		int val_4;
		int val_5;
		
		val_1 = 8;		
		val_2 = 5;
		val_3 = 1;
		val_4 = 20;
		val_5 = 9;
		
		
		float promedio = (val_1+val_2+val_3+val_4+val_5)/5f;
		
		System.out.println(promedio);
	}  
}
