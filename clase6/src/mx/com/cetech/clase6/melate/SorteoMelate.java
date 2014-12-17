package mx.com.cetech.clase6.melate;

import java.util.Scanner;

public class SorteoMelate {

	public static void main(String[] args) {
		boolean repetir=true;
		int [] numUser= new int[6];
		while(repetir){
			System.out.println("Sorteo Melate");
			System.out.println("1) Dame los numeros");
			System.out.println("2) Ejecutar sorteo");
			Scanner teclado = new Scanner(System.in);
			int opcion = teclado.nextInt();
			if(opcion == 1){				
				for(int i=0; i<6;i++){
					System.out.println("teclea un numero");				
					numUser[i]=teclado.nextInt();				
				}					
			}else{
				SorteoMelate sm = new SorteoMelate();
				int [] numerosSorteo = new int[7];
				for(int i=0; i<7;i++){					
					numerosSorteo[i]=sm.getNumero();					
				}
				//recorremos los arreglos para compararlos
				int contador=0;
				for(int i=0; i<numerosSorteo.length; i++){
					for(int j=0; j<numUser.length; j++)
					contador=numerosSorteo[i]==numUser[j]?contador+1:contador;
				}
				System.out.print("los numeros ganadores son: ");
				for(int arreglo1: numerosSorteo){
					System.out.print(arreglo1+" ");
				}
				System.out.print("tus numeros fueron: ");
				for(int arreglo2: numUser){
					System.out.print(arreglo2+" ");
				}
				System.out.println("contador = "+contador);
				System.out.println(contador>3?"felicidades":"sigue participando");
				repetir = false;
			}//else
		}//while
	
	}//main
	
	public int getNumero(){					
		return (int) Math.floor(Math.random()*56+1);
	}

}//clase
