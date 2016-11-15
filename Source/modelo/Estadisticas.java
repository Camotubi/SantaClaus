package modelo;

import java.util.ArrayList;
public class Estadisticas {
	private ArrayList<Nino> listaPedidos = new ArrayList<Nino>();
	private ArrayList<Juguete> listaJuguetes = new ArrayList<Juguete>();

	public ArrayList<Nino> getListaPedidos() {
		return listaPedidos;
	}

	public void setListaPedidos(ArrayList<Nino> listaPedidos) {
		this.listaPedidos = listaPedidos;
	}
	
	public Nino getListaPedidos(int indice) {
		return listaPedidos.get(indice);
	}

	public void setListaPedidos(Nino nino) {
		this.listaPedidos.add(nino);
	}
	public void agregarJuguete(String nombre, String tipo, int edadMin, int edadMax, String DirImg)
	{
		getListaJuguetes().add(new Juguete(nombre,tipo,edadMin,edadMax, DirImg));
	}

	public ArrayList<Juguete> getListaJuguetes() {
		return listaJuguetes;
	}

	public void setListaJuguetes(ArrayList<Juguete> listaJuguetes) {
		this.listaJuguetes = listaJuguetes;
	}
}
