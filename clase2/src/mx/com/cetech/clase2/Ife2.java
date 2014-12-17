package mx.com.cetech.clase2;

public class Ife2 {

	public static void main (String [] args){
		
		int edad = 15;
		String nombre ="Pedro";
		String delegacion = "coyoacan";
		
		if(delegacion.equalsIgnoreCase("Coyoacan")){			
			System.out.println("por el momento...");
		}else{
		if(edad <= 9){
			System.out.println("es niño no puede votar");
		}else{
			if(edad <= 17){
				System.out.println("es adolecente no puede votar");
			}else{
				if(edad <= 40){
					System.out.println("es adulto ya puede votar");
				}else{
					System.out.println("es adulto mayor ya puede votar");
				}
			}		
		}//fin compaacion edades
	}//fin delegacion
		
	}//fin metodo main
	
}// fin clase
