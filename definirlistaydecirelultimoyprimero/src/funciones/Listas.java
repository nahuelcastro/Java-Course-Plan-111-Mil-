package funciones;

public class Listas {
	
	
	
	public static int[] OrdenamientoPorInsercion(int[] lista)
	{
	    for (int i = 0; i < lista.length; i++ )
	    {
	        int valor = lista[i];
	        int j = i - 1;
	        
	        while(j >= 0 && lista[j] > valor)
	        {
	           lista[j + 1] = lista [j];
	           j--;
	        }
	        
	        lista[j + 1] = valor;
	    }
	    
	    return lista;
	}

}
