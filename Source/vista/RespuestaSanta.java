package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.Point;
import java.awt.Dimension;
import javax.swing.JPanel;

public class RespuestaSanta {
/*
 * Creee otra clase para esta wea porque puse el frame mas grande y asi cuando se cierra este frame se puede seguir trabajando en el otro
 * 
 * 
 * */
	// atributos
	private boolean NinoStatus;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RespuestaSanta window = new RespuestaSanta();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RespuestaSanta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLocation(new Point(50, 100));
		frame.setBounds(100, 100, 895, 406);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		if(getNinoStatus() == true )
		{
		JPanel panel_Bueno = new JPanel();
		frame.getContentPane().add(panel_Bueno, BorderLayout.NORTH);
		JTextArea ninoBueno = new JTextArea();
		ninoBueno.setVisible(true);
		ninoBueno.setText("\r\n\t\t\t\t\t\t\t\t\t// imagen navide\u00F1a\r\n\r\nPolo Norte, ____de noviembre del 20161\r\nNombre__DelNi\u00F1o\r\nDireccion\r\nPais\r\n\r\nQuerido XXX,\r\n\r\nHe le\u00EDdo tu carta y he comprobado que est\u00E1s en mi lista de ni\u00F1os buenos. Te felicito XXX porque te portas bien\r\ncon tu pap\u00E1 y mam\u00E1. Por esto para esta Navidad te llevar\u00E9\r\n\r\n(lista de lo que pidi\u00F3 el ni\u00F1o)\r\n\r\nSigue port\u00E1ndote bien, sacando buenas notas en el Colegio y siendo obediente a tus padres\r\n\r\n\u00A1Te deseo una muy Feliz Navidad!\r\n\r\nJOJOJOJO\r\n\r\nSanta Claus \uF0E0 Esto debe ser una imagen con la firma Santa Claus");
		ninoBueno.setSize(new Dimension(100, 100));
		panel_Bueno.add(ninoBueno);
		}
		else {
		JPanel panel_Malo = new JPanel();
		panel_Malo.setEnabled(false);
		frame.getContentPane().add(panel_Malo, BorderLayout.SOUTH);
		JTextArea ninoMalo = new JTextArea();
		ninoMalo.setVisible(true);
		ninoMalo.setText("\r\n\t\t\t\t\t\t\t\t\t// imagen navide\u00F1a\r\n\r\nPolo Norte, ____de noviembre del 20161\r\nNombre__DelNi\u00F1o\r\nDireccion\r\nPais\r\n\r\nQuerido XXX,\r\n\r\nHe le\u00EDdo tu carta y he comprobado que no est\u00E1s en mi lista de ni\u00F1os buenos, te has portado mal con pap\u00E1 y\r\nmam\u00E1.\r\nY aunque no te has portado bien, te dar\u00E9 una oportunidad para que mejores. Si en este mes mejoras tu\r\nconducta, te llevar\u00E1s lo que me has pedido que es:\r\n\r\n(lista de lo que pidi\u00F3 el ni\u00F1o)\r\n\r\nSi continuas port\u00E1ndote mal, uno de mis duendes te llevar\u00E1 carb\u00F3n.\r\n\r\nAs\u00ED que p\u00F3rtate bien XXXX, se que eres en el fondo un ni\u00F1o muy bueno.\r\n\r\n\r\n\u00A1Te deseo una muy Feliz Navidad!\r\n\r\n\r\nJOJOJOJO\r\n\r\n\r\nSanta Claus---- Esto debe ser una imagen con la firma Santa Claus\r");
		ninoMalo.setSize(new Dimension(100, 100));
		panel_Malo.add(ninoMalo);
		}
	}
	public void respStart (boolean temp)
	{
		NinoStatus = temp;
		getFrame().setVisible(true);
		
		
	}
	public JFrame getFrame()
	{
		return frame;
	}
	public boolean getNinoStatus()
	{
		return NinoStatus;
	}
}


