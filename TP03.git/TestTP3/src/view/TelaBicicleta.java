package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JButton;

public class TelaBicicleta {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaBicicleta window = new TelaBicicleta();
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
	public TelaBicicleta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 253);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBicicleta = new JLabel("Bicicletas");
		lblBicicleta.setForeground(SystemColor.desktop);
		lblBicicleta.setFont(new Font("Elephant", Font.PLAIN, 37));
		lblBicicleta.setBounds(132, 14, 204, 75);
		frame.getContentPane().add(lblBicicleta);
		
		JLabel tiruloUm_1 = new JLabel("Bicicletas");
		tiruloUm_1.setForeground(new Color(51, 204, 204));
		tiruloUm_1.setFont(new Font("Elephant", Font.PLAIN, 37));
		tiruloUm_1.setBounds(122, 0, 194, 75);
		frame.getContentPane().add(tiruloUm_1);
		
		JButton buscar = new JButton("Buscar bicicletas");
		buscar.setBackground(new Color(153, 204, 255));
		buscar.setFont(new Font("Cambria", Font.PLAIN, 15));
		buscar.setBounds(142, 100, 147, 37);
		frame.getContentPane().add(buscar);
		
		JButton listar = new JButton("Listar bicicletas");
		listar.setBackground(new Color(255, 255, 204));
		listar.setFont(new Font("Cambria", Font.PLAIN, 15));
		listar.setBounds(142, 159, 147, 37);
		frame.getContentPane().add(listar);
	}

}
