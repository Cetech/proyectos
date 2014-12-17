package mx.com.cetech.clase5.ejercicio;

import mx.com.cetech.clase5.bean.Empleado;

public class AltaEmpleado {

	public static void main(String [] args){
		
		//Crando un empleado
		//new: palabra reservada para la creación de un nuevo objeto
		Empleado alex = new Empleado();
		alex.setEdad(25);
		alex.setId(1);
		alex.setNombre("Alex");
		alex.setPuesto("Gerente");
		alex.setEdad(30);
		alex.setUsuario("alex");
		alex.setContrasenia("456");
		System.out.println("nombre: "+alex.getNombre() + " edad: "+alex.getEdad());
		
		//Creando Empleado usando constructor con todos sus campos
		Empleado hector = new Empleado("Hector", 29, 2, "Socio Mayoritario", "hector", "123");
		
		System.out.println(alex.getNombre()+" "+hector.getNombre());
		hector.setEdad(28);
		int edad = hector.getEdad();
		System.out.println("edad Hector: "+edad);
	}
	
}
