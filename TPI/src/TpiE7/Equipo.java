package TpiE7;

public class Equipo {

	private String nombre;
	
	public Equipo(String nombre) {
		this.nombre = nombre;
	
	}
	
	void setnombre(String nombre) {
		this.nombre = nombre;
		}
	
	public String getnombre() {
		return nombre;
	}
	
	public String toString() {
		return "Equipo ->Nombre:" + nombre;
	}
}
