package Problemas;
import java.util.*;

// Comparar 2 matrices cuadradas y decir si son iguales.

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese el número de filas/columnas (deben ser iguales): ");
		int filCol = in.nextInt();
		
		int[][] matriz1 = new int[filCol][filCol];
		int[][] matriz2 = new int[filCol][filCol];
		
		System.out.println("Ingrese los valores para la primer matriz: ");
		matriz1 = Funciones.Matrices.cargarMatriz(matriz1, filCol);
		System.out.println("Ingrese los valores para la segunda matriz: ");
		matriz2 = Funciones.Matrices.cargarMatriz(matriz2, filCol);
		
		Funciones.Operaciones.compararMatrices(matriz1, matriz2);
	}

}
