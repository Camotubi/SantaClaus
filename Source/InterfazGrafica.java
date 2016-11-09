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

public class InterfazGrafica {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;




	public InterfazGrafica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 206);
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
		listJuguetesDisponibles.setBounds(10, 11, 189, 84);
		panelSeleccionJuguetes.add(listJuguetesDisponibles);
		
		JList listJuguetesSeleccionados = new JList();
		listJuguetesSeleccionados.setBounds(209, 11, 215, 84);
		listJuguetesSeleccionados.setModel(new AbstractListModel() {
			String[] values = new String[] {"-"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panelSeleccionJuguetes.add(listJuguetesSeleccionados);
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBackground(Color.RED);
		frame.getContentPane().add(panelBotones, BorderLayout.SOUTH);
		
		JButton btnSiguiente = new JButton("Siguiente");
		panelBotones.add(btnSiguiente);
		
		JButton btnCancelar = new JButton("Cancelar");
		panelBotones.add(btnCancelar);
		
		JButton btnAtras = new JButton("Atras");
		panelBotones.add(btnAtras);
	}
	
	public void start()
	{
		frame.setVisible(true);
	}
}
