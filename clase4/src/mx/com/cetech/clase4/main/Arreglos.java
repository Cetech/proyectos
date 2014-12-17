package mx.com.cetech.clase4.main;

public class Arreglos {
	
	public static void main(String [] args){
		
		String [] arreglo1;
		String arreglo2 [];
		String [] arreglo3 = new String[10];
		String [] arreglo4={"valor1", "valor2"};
		
		arreglo3[2]= "Indice2";
		arreglo3[3]= "Indice3";
		arreglo3[4]= "Indice4";
		System.out.println(arreglo3[4]);
		System.out.println(arreglo4[1]);
		System.out.println("tamaño de mi arreglo"+arreglo4.length);
		
		String [] lista ={"omar", "Dilan", "Shuen", "Fernando", "Andres", "Hector", "Alejando", "Alan"};
		System.out.println(lista[2]);
		System.out.println("el tamaño de mi arreglo "+ lista.length);
		
		for(int i=0;i<lista.length; i++){
			System.out.println(lista[i]);
			System.out.println("valor del indice es: "+i);
		}
		
	}//fin main	
}// fin clase
