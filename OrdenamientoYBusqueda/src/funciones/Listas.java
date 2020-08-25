package funciones;

public class Listas {
	
	public static int BusquedaBinaria(int[] lista, int dato)
	{
		int inicio = 0;
		int fin = lista.length - 1;
		int pos;
		
		while (inicio <= fin)
		{
			pos = (inicio + fin) / 2;
			
			if (dato == lista[pos])
			{
				return pos;
			}
			else if (dato > lista[pos])
			{
				inicio = ++pos;
			}
			else
			{
				fin = --pos;
			}
		}
		
		return -1;
	}
	
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
