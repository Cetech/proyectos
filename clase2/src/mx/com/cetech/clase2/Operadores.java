package mx.com.cetech.clase2;

public class Operadores {
	
	public static void main(String [] args){
		System.out.println("desde la clase operadores");
		
		System.out.println(" *** Operadores aritmeticos ***");
		
		int entero = 3;
		float flotante = 2.2f;
		System.out.println("multiplicando: "+ entero*flotante);
		System.out.println("sumando: "+(entero+flotante));
		System.out.println("restando: "+(entero-flotante));
		System.out.println("dividiendo: "+ entero/flotante);
		System.out.println("residuo: "+ entero%flotante);
		
		System.out.println(" ***   operadores logicos == = !=  < > <= >= ***");
		System.out.println(3==4);
		System.out.println(3==3);
		System.out.println(3!=4);
		System.out.println(3!=3);
		System.out.println(3==entero);
		
		System.out.println((3*4)-2 < 23);
		
		System.out.println("*** Operadores condicionales & | ***");
		
		if( 5<4 & (3*2)<7 ){
			System.out.println("si se cumplió");
		}else{
			System.out.println("no se cumplió");
		}
		
		// operador de corto circuito
		if( 5<4 && (3*2)<7 ){
			System.out.println("si se cumplió");
		}else{
			System.out.println("no se cumplió");
		}
		
		if(1==2 || 2<8){
			System.out.println("si se cumple");
		}else{
			System.out.println("no se cumple");
		}
		
	}// fin main

}// fin clase
