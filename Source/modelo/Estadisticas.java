package modelo;

import java.util.ArrayList;
public class Estadisticas {
	private ArrayList<Nino> listaPedidos = new ArrayList<Nino>();

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
}
