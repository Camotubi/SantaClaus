package modelo;

import java.util.ArrayList;
import java.util.Arrays;
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
		int[] a = new int[getArregloPedidos().length];

	    for(int i = 0; i<cantJuguetes;i++)
	    {
	    	if(getArregloJuguetes()[i] != null)
	    	{
	    		for(int x = 0 ; x < cantPedidos;x++)
	    		{
	    			if(getArregloPedidos()[x]!=null)
		    			{
	    				System.out.println("a"+getArregloPedidos()[x]);
	    				System.out.println("b"+getArregloJuguetes()[i].getNombre());
	    					if(getArregloPedidos()[x].equals(getArregloJuguetes()[i].getNombre()))
		    			
			    			{
	    						System.out.println("waddup");
			    				a[x] = i+1;
			    			}
		    			}
	    		}	
	    	}
	    }
	    Arrays.sort(a);

	    int anterior = a[0];
	    int moda = a[0];
	    int count = 1;
	    int maxCount = 1;
for(int i =0;i<a.length;i++)
{
	if(a[i] !=0)
	{
		anterior = a[i];
		break;
	}
}
	    for (int i = 1; i < a.length; i++) {
	    	if(a[i] != 0){
	    		if (a[i] == anterior)
		            count++;
		        else {
		            if (count > maxCount) {
		                moda = a[i-1];
		                maxCount = count;
		            }
		            anterior = a[i];
		            count = 1;
		        }
	    	}
	        
	    }
	    if(count>maxCount)
	    {
	    	this.setModaGeneral(getArregloJuguetes()[a[a.length-1]-1].getNombre());
	    	System.out.println("poraca");
	    }
	    else
	    {
	    	this.setModaGeneral(getArregloJuguetes()[moda-1].getNombre());
	    	System.out.println("poraqui");
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
