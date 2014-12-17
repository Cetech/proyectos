package mx.com.cetech.clase4.ejercicio;

import java.util.Scanner;

public class EjercicioArreglos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuántos números vas a meter?");
		int veces = teclado.nextInt();
		int [] numeros = new int[veces];
		for(int i =0; i<veces; i++){
			System.out.println("ingresa un numero: ");
			 int numero = teclado.nextInt();
			numeros[i]=numero;		
		}
		System.out.print("Los valores son: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(" "+numeros[i]);
		}
	}

}
