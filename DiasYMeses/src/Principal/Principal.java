package Principal;

import java.util.Scanner;
import Funciones.*;

public class Principal {

	public static void main(String[] args) {
		int[] lista = {5, 3, 12, 98, 45, 34, 65};
		
		System.out.println("Ingrese un n�mero de d�a");
		Scanner in = new Scanner(System.in);
		int numeroDia = in.nextInt();
		
		String nombreDia = Dias.ObtenerDia(numeroDia);	
		System.out.println("El d�a ingresado es: " + nombreDia);
		
		System.out.println("Ingrese un n�mero de mes");
		int numeroMes = in.nextInt();
		
		String nombreMes = Meses.ObtenerMeses(numeroMes);
		System.out.println("El mes ingresado es: " + nombreMes);
	}
}

