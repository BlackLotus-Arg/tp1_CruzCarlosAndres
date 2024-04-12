package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Producto producto = new Producto();

		
		String nombre;
		int codigo;
		float precio;
		int descuento;
		
		boolean flag=true;
		
		int contador=1;
		do {
			System.out.println("## PRODUCTO "+(contador)+" ##");
			System.out.println("ingrese el nombre: ");
			nombre = sc.next();
			System.out.println("ingrese el codigo: ");
			codigo = sc.nextInt();
			System.out.println("ingrese el precio: ");
			precio = sc.nextFloat();
			
			do {
				System.out.println("ingrese el descuento (en el intervalo de [0, 50]): ");
				descuento = sc.nextInt();
				if(descuento>=0 && descuento<=50){
					flag=false;
				}
			}while(flag==true);

			
			producto.setNombre(nombre);
			producto.setCodigo(codigo);
			producto.setPrecio(precio);
			producto.setDescuento(descuento);
			
			System.out.println("\n## PRODUCTO "+(contador)+" ##");
			System.out.println("Nombre: "+producto.getNombre());
			System.out.println("Codigo: "+producto.getCodigo());
			System.out.println("Precio: $"+producto.getPrecio());
			System.out.println("Descuento: "+producto.getDescuento()+"%");
			System.out.println("Precio con descuento: $"+producto.calcularDescuento());
				
		}while(contador<=3);
		
		sc.close();
		

	}

}
