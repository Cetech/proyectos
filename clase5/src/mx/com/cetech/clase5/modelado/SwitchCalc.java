package mx.com.cetech.clase5.modelado;

import java.util.Scanner;

public class SwitchCalc {

	public int menu(int opt){
		Scanner teclado = new Scanner(System.in);
		int res = 0;
		switch(opt){
		case 1:
			Operaciones oper = new Operaciones();
			res = oper.suma();
		case 2:
			
			break;
		case 3: 
			System.out.println("tabla");
			//logica de la tabla de multiplicar
			break;
		case 4:
			System.out.println("factorial");
			//logica del factorial
			break;
		default:
			System.out.println("op incorrecta");
			break;
		}//fin switch
		
		return res;
	}
	
}
