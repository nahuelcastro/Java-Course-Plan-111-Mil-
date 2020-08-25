class OrdenamientoPorinserccion //programming hub 
{
	public static void main (String[] args)
	{
	    int[] lista={7,9,3,5};
	    
	    
	    for (int i=0;i<lista.length ;i++ )
	    {
	     
	         int valor=lista[i];
	         int j=i-1;
	         
	         while(j>0 && lista[j]>valor)
	         {
	             lista[j+1]=lista[j];
	             j--;
	         }
	     
	    }
	    
	   lista[j+1]=valor;
	   
	    for (int i=0;i<lista.length ;i++ )
	    {
	     
	         System.out.println(lista[i]);
	     
	    }
	   

	}
}