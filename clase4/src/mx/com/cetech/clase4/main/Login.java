package mx.com.cetech.clase4.main;

import java.util.Scanner;

public class Login {
	
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		boolean correcto = true;
		int cont= 0;
		
		while(correcto == true && cont<3){
			System.out.println("usuario: ");
			String usuario = teclado.next();
			System.out.println("contraseña: ");
			int contrasenia = teclado.nextInt();
			
			//usuario correto = omar
			//contraseña correcta = 12345				
			if(usuario.equals("omar") && contrasenia == 12345 ){
				System.out.println("Bienvenido");
				correcto = false;
			}else{
				System.out.println("usuario y/o contraseña incorrecta");
				correcto = true;
			}
		cont++;	
		if(cont ==3){
			System.out.println("usr bloqueado");
		}
		}// fin while
	} // fin main

}// fin clase 
