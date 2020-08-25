
package principal;
import funciones.Listas;

public class Principal {

	public static void main(String[] args) {
		
		int[] lista = {18, 25, 34, 1, 12, 87, 18, 54, 2, 23, 45};
		
		lista = Listas.OrdenamientoPorInsercion(lista);
		
	    int pos = Listas.BusquedaBinaria(lista, 18);
	    
	    System.out.println("Se encuentra en la posición: " + pos);
	}
}
