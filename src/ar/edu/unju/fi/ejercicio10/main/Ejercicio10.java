package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pizza pizza = new Pizza();

		int diametro;
		boolean especial;
		
		int contador=1;
		do {
			boolean flag=true;
			do {
				System.out.println("\nIngrese el diametro (solo se admite 20, 30 o 40):");
				diametro = sc.nextInt();
				if(diametro==20 || diametro==30 || diametro==40) {
					flag=false;
				}
			} while(flag);
			flag=true;
			
			System.out.println("\nQuiere agregar ingredientes especiales? (ingrese true o false):");
			especial = sc.nextBoolean();
			
			pizza.setDiametro(diametro);
			pizza.setEspecial(especial);
			pizza.calcularArea();
			pizza.calcularPrecio();
			
			System.out.println("\n** Pizza "+(contador)+" **");
			System.out.println("Diámetro: "+pizza.getDiametro());
			System.out.println("Ingredientes especiales: "+pizza.isEspecial());
			System.out.println("Precio Pizza: "+pizza.getPrecio()+"$");
			System.out.println("Área de la pizza: "+pizza.getArea());
			
			contador+=1;
		}while(contador<=3);

		sc.close();
	}

}
