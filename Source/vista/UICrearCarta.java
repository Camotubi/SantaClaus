package vista;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import java.awt.Color;

@SuppressWarnings("unused")
public class UICrearCarta {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;




	public UICrearCarta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "rawtypes", "serial", "unchecked" })
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 513, 229);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JPanel panelDatosNino = new JPanel();
		panel_1.add(panelDatosNino, "name_14757602380866");
		
		JLabel lblNombre = new JLabel("Nombre:");
		panelDatosNino.add(lblNombre);
		
		textField = new JTextField();
		panelDatosNino.add(textField);
		textField.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad:");
		panelDatosNino.add(lblEdad);
		
		textField_1 = new JTextField();
		panelDatosNino.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblGenero = new JLabel("Genero:");
		panelDatosNino.add(lblGenero);
		
		JComboBox comboBox = new JComboBox();
		panelDatosNino.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"M", "F"}));
		
		JPanel panelSeleccionJuguetes = new JPanel();
		panel_1.add(panelSeleccionJuguetes, "name_14757608112321");
		panelSeleccionJuguetes.setLayout(null);
		
		JList listJuguetesDisponibles = new JList();
		listJuguetesDisponibles.setBounds(10, 39, 189, 84);
		panelSeleccionJuguetes.add(listJuguetesDisponibles);
		
		JList listJuguetesSeleccionados = new JList();
		listJuguetesSeleccionados.setBounds(272, 39, 215, 84);
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
		buttonSeleccionar.setBounds(209, 61, 53, 23);
		panelSeleccionJuguetes.add(buttonSeleccionar);
		
		JButton button = new JButton("<-");
		button.setBounds(209, 95, 53, 23);
		panelSeleccionJuguetes.add(button);
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBackground(Color.RED);
		frame.getContentPane().add(panelBotones, BorderLayout.SOUTH);
		
		JButton btnAtras = new JButton("Atras");
		panelBotones.add(btnAtras);
		
		JButton btnCancelar = new JButton("Cancelar");
		panelBotones.add(btnCancelar);
		
		JButton btnSiguiente = new JButton("Siguiente");
		panelBotones.add(btnSiguiente);
	}
	
	public void start()
	{
		frame.setVisible(true);
	}
}
