package modelo;

public class Nino {
	private String nombre;
	private int edad;
	private String genero;
	private String pais;
	private String[] juguetes;
	private boolean bueno;
	private String direccion;
	private String carta;
	private String direccion;
	
	public Nino(String nombre, int edad, String  genero, String pais,String dir, boolean bueno)
	{
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.setPais(pais);
		this.setJuguetes(new String[5]);
		this.setBueno(bueno);
		this.setCarta("");
		this.setDireccion(dir);
	}

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

	public String  getGenero() {
		return genero;
	}

	public void setGenero(String  genero) {
		this.genero = genero;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String[] getJuguetes() {
		return juguetes;
	}

	public void setJuguetes(String[] juguetes) {
		this.juguetes = juguetes;
	}
	
	public void setJuguetes(String juguete, int posicion) {
		this.juguetes[posicion] = juguete;
	}
	public String getJuguetes(int posicion) {
		return juguetes[posicion];
	}

	public boolean isBueno() {
		return bueno;
	}

	public void setBueno(boolean bueno) {
		this.bueno = bueno;
	}

	public String getCarta() {
		return carta;
	}

	public void setCarta(String carta) {
		this.carta = carta;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	

}
