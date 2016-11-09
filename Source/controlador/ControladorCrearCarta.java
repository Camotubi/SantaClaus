package controlador;

import modelo.Estadisticas;
import vista.UICrearCarta;

public class ControladorCrearCarta {
	
	private UICrearCarta vista;
	private Estadisticas modelo;
	
	public ControladorCrearCarta(UICrearCarta vista, Estadisticas modelo)
	{
		this.vista = vista;
		this.modelo = modelo;
	}
	public void vistaVisible()
	{
		vista.start();
	}
	public UICrearCarta getVista() {
		return vista;
	}
	public void setVista(UICrearCarta vista) {
		this.vista = vista;
	}
	public Estadisticas getModelo() {
		return modelo;
	}
	public void setModelo(Estadisticas modelo) {
		this.modelo = modelo;
	}
}
