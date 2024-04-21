package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {
	
	private static ArrayList<Pais> countries = new ArrayList<Pais>();
	private static ArrayList<DestinoTuristico> destinations = new ArrayList<DestinoTuristico>();
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		setCountries();
		
		boolean flag = true;
		while(flag) {
			
			showMenu();
			int selectedOption = sc.nextInt();
			
			switch (selectedOption) {
			case 1: {
				setTouristDestination();
				break;
			}
			case 2: {
				showDestinations();
				break;
			}
			case 3: {
				setDestinationCountry();
				break;
			}
			case 4: {
				clearDestinations();
				break;
			}
			case 5: {
				deleteDestination();
				break;
			}
			case 6: {
				sortDestinations();
				showDestinations();
				break;
			}
			case 7: {
				showCountries();
				break;
			}
			case 8:{
				showCountryDestinations();
			}
			case 9:{
				System.out.println("Programa terminado.");
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + selectedOption);
			}
			
		}
		sc.close();
	}
	
	public static void showCountryDestinations() {
		try {
			System.out.println("### Destinos de un pais ###");
			System.out.println("codigo del pais:");
			int codigo = sc.nextInt();
			for(DestinoTuristico dest:destinations) {
				if(dest.getPais().getCodigo()==codigo) {
					System.out.println(dest);
				}
			}
		} catch (Exception e) {
			System.out.println("### Error:\n"+e+"\n###");
		}
		

	}
	
	public static void sortDestinations() {
		destinations.sort(Comparator.comparing(DestinoTuristico::getNombre));
	}
	
	public static void deleteDestination() {
		try {
			System.out.println("### Eliminar un destino ###");
			System.out.println("codigo del destino:");
			int codigo = sc.nextInt();
			 Iterator iterator = destinations.iterator();
			 while(iterator.hasNext()) {
				 DestinoTuristico dest = (DestinoTuristico) iterator.next();
				 if(dest.getCodigo()==1) {
					 iterator.remove();
				 }
			 }
			 System.out.println("destino : ("+codigo+") eliminado.");
		} catch (Exception e) {
			System.out.println("### Error:\n"+e+"\n###");
		}
	}
	
	public static void clearDestinations() {
		destinations.clear();
	}
	
	public static void setDestinationCountry() {
		try {
			System.out.println("### Cambiar el pais de un destino ###");
			System.out.println("codigo del destino:");
			int codigo = sc.nextInt();
			for(DestinoTuristico dest:destinations) {
				if(dest.getCodigo()==codigo) {
					System.out.println("codigo del pais (int):");
					int codigoPais = sc.nextInt();
					Pais pais = countries.get(codigoPais);
					dest.setPais(pais);
					System.out.println(dest);
					System.out.println("## completado ##");
		
				}else {
					throw new Exception("No existe un destino con ese codigo!!");
				}
			}
		} catch (Exception e) {
			System.out.println("### Error:\n"+e+"\n###");
		}	
	}
	
	public static void setTouristDestination() {
		try {
			System.out.println("### Alta de Destino Turistico ###");
			
			System.out.println("Codigo del destino (int):");
			int codigo = sc.nextInt();
			if(destinations.size()!=0) {
				for(DestinoTuristico d:destinations) {
					if (d.getCodigo()==codigo){
						throw new Exception("El codigo ingresado ya existe!!");
					}
				}
			}
			
			System.out.println("nombre del destino:");
			String destino = sc.next();
			

			System.out.println("codigo del pais (int):");
			int codigoPais = sc.nextInt();
			
			Pais pais = countries.get(codigoPais);
			
			System.out.println("cantidad de dias:");
			int dias = sc.nextInt(); 
			
			System.out.println("precio:");
			Float precio = sc.nextFloat();		
			
			destinations.add(new DestinoTuristico(codigo, destino, precio, pais, dias));
			
		} catch (Exception e) {
			System.out.println("### Error:\n"+e+"\n###");
		}
		
	}
	
	public static void showDestinations() {
		for(DestinoTuristico dest:destinations) {
			System.out.println(dest);
		}
	}
	
	public static void showCountries() {
		for(Pais country:countries) {
			System.out.println(country);
		}
	}
	
	public static void setCountries() {
		String[] countryNames = {"Argentina","España","Peru","Japon",
								"Mexico","Indonesia","China","Australia",
								"Estados Unidos","Escocia","Irlanda","Venezuela"};

		for(int i=0;i<countryNames.length;i++) {
			countries.add(new Pais(i,countryNames[i]));
		}
	}
	

	public static void showMenu() {
		System.out.println("""
				1 – Alta de destino turístico (para asociar el país se ingresa el código de páis).
				2 – Mostrar todos los destinos turísticos.
				3 – Modificar el país de un destino turístico.
				4 – Limpiar el ArrayList de destino turísticos.
				5 – Eliminar un destino turístico (el usuario debe ingresar el código del destino turístico. Utilice  Iterator).
				6 – Mostrar los destinos turísticos ordenados por nombre.
				7 – Mostrar todos los países.
				8 – Mostrar los destinos turísticos que pertenecen a un país (el usuario ingresa el código de  país).
				9 – Salir.
				""");
	}
}
