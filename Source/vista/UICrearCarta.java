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
import javax.swing.AbstractListModel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;
import controlador.ControladorCrearCarta;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JInternalFrame;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollBar;
@SuppressWarnings("unused")
public class UICrearCarta {

	private JFrame frame;
	private JTextField txtNombre;
	private JTextField txtEdad = new JTextField();
	private CardLayout cards = new CardLayout(0, 0);
	private JPanel panel_1 = new JPanel();
	private String currentPanelString;
	private JLabel lblEdad = new JLabel("Edad:");
	private Estadisticas Estadistica;
	private Nino ninoActual;
	private ArrayList<Juguete> listaJuguetesEscogibles;
	private JList listJuguetesDisponibles;
	DefaultListModel<String> modelo = new DefaultListModel<String>();
	DefaultListModel<String> modelo2 = new DefaultListModel<String>();
	private JScrollPane scrollPane = new JScrollPane();
	private ControladorCrearCarta objParaNino;
	private RespuestaSanta Resps;
	JComboBox cbGenero = new JComboBox();
	JTextPane CartaBuena = new JTextPane();
	JTextPane CartaMala = new JTextPane();
	
	public UICrearCarta() {
		initialize();
	}
	ControladorCrearCarta objCont;	
	private JTextField txtPais;

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "rawtypes", "serial", "unchecked" })
	private void initialize() {
		 Estadistica = new Estadisticas();
		 listJuguetesDisponibles = new JList();
		 scrollPane.setBounds(10, 39, 153, 84);
		 scrollPane.setViewportView(listJuguetesDisponibles);
		 
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
		currentPanelString = "panelDatosNino";
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 597, 326);
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
		
		JList listJuguetesSeleccionados = new JList();
		listJuguetesSeleccionados.setBounds(303, 40, 215, 84);
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
				
				modelo.addElement((String)listJuguetesSeleccionados.getSelectedValue());
				int iJugueteSeleccionado = listJuguetesSeleccionados.getSelectedIndex();
				modelo2.removeElementAt(iJugueteSeleccionado);
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
		panel_1.add(panelCarta, "name_28049969656295");
		panelCarta.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 581, 255);
		panelCarta.add(scrollPane_1);
		
		scrollPane_1.setViewportView(CartaBuena);
		scrollPane_1.setViewportView(CartaMala);
		JPanel panelBotones = new JPanel();
		panelBotones.setBackground(Color.RED);
		getFrame().getContentPane().add(panelBotones, BorderLayout.SOUTH);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getCards().previous(getPanel_1());
			}
		});
		panelBotones.add(btnAtras);
		
		JButton btnCancelar = new JButton("Cancelar");
		panelBotones.add(btnCancelar);
		
		JButton btnSiguiente = new JButton("Siguiente");
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
		if(currentPanelString =="panelDatosNino"){
			if(Integer.parseInt(txtEdad.getText())<18)
			{
				currentPanelString ="PanelEleRegalos";
				generarListaSeleccionable();
				ninoActual = new Nino(txtNombre.getText(),Integer.parseInt(txtEdad.getText()),(String)cbGenero.getSelectedItem(),txtPais.getText(),true);
				for(int i = 0; i<listaJuguetesEscogibles.size();i++)
				{
					
					modelo.addElement(listaJuguetesEscogibles.get(i).getNombre());
					
				}
				System.out.println("HALP"+ modelo.getElementAt(1));
				listJuguetesDisponibles.setModel(modelo);
				getCards().next(getPanel_1());
				scrollPane.setViewportView(listJuguetesDisponibles);
				
			}
		else
			{JOptionPane.showMessageDialog(frame, "eestas viejo");
			}
			
		}
		else {
			if(currentPanelString=="PanelEleRegalos") // cambio de pantalla
			{
				currentPanelString ="panelDatosNino";
				Random random = new Random();
				int numtemp = random.nextInt(50);// test para saber si nino bueno o malo
				if(numtemp%2 ==0)
				{
					ninoActual.setBueno(true);
				}
				else
					ninoActual.setBueno(false);
				
				if(ninoActual.isBueno()==true)
				{
					getCards().next(getPanel_1());
					CartaBuena.setText("\t\t\t\t// imagen navide\u00F1a\r\n\r\nPolo Norte, ____ de noviembre de 2016\r\n\r\nNombre_del_ni\u00F1o\r\n\r\nDirecci\u00F3n\r\n\r\nPa\u00EDs\r\n\r\nQuerido XXX,\r\n\r\nHe le\u00EDdo tu carta y he comprobado que est\u00E1s en mi lista de ni\u00F1os buenos. Te felicito XXX porque te portas bien\r\ncon tu pap\u00E1 y mam\u00E1. Por esto para esta Navidad te llevar\u00E9\r\n\r\n(lista de lo que pidi\u00F3 el ni\u00F1o)\r\n\r\nSigue port\u00E1ndote bien, sacando buenas notas en el Colegio y siendo obediente a tus padres\r\n\r\n\u00A1Te deseo una muy Feliz Navidad!\r\n\r\nJOJOJOJO\r\n\r\nSanta Claus \uF0E0 Esto debe ser una imagen con la firma Santa Claus");				}
				else
				{	
				
				CartaMala.setText("\t\t\t\t// imagen navide\u00F1a\r\n\r\nPolo Norte, ____ de noviembre de 2016\r\n\r\nNombre_del_ni\u00F1o\r\n\r\nDirecci\u00F3n\r\n\r\nPa\u00EDs\r\n\r\nQuerido XXX,\r\n\r\nHe le\u00EDdo tu carta y he comprobado que est\u00E1s en mi lista de ni\u00F1os buenos. Te felicito XXX porque te portas bien\r\ncon tu pap\u00E1 y mam\u00E1. Por esto para esta Navidad te llevar\u00E9\r\n\r\n(lista de lo que pidi\u00F3 el ni\u00F1o)\r\n\r\nSigue port\u00E1ndote bien, sacando buenas notas en el Colegio y siendo obediente a tus padres\r\n\r\n\u00A1Te deseo una muy Feliz Navidad!\r\n\r\nJOJOJOJO\r\n\r\nSanta Claus \uF0E0 Esto debe ser una imagen con la firma Santa Claus");			}
				}
			}
		
	}
	
	public void VerImagen()
	{
		String temp = listJuguetesDisponibles.getSelectedValue().toString();
		String DirImg="";
		for(int i =0;i<Estadistica.getListaJuguetes().size();i++)
		{
			if(Estadistica.getListaJuguetes().get(i).getNombre()==temp )
			{
				DirImg = Estadistica.getListaJuguetes().get(i).getDirImg();
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
		for(int i = 0; i<Estadistica.getListaJuguetes().size() ; i++)
		{
			if(Integer.parseInt((txtEdad.getText())) >=Estadistica.getListaJuguetes().get(i).getEdadMin())
			{
				listaJuguetesEscogibles.add(Estadistica.getListaJuguetes().get(i));
				
			}
		}
		for(int i = 0; i<listaJuguetesEscogibles.size(); i++)
		{
			System.out.println(listaJuguetesEscogibles.get(i).getNombre()+ " " + listaJuguetesEscogibles.get(i).getEdadMin());
		}
	}
}
