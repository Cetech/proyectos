package mx.com.cetech.clase2;

public class IfeSwitch {

	public static void main(String [] args){
		int edad= 12;
		String nombre="Hector";
		int opcion;
		
		if(edad <= 9){
			opcion= 1;
		}else{
			if(edad <= 17){
				opcion =2;
			}else{
				if(edad <= 40){
					opcion = 3;
				}else{
					opcion =4;
				}
			}
		}
		
		switch(opcion){
		case 1:
			System.out.println("es niño no puede votar");
			break;
		case 2:
			System.out.println("es adolecente no puede votar");
			break;
		case 3:
			System.out.println("es adulto ya puede votar");
			break;
		case 4: System.out.println("es adulto mayor ya puede votar");
			break;
		default: 
			System.out.println("opcion invalida");
			break;
		}
		
		
	}
	
}
