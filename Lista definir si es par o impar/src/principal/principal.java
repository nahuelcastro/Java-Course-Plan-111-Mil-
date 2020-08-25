package principal;

import java.util.Scanner;

public class principal {

	private static Scanner in;

	public static void main(String[] args) {
		
		int contadornumerospares=0;
		int sumadornumerospares=0;
		int contadornumerosimpares=0;
		int sumadornumerosimpares=0;
		
		
			
		System.out.print("Ingrese el numero de elementos de la lista:");
		in = new Scanner(System.in);
	    int numeroelementoslista = in.nextInt();
	    
	    int[] lista = new int[numeroelementoslista];
	    
	    System.out.println("Tu lista tendra " + numeroelementoslista + " elementos");
	    
	    for(int i=0 ; i<numeroelementoslista; i++){
		    	int e=i+1;
		    	System.out.println("Ingrese el elemento n°" + e );
		    	lista[i]= in.nextInt();  	
		    	
		    	
		    	
		    	 if(lista[i] % 2 == 0) {
		    		 contadornumerospares++;
		    		 sumadornumerospares+=lista[i];
		    		 System.out.println("Numero par ");
		         } else {
		        	 contadornumerosimpares++;
		        	 sumadornumerosimpares+=lista[i];
		        	 System.out.println("Numero impar ");
		         }
	    }
	    
	    System.out.println("");
	    System.out.println("Cantidad de numeros par = " + contadornumerospares);
	    System.out.println("Cantidad de numeros impar = " + contadornumerosimpares);
	    System.out.println("La suma de todos los numeros par = " + sumadornumerospares);
	    System.out.println("La suma de todos los numeros impar = " + sumadornumerosimpares);
	    
		}
}
