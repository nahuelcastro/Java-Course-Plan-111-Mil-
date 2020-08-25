class PromedioDeNotas
{
	public static void main (String[] args)
	{
	    double[] notas={10,6,7,5,3,7,8,5,6,8,9,4,6,0,2};
	    
	    float acumulador = 0;
	    float promedio = 0;
	    
	    for (int i=0;i<notas.length ;i++ )
	    {
	     
	         acumulador += notas[i];
	     
	    }
	    
	    promedio=acumulador/notas.length;
	    
	    if(promedio >= 6){
	       System.out.println("Aprobado con " + promedio);
	    }
	    
	    else{
	        System.out.println("Desaprobado con " + promedio);
	    }
		
	}
}