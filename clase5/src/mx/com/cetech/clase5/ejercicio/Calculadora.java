package mx.com.cetech.clase5.ejercicio;

import java.util.Scanner;

import mx.com.cetech.clase5.modelado.SwitchCalc;

public class Calculadora {

	public static void main(String [] args){
		Scanner tecladoLap = new Scanner(System.in);
		System.out.println("Bienve");
		System.out.println("Seleciona una opcion");
		System.out.println("1) suma");
		System.out.println("2) resta");
		System.out.println("3) tabla");
		System.out.println("4) factorial");		
		
		int opcion= tecladoLap.nextInt();
		SwitchCalc sCalc = new SwitchCalc();
		int resultado = sCalc.menu(opcion);
		System.out.println(resultado);
	}
	
}
