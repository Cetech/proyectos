package mx.com.cetech.clase2;

public class EstructuraIf {

	public static void main(String [] args){
		System.out.println("desde Estructura If");
		
		int edad = 23;
		String genero="femenino";
		edad=edad-10;
		
		if(18 <= edad){			
			if(genero.equals("femenino")){
				System.out.println("mayor de edad y es mujer");
			}else{
				System.out.println("mayor de edad y es hombre");
			}						
		}else{
			if(genero.equals("femenino")){
				System.out.println("menor de edad y es mujer");
			}else{
				System.out.println("menor de edad y es masculino");
			}
			
		}
	}
	
}
