package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto[] productos = new Producto[3];
		Scanner sc = new Scanner(System.in);
		
		Producto prod1 = new Producto();
		Producto prod2 = new Producto();
		Producto prod3 = new Producto();
		
		productos[0]=prod1;
		productos[1]=prod2;
		productos[2]=prod3;
		
		String nombre;
		int codigo;
		float precio;
		int descuento;
		
		for(int i = 0; i<productos.length; i++) {
			System.out.println("## PRODUCTO "+(i+1)+" ##");
			System.out.println("ingrese el nombre: ");
			nombre = sc.nextLine();
			System.out.println("ingrese el codigo: ");
			codigo = sc.nextInt();
			System.out.println("ingrese el precio: ");
			precio = sc.nextFloat();
			System.out.println("ingrese el descuento: ");
			descuento = sc.nextInt();
			sc.nextLine();
			
			productos[i].setNombre(nombre);
			productos[i].setCodigo(codigo);
			productos[i].setPrecio(precio);
			productos[i].setDescuento(descuento);
		}
		
		sc.close();
		
		for(int i=0; i<productos.length; i++) {
			System.out.println("\n## PRODUCTO "+(i+1)+" ##");
			System.out.println("Nombre: "+productos[i].getNombre());
			System.out.println("Codigo: "+productos[i].getCodigo());
			System.out.println("Precio: $"+productos[i].getPrecio());
			System.out.println("Descuento: "+productos[i].getDescuento()+"%");
			System.out.println("Precio con descuento: $"+productos[i].calcularDescuento());
		}
	}

}
