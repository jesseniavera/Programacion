package Ejercicios1;

import java.util.Scanner;

public class Comprass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("bienvenidos al sistem");
		Scanner sc = new Scanner(System.in); 
		System.out.println("Bienvenidos al sistema");
		System.out.println("Menù");
		System.out.println("1. Bolita Roja");
		System.out.println("2. Bolita Amarilla");
		System.out.println("3. Bolita Blanca");
		System.out.println("4.Salir");
		System.out.println("Seleccione una Opciòn");
		int op=sc.nextInt();
		System.out.println("Ingrese el monto de la compra");
		double monto_c= sc.nextDouble();
		switch (op){
		case 1:
			double desc= monto_c-(monto_c*0.40);
			double iva=(desc*0.12);
			double t=(desc+iva);
			System.out.println("Su total a pagar es:" +t);
			break;
		
		case 2:
			double desc1= monto_c-(monto_c*0.25);
			double iva1=(desc1*0.12);
			double tot=(desc1+iva1);
			System.out.println("Su total a pagar es:" +tot);
			break;
		
		case 3:
			double m=(monto_c*0.12);
			double total=(monto_c);
			System.out.println("Su total a pagar es:" +total);
			break;
default:
		}
			System.out.println("Gracias por utlizar el sistema");
			
	}

}
