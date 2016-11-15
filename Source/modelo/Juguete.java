package modelo;

public class Juguete {
	private String nombre;
	private int edadMin;
	private int edadMax;
	private String tipo;
	private String DirImg;
	
	public Juguete(String nombre, String tipo, int edadMin, int edadMax, String DirImg)
	{
		this.nombre = nombre;
		this.tipo = tipo;
		this.edadMin = edadMin;
		this.edadMax = edadMax;
		this.DirImg=DirImg;
	}
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setDirImg(String DirImg)
	{
		this.DirImg=DirImg;
	}
	public String getDirImg()
	{
		return DirImg;
	}

}
