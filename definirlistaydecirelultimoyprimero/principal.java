package principal;

import java.util.Scanner;

import funciones.Listas;

public class principal {

	private static Scanner in;

	public static void main(String[] args) {
			
		System.out.print("Ingrese el numero de elementos de la lista:");
		in = new Scanner(System.in);
	    int numeroelementoslista = in.nextInt();
	    
	    int[] lista = new int[numeroelementoslista];
	    
	    System.out.println("Tu lista tendra " + numeroelementoslista + " elementos");
	    
	    for(int i=0 ; i<numeroelementoslista; i++){
	    	int e=i+1;
	    	System.out.println("Ingrese el elemento n°" + e );
	    	lista[i]= in.nextInt();  	
	    	// System.out.println(lista[2]);
	    	
	    }
	    
	    lista = Listas.OrdenamientoPorInsercion(lista);
		
	    
	    System.out.println("Menor numero: " + lista[0]);
	   // System.out.println(lista[numeroelementoslista]); no anda esta mierda
	    
	    
		}
}
