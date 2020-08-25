package Funciones;

import java.util.Arrays;

public class Operaciones {

	public static void compararMatrices(int[][] matriz1, int[][] matriz2){
		boolean igual = true;
		
		for(int i=0; i<matriz1.length; i++){
			for(int j=0; j<matriz1[i].length; j++){
				int valor1 = matriz1[i][j];
				int valor2 = matriz2[i][j];
				if (valor1 == valor2){
					igual = true;
				}else{
					igual = false;
				}
			}
		}
		
		if (igual){
			System.out.println("Las matrices son iguales.");
		}else{
			System.out.println("Las matrices NO son iguales.");
		}
		
		/**if (Arrays.deepEquals(matriz1, matriz2)){
			  System.out.println("Son matrices iguales");
		}else{
			  System.out.println("Son matrices diferentes");
		}**/
	}
	
	public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2, int filCol){
		int[][] matriz3 = new int[filCol][filCol];
		
		for(int i=0; i<matriz1.length; i++){
			for(int j=0; j<matriz1[i].length; j++){
				int valor1 = matriz1[i][j];
				int valor2 = matriz2[i][j];
				
				matriz3[i][j] = valor1*valor2;
			}
		}
		
		return matriz3;
		
	}
}
