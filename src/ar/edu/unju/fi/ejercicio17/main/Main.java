package ar.edu.unju.fi.ejercicio17.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {
	
	private static Scanner sc = new Scanner(System.in);
	private static List<Jugador> jugadores = new ArrayList<Jugador>();
	
	public static void main(String[] args) {
			
		boolean flag=true;
		while(flag) {
			
			showMenu();
			
			int option = sc.nextInt();

			switch (option) {
			case 1: {		
				jugadores.add(altaJugador());
				break;
				
			}case 2: {		
				try {
					System.out.println(jugadores.get(buscarJugador()));
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
				break;
				
			}case 3:{
				ordenarLista();
				mostrarLista();
				break;
				
			}case 4:{
				try {
					Jugador jugador_a_reemplazar = jugadores.get(buscarJugador());
					System.out.println("Vas a editar al jugador: "+jugador_a_reemplazar);
					Jugador nuevos_datos_del_jugador = altaJugador();
					jugadores.set(jugadores.indexOf(jugador_a_reemplazar), nuevos_datos_del_jugador);
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
				break;
				
			}case 5:{
				try {
					Jugador jugador_a_eliminar = jugadores.get(buscarJugador());
					jugadores.remove(jugadores.indexOf(jugador_a_eliminar));
					System.out.println("## Se elimino a "+jugador_a_eliminar);

					
				} catch (Exception e) {
					
					System.out.println(e);
				}
				break;
				
			}case 6:{
				System.out.println("La lista de jugadores tiene una longitud de :"+jugadores.size());
				
			}case 7:{
				contarJugadoresPorNacionalidad();
				
			}case 8:{
				System.out.println("Programa finalizado.");
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + option);
			}
		}
		sc.close();
	}
	
	public static void showMenu() {	
		System.out.println("## Selecione una opcion ##");
		System.out.println("1 – Alta de jugador.");
		System.out.println("2 – Mostrar los datos del jugador (el usuario debe ingresar el nombre y el apellido.");
		System.out.println("3 – Mostrar todos los jugadores ordenados por apellido.");
		System.out.println("4 – Modificar los datos de un jugador (el usuario debe ingresar el nombre y el apellido del jugador).");
		System.out.println("5 – Eliminar un jugador (el usuario debe ingresar el nombre y apellido. Utilice Iterator).");
		System.out.println("6 – Mostrar la cantidad total de jugadores que tiene el ArrayList.");
		System.out.println("7 – Mostrar la cantidad de jugadores que pertenecen a una nacionalidad (el usuario ingresa la nacionalidad).");
		System.out.println("8 – Salir.");	
	}
	
	public static void contarJugadoresPorNacionalidad() {
		System.out.println("Ingreso una nacionalidad para contar su cantidad de jugadores");
		String nacionalidad = sc.next();
		int contador=0;
		for(Jugador j:jugadores) {
			if(j.getNacionalidad().equals(nacionalidad)) {
				contador++;
			}
		}
		System.out.println("## "+contador+" jugadores pertenecen a "+nacionalidad+" ##");
	}
	
	public static Jugador altaJugador() {
		Jugador jugador;
		
		Calendar fecha_nacimiento;
		
		System.out.println("## Alta de jugador ##");
		
		System.out.println("ingrese el apellido:");
		String apellido = sc.next();
		System.out.println("ingrese el nombre:");
		String nombre = sc.next();
		System.out.println("ingrese la fecha de nacimiento '(dd/mm/yyyy)':");
		String str_fecha = sc.next();
		
		fecha_nacimiento = new GregorianCalendar(Integer.parseInt(str_fecha.substring(6,10)),
												 (Integer.parseInt(str_fecha.substring(3,5))-1),
												 Integer.parseInt(str_fecha.substring(0,2)));
		
		System.out.println("ingrese la nacionalidad:");
		String nacionalidad = sc.next();
		System.out.println("ingrese la estatura:");
		Float estatura = sc.nextFloat();
		System.out.println("ingrese el peso:");
		Float peso = sc.nextFloat();
		
		String posicion;
		do {
			System.out.println("ingrese la posicion:");
			posicion = sc.next();
		}while(!("Delantero".equals(posicion)) && !("Medio".equals(posicion)) && !("Defensa".equals(posicion)) && !("Arquero".equals(posicion)));
		
		jugador = new Jugador(nombre, apellido, fecha_nacimiento, nacionalidad, estatura, peso, posicion);
		
		return jugador;

	}
	
	public static int buscarJugador() {
		System.out.println("Ingrese el nombre del jugador a buscar:");
		String nombre = sc.next();
		System.out.println("Ingrese el apellido del jugador a buscar");
		String apellido = sc.next();
		int res = 0;
		
		
		
		for(int i = 0; i<jugadores.size(); i++) {
			res = (jugadores.get(i).getNombre().equals(nombre) && jugadores.get(i).getApellido().equals(apellido))?jugadores.indexOf(jugadores.get(i)):-1;
		}
		
		return res;
	}
	
	public static void ordenarLista() {
		jugadores.sort(Comparator.comparing(Jugador::getApellido));;
	}
	
	public static void mostrarLista() {
		jugadores.forEach(j->System.out.println(j));
	}
}
