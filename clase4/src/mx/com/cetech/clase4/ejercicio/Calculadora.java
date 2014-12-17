package mx.com.cetech.clase4.ejercicio;

import java.util.Scanner;

public class Calculadora {

	public static void main(String [] args) {
		Scanner tecladoLap = new Scanner(System.in);
		
		boolean seguir=true;
		while(seguir){
			System.out.println("Bienve");
			System.out.println("Seleciona una opcion");
			System.out.println("1) suma");
			System.out.println("2) resta");
			System.out.println("3) tabla");
			System.out.println("4) factorial");		
			
			int opcion= tecladoLap.nextInt();
			//System.out.println("tu opcion es: "+opcion);
			switch(opcion){
			case 1:
				System.out.println("suma");
				//logica de suma
				break;
			case 2:
				System.out.println("resta");
				//logica de resta
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
			boolean next= true;
			int continuar=0;
			while(next){
				System.out.println("1) salir      2) realizar otra operacion");
				continuar= tecladoLap.nextInt();
				if(continuar !=1 && continuar !=2){
					System.out.println("op invalida");
				}else{
					next= false;
				}
			}//fin while next
			if(continuar==1){
				System.out.println("gracias por usar la calculadora...favor de hacer una donacion");
				seguir=false;
			}//fin if
		}//fin while
	}//fin main
	
}// fin clase
