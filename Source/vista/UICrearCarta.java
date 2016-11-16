package vista;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.Estadisticas;
import modelo.Juguete;
import modelo.Nino;


import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.CardLayout;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.AbstractListModel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.awt.event.ActionEvent;

import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JInternalFrame;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollBar;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.SwingConstants;
@SuppressWarnings("unused")
public class UICrearCarta {

	private JFrame frame;
	private JTextField txtNombre;
	private JTextField txtEdad = new JTextField();
	private CardLayout cards = new CardLayout(0, 0);
	private JPanel panel_1 =new JPanel();
	private String currentPanelString;
	private JLabel lblEdad = new JLabel("Edad:");
	private Estadisticas Estadistica;
	private Nino ninoActual;
	private ArrayList<Juguete> listaJuguetesEscogibles;
	private JList listJuguetesDisponibles;
	DefaultListModel<String> modelo = new DefaultListModel<String>();
	DefaultListModel<String> modelo2 = new DefaultListModel<String>();
	private JScrollPane scrollPane = new JScrollPane();
	JList listJuguetesSeleccionados = new JList();
	private RespuestaSanta Resps;
	JComboBox cbGenero = new JComboBox();
	JTextPane Cartas = new JTextPane();
	JButton btnSiguiente = new JButton("Siguiente");
	JButton btnAtras = new JButton("Atras");
	
	JLabel picLabel,memLabel,FirmaSanta;
	
