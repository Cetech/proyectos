package mx.com.cetech.clase2;

public class EstructuraWhile {

	public static void main(String [] args){
		
		int contador= 0;
		while(contador!=3){
			System.out.println("ejecutando while");
			contador++;
		}
		System.out.println("fuera de while");
		
		boolean isMayor = true;
		while(isMayor){
			System.out.println("fue mayor");
			isMayor = false;
		}
	}
	
}
