package modelo;

public class Juguete {
	private String nombre;
	private int edadMin;
	private int edadMax;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdadMax() {
		return edadMax;
	}
	public void setEdadMax(int edadMax) {
		this.edadMax = edadMax;
	}
	public int getEdadMin() {
		return edadMin;
	}
	public void setEdadMin(int edadMin) {
		this.edadMin = edadMin;
	}

}
