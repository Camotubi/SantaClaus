package modelo;

public class Nino {
	private String nombre;
	private int edad;
	private char genero;
	private String pais;
	private String[] juguetes;
	private boolean bueno;
	private String carta;
	
	public Nino(String nombre, int edad, char genero, String pais, boolean bueno)
	{
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.setPais(pais);
		this.setJuguetes(new String[5]);
		this.setBueno(bueno);
		this.setCarta("");
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

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
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


	

}
