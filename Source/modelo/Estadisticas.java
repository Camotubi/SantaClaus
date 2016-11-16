package modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
public class Estadisticas {
	private Juguete[] arregloJuguetes = new Juguete[100];
	private Nino[] arregloNinos = new Nino[100];
	private String[] arregloPedidos = new String [1000];
	private int cantJuguetes=0;
	private int cantNinos =0;
	private int cantPedidos = 0;
	private String modaGeneral;
	private String modaVaronil;
	private String modaFemenina;


	public void agregarPedido( Nino nino)
	{
		getArregloNinos()[cantNinos++] = nino;
		for(int i = 0; i<nino.getJuguetes().length;i++)
		{
			getArregloPedidos()[cantPedidos++] = nino.getJuguetes()[i];
		}
		moda();
	}
	public void agregarJuguete(String nombre, String tipo, int edadMin, int edadMax, String DirImg)
	{
		getArregloJuguetes()[cantJuguetes++] = new Juguete(nombre,tipo,edadMin,edadMax, DirImg);
	}


	
	
	public void moda() {
		ArrayList<Integer> listpedidosGenerales = new ArrayList<Integer>();
		ArrayList<Integer> listpedidosNinos = new ArrayList<Integer>();
		ArrayList<Integer> listpedidosNinas = new ArrayList<Integer>();
	    for(int i = 0; i<cantJuguetes;i++)
	    {
	    	if(getArregloJuguetes()[i] != null)
	    	{
	    		for(int x = 0 ; x < cantPedidos;x++)
	    		{
	    			if(getArregloPedidos()[x]!=null)
		    			{
	    					if(getArregloPedidos()[x].equals(getArregloJuguetes()[i].getNombre()))
			    			{
			    				listpedidosGenerales.add(i);
			    				if(getArregloNinos()[x].getGenero()=="M")
			    					listpedidosNinos.add(i);
			    				else
			    					listpedidosNinas.add(i);
			    			}
	    					
		    			}
	    		}	
	    	}
	    }
	    Collections.sort(listpedidosGenerales);
	    Collections.sort(listpedidosNinos);
	    Collections.sort(listpedidosNinas);
	    // Moda General
	    int anterior =listpedidosGenerales.get(0) ;
	    int moda = listpedidosGenerales.get(0);
	    int count = 1;
	    int maxCount = 1;

	    for (int i = 1; i <listpedidosGenerales.size(); i++) {
	    	if(listpedidosGenerales.get(i)!= 0){
	    		if (listpedidosGenerales.get(i) == anterior)
		            count++;
		        else {
		            if (count > maxCount) {
		                moda = listpedidosGenerales.get(i-1);
		                maxCount = count;
		            }
		            anterior = listpedidosGenerales.get(i);
		            count = 1;
		        }
	    	}
	        
	    }
	    if(count>maxCount)
	    {
	    	this.setModaGeneral(getArregloJuguetes()[listpedidosGenerales.get(listpedidosGenerales.size()-1)].getNombre());
	    	System.out.println("poraca");
	    }
	    else
	    {
	    	this.setModaGeneral(getArregloJuguetes()[moda].getNombre());
	    	System.out.println("poraqui");
	    }
	    //Moda ninos
	    if(listpedidosNinos.size()>0)
	    {
	    	anterior =listpedidosNinos.get(0) ;
		    moda = listpedidosNinos.get(0);
		    count = 1;
		    maxCount = 1;

		    for (int i = 1; i <listpedidosNinos.size(); i++) {
		    	if(listpedidosNinos.get(i)!= 0){
		    		if (listpedidosNinos.get(i) == anterior)
			            count++;
			        else {
			            if (count > maxCount) {
			                moda = listpedidosNinos.get(i-1);
			                maxCount = count;
			            }
			            anterior = listpedidosNinos.get(i);
			            count = 1;
			        }
		    	}
		        
		    }
		    if(count>maxCount)
		    {
		    	this.setModaVaronil(getArregloJuguetes()[listpedidosNinos.get(listpedidosNinos.size()-1)].getNombre());
		    	System.out.println("poraca");
		    }
		    else
		    {
		    	this.setModaVaronil(getArregloJuguetes()[moda].getNombre());
		    	System.out.println("poraqui");
		    }
	    }
	    
	    //Moda Ninas
	    if(listpedidosNinas.size()>0)
	    {
	    	 anterior =listpedidosNinas.get(0) ;
	 	    moda = listpedidosNinas.get(0);
	 	    count = 1;
	 	    maxCount = 1;

	 	    for (int i = 1; i <listpedidosNinas.size(); i++) {
	 	    	if(listpedidosNinas.get(i)!= 0){
	 	    		if (listpedidosNinas.get(i) == anterior)
	 		            count++;
	 		        else {
	 		            if (count > maxCount) {
	 		                moda = listpedidosNinas.get(i-1);
	 		                maxCount = count;
	 		            }
	 		            anterior = listpedidosNinas.get(i);
	 		            count = 1;
	 		        }
	 	    	}
	 	        
	 	    }
	 	    if(count>maxCount)
	 	    {
	 	    	this.setModaFemenina(getArregloJuguetes()[listpedidosNinas.get(listpedidosNinas.size()-1)].getNombre());
	 	    	System.out.println("poraca");
	 	    }
	 	    else
	 	    {
	 	    	this.setModaFemenina(getArregloJuguetes()[moda].getNombre());
	 	    	System.out.println("poraqui");
	 	    }
	    }
	   
	    	
	    	
	    	
	 
	    	

	}
	public String[] getArregloPedidos() {
		return arregloPedidos;
	}
	public void setArregloPedidos(String[] arregloPedidos) {
		this.arregloPedidos = arregloPedidos;
	}
	public Nino[] getArregloNinos() {
		return arregloNinos;
	}
	public void setArregloNinos(Nino[] arregloNinos) {
		this.arregloNinos = arregloNinos;
	}
	public String getModaGeneral() {
		return modaGeneral;
	}
	public void setModaGeneral(String modaGeneral) {
		this.modaGeneral = modaGeneral;
	}
	public String getModaVaronil() {
		return modaVaronil;
	}
	public void setModaVaronil(String modaVaronil) {
		this.modaVaronil = modaVaronil;
	}
	public String getModaFemenina() {
		return modaFemenina;
	}
	public void setModaFemenina(String modaFemenina) {
		this.modaFemenina = modaFemenina;
	}
	public int getCantPedidos() {
		return cantPedidos;
	}
	public void setCantPedidos(int cantPedidos) {
		this.cantPedidos = cantPedidos;
	}
	public int getCantNinos() {
		return cantNinos;
	}
	public void setCantNinos(int cantNinos) {
		this.cantNinos = cantNinos;
	}
	public int getCantJuguetes() {
		return cantJuguetes;
	}
	public void setCantJuguetes(int cantJuguetes) {
		this.cantJuguetes = cantJuguetes;
	}
	public Juguete[] getArregloJuguetes() {
		return arregloJuguetes;
	}
	public void setArregloJuguetes(Juguete[] arregloJuguetes) {
		this.arregloJuguetes = arregloJuguetes;
	}
}
