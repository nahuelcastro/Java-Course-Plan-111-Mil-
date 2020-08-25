class contadorDeAlumnosAprobados
{
    public static void main (String[] args)
    {
        boolean[] lista = {true,false,false,true,true,false,false};
        int contadorAprobados = 0;
        int contadorDesaprobados = 0;
        
        for(int i=0; i<lista.length ; i++ )
        {
            if(lista[i])
            {
                contadorAprobados++;
            }
            else
            {
                contadorDesaprobados++;
            }
        }
        
        
        System.out.println("Aprobaron" + contadorAprobados + "y desaprobaron" + contadorDesaprobados);
    }
}