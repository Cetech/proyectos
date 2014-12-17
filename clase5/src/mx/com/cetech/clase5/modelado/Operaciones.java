package mx.com.cetech.clase5.modelado;

import java.util.Scanner;

public class Operaciones {

	public int suma(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("suma");
		System.out.println("primer numero: ");
		int numero =teclado.nextInt();
		System.out.println("segundo numero: ");
		int numero2 =teclado.nextInt();
		int res = numero2 + numero;
		return res;
	}
	
	public int resta(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("resta");
		System.out.println("primer numero: ");
		int numero =teclado.nextInt();
		System.out.println("segundo numero: ");
		int numero2 =teclado.nextInt();
		int res = numero2 - numero;
		return res;
	}
	
}