	public UICrearCarta() {
		initialize();
	}
	private JTextField txtPais;
	private JTextField txtDireccion;

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "rawtypes", "serial", "unchecked" })
	private void initialize() {
		BufferedImage myPicture = null;
		BufferedImage Membrete = null;
		BufferedImage FirmSanta = null;
		try {
			myPicture = ImageIO.read(UICrearCarta.class.getClassLoader().getResource("Imagenes/pepeSanta.jpg"));
			Membrete = ImageIO.read(UICrearCarta.class.getClassLoader().getResource("Imagenes/TopeDeCarta.jpg"));
			FirmSanta = ImageIO.read(UICrearCarta.class.getClassLoader().getResource("Imagenes/firma.jpg"));
		} catch (IOException e1) {
			JOptionPane.showMessageDialog(frame, "rip");
			e1.printStackTrace();
		}
		
		 Estadistica = new Estadisticas();
		 listJuguetesDisponibles = new JList();
		 scrollPane.setBounds(10, 39, 153, 107);
		 scrollPane.setViewportView(listJuguetesDisponibles);
		 
		 Estadistica.agregarJuguete("Mu�eca de Trapo","Mu�eca",0,18, "Imagenes/Mu�ecas/de_trapo.jpg");
			Estadistica.agregarJuguete("Mu�eca de Plastico Barbie","Mu�eca",0,18,"Imagenes/Mu�ecas/tipo_Barbie.jpg");
			Estadistica.agregarJuguete("Mu�eca Grande","Mu�eca",0,18,"");
			Estadistica.agregarJuguete("Batman","Figuras de accion",5,18,"");
			Estadistica.agregarJuguete("SuperMan","Figuras de accion",5,18,"");
			Estadistica.agregarJuguete("SuperGirl","Figuras de accion",5,18,"");
			Estadistica.agregarJuguete("Capitan America","Figuras de accion",5,18,"");
			Estadistica.agregarJuguete("Hulk","Figuras de accion",5,18,"");
			Estadistica.agregarJuguete("Iron Man","Figuras de accion",5,18,"");
			Estadistica.agregarJuguete("Hombre Ara�a","Figuras de accion",5,18,"");
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
		currentPanelString = "panelDatosNino";
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 866, 562);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(new BorderLayout(0, 0));
		
		
		getFrame().getContentPane().add(getPanel_1(), BorderLayout.CENTER);
		
		getPanel_1().setLayout(getCards());
		
		JPanel panelDatosNino = new JPanel();
		getPanel_1().add(panelDatosNino, "panelDatosNino");
		
		JLabel lblNombre = new JLabel("Nombre:");
		panelDatosNino.add(lblNombre);
		
		
		txtNombre = new JTextField();
		panelDatosNino.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad:");
		panelDatosNino.add(lblEdad);
		
		
		panelDatosNino.add(txtEdad);
		txtEdad.setColumns(10);
		
		JLabel lblGenero = new JLabel("Genero:");
		panelDatosNino.add(lblGenero);
		
		
		panelDatosNino.add(cbGenero);
		cbGenero.setModel(new DefaultComboBoxModel(new String[] {"M", "F"}));
		
		JLabel lblPais = new JLabel("Pais:");
		panelDatosNino.add(lblPais);
		
		txtPais = new JTextField();
		panelDatosNino.add(txtPais);
		txtPais.setColumns(10);
		
		JPanel panelSeleccionJuguetes = new JPanel();
		getPanel_1().add(panelSeleccionJuguetes, "panelSeleccionJuguetes");
		panelSeleccionJuguetes.setLayout(null);
		
		panelSeleccionJuguetes.add(scrollPane);
		listJuguetesDisponibles.setBounds(10, 39, 189, 84);
		//panelSeleccionJuguetes.add(listJuguetesDisponibles);
		
		
		listJuguetesSeleccionados.setBounds(303, 40, 215, 106);
		listJuguetesSeleccionados.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panelSeleccionJuguetes.add(listJuguetesSeleccionados);
		
		JLabel lblJuguetesDisponibles = new JLabel("Juguetes Disponibles");
		lblJuguetesDisponibles.setBounds(49, 14, 114, 14);
		panelSeleccionJuguetes.add(lblJuguetesDisponibles);
		
		JLabel lblJuguetesSeleccionados = new JLabel("Juguetes Seleccionados");
		lblJuguetesSeleccionados.setBounds(327, 14, 123, 14);
		panelSeleccionJuguetes.add(lblJuguetesSeleccionados);
		
		JButton buttonSeleccionar = new JButton("->");
		buttonSeleccionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(modelo2.getSize()>=5)
				{
					JOptionPane.showMessageDialog(frame, "son solo 5 juguetes boi ._.");
				}
				else
				{
					modelo2.addElement((String) listJuguetesDisponibles.getSelectedValue());
					int iJugueteSeleccionado = listJuguetesDisponibles.getSelectedIndex();
					modelo.removeElementAt(iJugueteSeleccionado);
				}

				
				
			}
		});
		buttonSeleccionar.setBounds(209, 61, 53, 23);
		panelSeleccionJuguetes.add(buttonSeleccionar);
		
		JButton button = new JButton("<-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				modelo.addElement((String)listJuguetesSeleccionados.getSelectedValue());
				if(listJuguetesSeleccionados.getSelectedValue()==null)
						throw new SelectionException(listJuguetesSeleccionados.getSelectedValue()); 
				int iJugueteSeleccionado = listJuguetesSeleccionados.getSelectedIndex();
				modelo2.removeElementAt(iJugueteSeleccionado);
			}
				catch (SelectionException e1) {
					JOptionPane.showMessageDialog(null, "Seleccione un juguete primero");
				}
			}
		});
		button.setBounds(209, 95, 53, 23);
		panelSeleccionJuguetes.add(button);
		
		JButton btnVerJuguete = new JButton("Ver Juguete");
		btnVerJuguete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VerImagen();
			}
		});
		btnVerJuguete.setBounds(192, 123, 101, 23);
		panelSeleccionJuguetes.add(btnVerJuguete);
		
		JPanel panelCarta = new JPanel();
		panel_1.add(panelCarta, "panelCarta");
		panelCarta.setLayout(null);
		
		
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 143, 850, 305);
		panelCarta.add(scrollPane_1);
		
		
		scrollPane_1.setViewportView(Cartas);
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBackground(Color.RED);
		getFrame().getContentPane().add(panelBotones, BorderLayout.SOUTH);
		
		scrollPane.setViewportView(listJuguetesDisponibles);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		panelDatosNino.add(lblDireccion);
		
		txtDireccion = new JTextField();
		panelDatosNino.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		picLabel = new JLabel(new ImageIcon(myPicture)); // pepe magic
		panelDatosNino.add(picLabel);
		
		memLabel = new JLabel(new ImageIcon(Membrete)); // membrete
		memLabel.setLocation(0, 0);
		memLabel.setSize(new Dimension(850, 142));
		panelCarta.add(memLabel);
		
		FirmaSanta = new JLabel(new ImageIcon(FirmSanta)); // firma santa
		FirmaSanta.setVerticalTextPosition(SwingConstants.BOTTOM);
		FirmaSanta.setVerticalAlignment(SwingConstants.BOTTOM);
		FirmaSanta.setBounds(0, 447, 850, 44);
		panelCarta.add(FirmaSanta);
		
		
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switch(currentPanelString)
				{
				
				case "panelDatosNino":
					
					break;
				case "panelSeleccionJuguetes":
					currentPanelString = "panelDatosNino";
					btnSiguiente.setText("Siguiente");
					break;
				case "panelCarta":
					currentPanelString = "panelSeleccionJuguetes";
					break;
				}
				getCards().previous(getPanel_1());
			}
		});
		panelBotones.add(btnAtras);
		
		JButton btnSanta = new JButton("Estadistico 3000");
		btnSanta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(JOptionPane.showInputDialog("SANTA, INGRESA LA CONTRASE�A ( si eres santa, la contrase�a es pepe )").equals("pepe"))
				{
					JOptionPane.showMessageDialog(frame, "Estadisdtico" + Estadistica.getModaGeneral());
				}
				else JOptionPane.showMessageDialog(frame, "No eres santa -.- ");
			}
		});
		panelBotones.add(btnSanta);
		
		
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nextPanel();
				//ControladorCrearCarta objCont = new ControladorCrearCarta();	
				
				
			}
		});
		panelBotones.add(btnSiguiente);
		listJuguetesSeleccionados.setModel(modelo2);
	}
	
	public void start()
	{
		getFrame().setVisible(true);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public CardLayout getCards() {
		return cards;
	}

	public void setCards(CardLayout cards) {
		this.cards = cards;
	}

	public JPanel getPanel_1() {
		return panel_1;
	}

	public void setPanel_1(JPanel panel_1) {
		this.panel_1 = panel_1;
	}
	
	public void nextPanel()
	{
		switch(currentPanelString)
		{
		
		case "panelDatosNino":
		{
			btnAtras.setEnabled(true);
			btnSiguiente.setText("Enviar Carta");
			String nombreNino = txtNombre.getText();
			int edadNino;
			try
			{
				edadNino = Integer.parseInt(txtEdad.getText());
				ninoActual = new Nino(nombreNino,edadNino,(String)cbGenero.getSelectedItem(),txtPais.getText(),txtDireccion.getText(),true);
				if(edadNino<18)
				{
					currentPanelString ="panelSeleccionJuguetes";
					generarListaSeleccionable();
					modelo.removeAllElements();
					modelo2.removeAllElements();
					for(int i = 0; i<listaJuguetesEscogibles.size();i++)
					{
						modelo.addElement(listaJuguetesEscogibles.get(i).getNombre());	
					}
					System.out.println("HALP"+ modelo.getElementAt(1));
					listJuguetesDisponibles.setModel(modelo);
					getCards().next(getPanel_1());
				}
				else
				{
					JOptionPane.showMessageDialog(frame, "eestas viejo");
				}
			}
			catch (NumberFormatException e)
			{
				JOptionPane.showMessageDialog(frame, "Corrige tu edad porfa");
			}
			
		}
			
			
			break;
		case "panelSeleccionJuguetes":
			
			currentPanelString ="panelCarta";
			Random random = new Random();
			int numtemp = (int) ( Math.random() * 2 + 1);// ni�o bueno o malo sirve
			if(numtemp%2 ==0)
			{
				ninoActual.setBueno(true);

			}
			else
				{ninoActual.setBueno(false);

				}
				
			
			ninoActual.setJuguetes( Arrays.copyOf(modelo2.toArray(), modelo2.toArray().length, String[].class));
			if(ninoActual.isBueno()==true)
			{
				
				Cartas.setText(generarRespuestaSanta(ninoActual));
			}
			else
			{	Cartas.setText(generarRespuestaSanta(ninoActual));
				Cartas.setText(generarRespuestaSanta(ninoActual));
				
			}
			getCards().next(getPanel_1());
			Estadistica.agregarPedido(ninoActual);
			btnSiguiente.setText("Turno de otro ni�o");
			btnAtras.setEnabled(false);
			break;
		case "panelCarta":
			btnSiguiente.setText("Siguiente");
			currentPanelString ="panelDatosNino";
			getCards().next(getPanel_1());
			break;
		}
		}	
	

	public void VerImagen()
	{
		String temp = listJuguetesDisponibles.getSelectedValue().toString();
		String DirImg="";
		for(int i =0;i<Estadistica.getCantJuguetes();i++)
		{
			if(Estadistica.getArregloJuguetes()[i].getNombre()==temp )
			{
				DirImg = Estadistica.getArregloJuguetes()[i].getDirImg();
				break;
			}
			
		}
		ImageIcon Icon;
		System.out.println(DirImg);
		Icon = new ImageIcon(UICrearCarta.class.getClassLoader().getResource(DirImg));	
        JOptionPane.showMessageDialog(null, null, null, JOptionPane.PLAIN_MESSAGE, Icon);

		
		
		
	}
	
	public void generarListaSeleccionable()
	{
		listaJuguetesEscogibles = new ArrayList<Juguete>();
		for(int i = 0; i<Estadistica.getCantJuguetes(); i++)
		{
			if(Integer.parseInt((txtEdad.getText())) >=Estadistica.getArregloJuguetes()[i].getEdadMin())
			{
				listaJuguetesEscogibles.add(Estadistica.getArregloJuguetes()[i]);
				
			}
		}
		for(int i = 0; i<listaJuguetesEscogibles.size(); i++)
		{
			System.out.println(listaJuguetesEscogibles.get(i).getNombre()+ " " + listaJuguetesEscogibles.get(i).getEdadMin());
		}
	}
	
	public String generarRespuestaSanta(Nino nino)
	{
		StringBuilder strbuild = new StringBuilder();
		if(nino.isBueno())
		{
			
			
			strbuild.append(""
					+"Polo Norte, _de noviembre del 2016\r\n"
					+ nino.getNombre()
					+ "\nDireccion\r\n"
					+nino.getDireccion()
					
					+"\nPais"
					+ nino.getPais()
					+ "\n\r\nQuerido "
					+ nino.getNombre()
					+ ",\r\n\r\nHe le\u00EDdo tu carta y he comprobado que est\u00E1s en mi lista de ni\u00F1os buenos. Te felicito"
					+ nino.getNombre()
					+ " porque te portas bien\r\ncon tu pap\u00E1 y mam\u00E1. Por esto para esta Navidad te llevar\u00E9\r\n\r"
	);
			
			for(int i = 0; i<nino.getJuguetes().length;i++)
			{
				strbuild.append("\n" + nino.getJuguetes(i)+"\n");
			}
			
			strbuild.append(
					"\r\n\r\nSigue port\u00E1ndote bien, sacando buenas notas en el Colegio y "
							+ "siendo obediente a tus padres\r\n\r\n\u00A1Te deseo una muy Feliz "
							+ "Navidad!\r\n\r\nJOJOJOJO\r\n\r\n"
					);
			
			System.out.println(strbuild.toString());
		}
		else
		{
			strbuild.append("Polo Norte, _de noviembre del 20161\r\n"
					+ nino.getNombre()
					+ "\nDireccion\r\n"
					+nino.getDireccion()
					
					+"\nPais"
					+ nino.getPais()
					+ "\r\n\r\nQuerido "
					+ nino.getNombre()
					+ ",\r\n\r\nHe le\u00EDdo tu carta y he comprobado que no est\u00E1s en mi lista de ni"
					+ "\u00F1os buenos, te has portado mal con pap\u00E1 y\r\nmam\u00E1.\r\nY aunque no te has portado bien, te dar\u00E9 una oportunidad para que mejores. "
					+ "Si en este mes mejoras tu\r\nconducta, te llevar\u00E1s lo que me has pedido que es:\r\n\r\n"
					+ "");
			
			for(int i = 0; i<nino.getJuguetes().length;i++)
			{
				strbuild.append("\n" + nino.getJuguetes(i)+"\n");
			}
					strbuild.append("r\n\r\nSi continuas port\u00E1ndote mal, "
							+ "uno de mis duendes te llevar\u00E1 carb\u00F3n.\r\n\r\nAs\u00ED que p\u00F3rtate bien "
							+ nino.getNombre()
							+ ", se que eres en el fondo un ni\u00F1o muy bueno.\r\n\r\n\r\n\u00A1Te deseo una muy "
							+ "Feliz Navidad!\r\n\r\n\r\nJOJOJOJO\r\n\r\n\r\n");
					
					
		}
		return strbuild.toString();
		
		
	}
}
