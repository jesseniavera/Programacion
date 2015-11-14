package Ejercicios1;

import java.util.Scanner;

public class Alumnoos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("bienvenidos al siatema");
		float suma=0,promedio;
		Scanner leer= new Scanner(System.in);
	for (int nn=1;nn<6;nn++){
		System.out.println("alumno"+nn+":");
	suma+=leer.nextFloat();
	}
	promedio=suma/3;
	System.out.println("el promedio del grupo es:"+promedio);
	
	}

}
