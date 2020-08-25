package aula;

import java.util.Scanner;

public class FuncionesAula {
	public static String[] CrearListaAulas()
	{
		String[] lista = {"Azul", "Verde", "Amarillo", "Roja"};
		return lista;
	}
	
	public static int[] CrearListaCapacidadesAulas()
	{
		int[] lista = {40, 35, 30, 25};
		return lista;
	}
	
	public static Aula[] CrearListaObjetosAula(){
		Aula[] listaAulas = new Aula[3];
		Aula miAula = new Aula();
		miAula.Color = "Azul";
		miAula.Capacidad = 40;
		
		listaAulas[0] = miAula;
		
		miAula = new Aula();
		miAula.Color = "Verde";
		miAula.Capacidad = 35;
		
		listaAulas[1] = miAula;
		
		miAula = new Aula();
		miAula.Color = "Amarillo";
		miAula.Capacidad = 30;
		
		listaAulas[2] = miAula;
		
		return listaAulas;	
	}
	
	public static int ObtenerCantidadAlumnos(){
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de alumnos del curso");
		int cantidadAlumnos = in.nextInt();		
		return cantidadAlumnos;
	}
	
	public static void ObtenerAulaConObjeto(){
		int cantidadAlumnos = ObtenerCantidadAlumnos();
		Aula[] listaAulas = CrearListaObjetosAula();
		
		int asientosLibres = listaAulas[0].Capacidad - cantidadAlumnos;
		int indice = 0;
		
		for (int i = 1; i < listaAulas.length; i++) {
			if (cantidadAlumnos <= listaAulas[i].Capacidad && 
					listaAulas[i].Capacidad - cantidadAlumnos < asientosLibres)
			{
				indice = i;
			}
		}
		
		System.out.println("La sala indicada es de color " + listaAulas[indice].Color + 
				" y la capacidad es de " + listaAulas[indice].Capacidad);
		
	}
	
	public static void ObtenerAula()
	{
		int cantidadAlumnos = ObtenerCantidadAlumnos();
		String[] listaAula = CrearListaAulas();
		int[] listaCantidades = CrearListaCapacidadesAulas();
		
		int asientosLibres = listaCantidades[0] - cantidadAlumnos;
		int indice = 0;
		for (int i = 1; i < listaCantidades.length; i++) {
			if(cantidadAlumnos <= listaCantidades[i] &&
					listaCantidades[i] - cantidadAlumnos < asientosLibres)
			{
				indice = i;
			}
		}
		
		System.out.println("El aula indicada es de color " + listaAula[indice] + " y tiene una capacidad de " 
		+ listaCantidades[indice]);
	}
}
