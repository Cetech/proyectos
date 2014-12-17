package mx.com.cetech.clase5.ejercicio;

import java.util.Scanner;

import mx.com.cetech.clase5.bean.Empleado;

public class LoginEmpleado {
	public static void main(String [] args){
		Empleado alex = new Empleado();
		alex.setEdad(25);
		alex.setId(1);
		alex.setNombre("Alex");
		alex.setPuesto("Gerente");
		alex.setEdad(30);
		alex.setUsuario("alex");
		alex.setContrasenia("456");
		
		Empleado hector = new Empleado("Hector", 29, 2, "Socio Mayoritario", "hector", "123");
		
		//logica login...
		System.out.println("usuario: ");
		Scanner entrada = new Scanner(System.in);
		String usr = entrada.next();
		System.out.println("pass: ");
		String pass = entrada.next();
		
		if( usr.equalsIgnoreCase(alex.getUsuario()) && pass.equals(alex.getContrasenia()) ){
			System.out.println("Bienvenido "+alex.getNombre());
		}else if(usr.equalsIgnoreCase(hector.getUsuario()) && pass.equals(hector.getContrasenia()) ){
			System.out.println("Bienvenido "+hector.getNombre());
		}else{
			System.out.println("usr y/o pass invalidos");
		}
	}
}
