
public class Usuario {

	private String nombre;
	private String cedula;
	private String contrasena;
	private int edad;
	private int cantidadHijos;
	private double saldo;
	
	
	public Usuario(String nombre, String cedula, String contrasena, int edad, int cantidadHijos) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.contrasena = contrasena;
		this.edad = edad;
		this.cantidadHijos = cantidadHijos;
		this.saldo = 0;
	}
	
	
	
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getCantidadHijos() {
		return cantidadHijos;
	}
	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
