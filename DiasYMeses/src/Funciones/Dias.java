package Funciones;

public class Dias {
	
	public static String ObtenerDia(int numeroDia)
	{
		String nombreDia;
		switch(numeroDia)
		{
			case 1: nombreDia = "Lunes";
			break;
			case 2: nombreDia = "Martes";
			break;
			case 3: nombreDia = "Miercoles";
			break;
			case 4: nombreDia = "Jueves";
			break;
			case 5: nombreDia = "Viernes";
			break;
			case 6: nombreDia = "S�bado";
			break;
			case 7: nombreDia = "Domingo";
			break;
			default: nombreDia = "N�mero de d�a incorrecto";
			break;
		}
		
		return nombreDia;
	}

}
