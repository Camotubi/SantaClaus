package controlador;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

import modelo.Estadisticas;
import modelo.Juguete;
import modelo.Nino;
import vista.UICrearCarta;

public class ControladorCrearCarta {
	
	private UICrearCarta vista;
	private Estadisticas Estadistica;
	private Nino ninoActual;
	private ArrayList<Juguete> listaJugutesEscogibles;
	
	public ControladorCrearCarta(UICrearCarta vista, Estadisticas modelo)
	{
		this.vista = vista;
		this.Estadistica = modelo;
		Estadistica.agregarJuguete("Muñeca de Trapo","Muñeca",0,18, "Imagenes/Muñecas/de_trapo.jpg");
		Estadistica.agregarJuguete("Muñeca de Plastico Barbie","Muñeca",0,18,"Imagenes/Muñecas/tipo_Barbie.jpg");
		Estadistica.agregarJuguete("Muñeca Grande","Muñeca",0,18,"");
		Estadistica.agregarJuguete("Batman","Figuras de accion",5,18,"");
		Estadistica.agregarJuguete("SuperMan","Figuras de accion",5,18,"");
		Estadistica.agregarJuguete("SuperGirl","Figuras de accion",5,18,"");
		Estadistica.agregarJuguete("Capitan America","Figuras de accion",5,18,"");
		Estadistica.agregarJuguete("Hulk","Figuras de accion",5,18,"");
		Estadistica.agregarJuguete("Iron Man","Figuras de accion",5,18,"");
		Estadistica.agregarJuguete("Hombre Araña","Figuras de accion",5,18,"");
		Estadistica.agregarJuguete("Calcetin con RombosMan","Figuras de accion",5,18,"");
		Estadistica.agregarJuguete("Bicicleta","Transporte",0,18,"");
		Estadistica.agregarJuguete("Triciclo","Transporte",0,18,"");
		Estadistica.agregarJuguete("Patineta","Transporte",0,18,"");
		Estadistica.agregarJuguete("Patines","Transporte",0,18,"");
		Estadistica.agregarJuguete("Camion de Bomberos","Juego de Carros",0,18,"");
		Estadistica.agregarJuguete("Camiones grandes","Juego de Carros",0,18,"");
		Estadistica.agregarJuguete("HOT WHEELSSSS","Juego de Carros",5,18,"");
		Estadistica.agregarJuguete("Juego de Te","Juego de Te",5,18,"");
		Estadistica.agregarJuguete("Pelota de Volleyball","Pelota",0,18,"");
		Estadistica.agregarJuguete("Baseball","Pelota",0,18,"");
		Estadistica.agregarJuguete("Basketball","Pelota",0,18,"");
		Estadistica.agregarJuguete("Football","Pelota",0,18,"");
		Estadistica.agregarJuguete("Tenis","Pelota",0,18,"");
		Estadistica.agregarJuguete("Pin Pon","Pelota",5,18,"");
	}
	
	public void inicializar()
	{

		
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
		return Estadistica;
	}
	public void setModelo(Estadisticas modelo) {
		this.Estadistica = modelo;
	}



	public void nextPane()
	{
		
	}
	
	public void generateChoosableToys()
	{
		
		//vista.getCards().next(vista.getPanel_1());;
		for(int i = 0; i<Estadistica.getListaJuguetes().size() ; i++)
		{
			
		}
	}
	
	public Nino testNinobueno()
	{
		boolean temp;
		Random random = new Random();
		int numtemp = random.nextInt(50);
		if(numtemp%2 ==0)
		{
			ninoActual.setBueno(true);
		}
		else
			ninoActual.setBueno(false);
		//ninoActual.setBueno(temp);
		return ninoActual;
	}
}
