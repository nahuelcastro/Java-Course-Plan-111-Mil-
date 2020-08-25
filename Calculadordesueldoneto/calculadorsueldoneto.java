package Principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sueldobasico;
		float sueldobruto;
		float sueldoneto;
		int horasporsemana=40;
		int horasmensuales;
		int horasextras;
		float pagoporhora;
		int porcentajedescuentojubilatorio=11;
		float descuentojubilatorio;
		int porcentajedescuentoobrasocial=3;
		float descuentoobrasocial;
		float descuentototal;
		
		System.out.print("Ingrese el sueldo basico: $");
		Scanner in = new Scanner(System.in);
	    sueldobasico = in.nextInt();
		
		System.out.print("Ingrese la cantidad de horas extras: ");
		horasextras = in.nextInt();
		
		horasmensuales=horasporsemana*4;
		pagoporhora=sueldobasico/horasmensuales;
		sueldobruto=pagoporhora*(horasmensuales+horasextras);
		descuentojubilatorio=(sueldobruto*porcentajedescuentojubilatorio)/100;
		descuentoobrasocial=(sueldobruto*porcentajedescuentoobrasocial)/100;
		descuentototal=descuentoobrasocial+descuentojubilatorio;
		sueldoneto=(sueldobruto*(100-porcentajedescuentojubilatorio+porcentajedescuentoobrasocial))/100;
		
		System.out.println("Sueldo basico: $" + sueldobasico);
		System.out.println("Horas de trabajo semanal: " + horasporsemana);
		System.out.println("Horas de trabajo mensual: " + horasmensuales);
		System.out.println("Horas de trabajo extras: " + horasextras);
		System.out.println("Pago por hora de trabajo: $" + pagoporhora);
		System.out.println("Sueldo bruto: $" + sueldobruto);
		System.out.println("Descuento jubilatorio: $ -" + descuentojubilatorio);
		System.out.println("Descuento obra social: $ -" + descuentoobrasocial);
		System.out.println("Descuento total : $ -" + descuentototal);
		System.out.println("Sueldo neto: $" + sueldoneto);

	}

}
