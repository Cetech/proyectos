package mx.com.cetech.clase3;

import java.util.Scanner;

public class LecturaTeclado {

	public static void main (String [] args){
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("teclea tu nombre: ");
		String nombre = teclado.next();
		System.out.println("tu nombre es: "+nombre);
		System.out.println("escribe tu edad: ");
		int edad = teclado.nextInt();
		System.out.println("tu edad es: "+edad);
		System.out.println("dame tu estatura:");
		float estatura = teclado.nextFloat();
		System.out.println("tu estatura es: "+estatura);
		
	}
	
}
