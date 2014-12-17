package mx.com.cetech.clase2;

public class EstructuraSwitch {
	
	public static void main(String [] args){
		float opcion = 3.2f;
		int op= (int) opcion;
		switch(op){
		case 1:
			System.out.println("dentro del caso 1");
			break;
		case 2:
			System.out.println("dentro del caso 2");
			break;
		case 3:
			System.out.println("dentro del caso 3");
			break;
		default:
			System.out.println("dentro de la opcion por defecto");
			break;
		}
		
	}
}
