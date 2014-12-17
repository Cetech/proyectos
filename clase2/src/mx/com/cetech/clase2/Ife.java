package mx.com.cetech.clase2;

public class Ife {
	
	public static void main (String [] args){
		
		int edad = 2;
		String nombre ="omar";
		String delegacion = "Atizapan";
		
		if(edad >= 18){			
			System.out.println(nombre+" de la delegación "+delegacion +" Si puede votar");
		}else{
			System.out.println(nombre+" de la delegación "+delegacion +" No puede votar");
		}
		
	}// fin del metodo

}// fin de la clase
