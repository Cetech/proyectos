package mx.com.cetech.clase5.bean;

public class Empleado {
	//creando un JavaBean
	//declaracion de atributos tipo private
	private String nombre;
	private int edad;
	private int id;
	private String puesto;
	private String usuario;
	private String contrasenia;
	
	//Constructor por default
	public Empleado() {
		System.out.println("Ejecutando Constructor");
	}
	
	//Constructor con todos sus campos	
	public Empleado(String nombre, int edad, int id, String puesto, String usuario, String contrasenia) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.id = id;
		this.puesto = puesto;
		this.usuario = usuario;
		this.contrasenia = contrasenia;
	}



	//declaracion de los métodos get & set (siempre son publicos)
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	
}
