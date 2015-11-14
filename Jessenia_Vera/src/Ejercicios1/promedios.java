package Ejercicios1;

import java.util.Scanner;

public class promedios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int m;
		double acum=0;
		System.out.println("bienvenidos al sistema");
		double[] num= new double[50];
		for(m=0;m<50;m++){
			System.out.println("ingrese sus notas por favor");
			num[m]=sc.nextDouble();
			acum=acum+num [m];
			
		}
		acum=acum/50;
		System.out.println("su Pormedio es:"+acum);
		if (acum<7){
			System.out.println("usted esta reprobado");
		}else if (acum>=7){
		System.out.println("usted esta aprobado");
		}

		}
		
	}


