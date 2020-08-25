package Funciones;
import java.util.*;

public class Matrices {
	public static int[][] cargarMatriz(int[][] matriz, int filCol){
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		for(int i=0; i<filCol; i++){
			for(int j=0; j<filCol; j++){
				System.out.println("Ingrese el valor de la posicion " + i + ", " + j);
				matriz[i][j] = in.nextInt();
			}
		}
		
		return matriz;
	}
	
	public static void imprimirMatriz(int[][] matriz){
		for(int i=0; i<matriz.length; i++){
			for(int j=0; j<matriz[i].length; j++){
				System.out.println("Fila: " + i + " Columna: " + j + " Valor: " + matriz[i][j]);
			}
		}
	}
}