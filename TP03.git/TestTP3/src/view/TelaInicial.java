package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;

public class TelaInicial {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial window = new TelaInicial();
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
	public TelaInicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.control);
		frame.getContentPane().setLayout(null);
		
		JLabel tiruloUm = new JLabel("BikeAqui!");
		tiruloUm.setForeground(SystemColor.desktop);
		tiruloUm.setFont(new Font("Elephant", Font.PLAIN, 37));
		tiruloUm.setBounds(132, 25, 204, 75);
		frame.getContentPane().add(tiruloUm);
		
		JButton cadastro = new JButton("Cadastrar-se");
		cadastro.setFont(new Font("Cambria", Font.PLAIN, 15));
		cadastro.setBackground(new Color(204, 153, 255));
		cadastro.setBounds(163, 111, 119, 38);
		frame.getContentPane().add(cadastro);
		
		JLabel tiruloUm_1 = new JLabel("BikeAqui!");
		tiruloUm_1.setForeground(new Color(51, 204, 204));
		tiruloUm_1.setFont(new Font("Elephant", Font.PLAIN, 37));
		tiruloUm_1.setBounds(122, 11, 194, 75);
		frame.getContentPane().add(tiruloUm_1);
		frame.setBounds(100, 100, 450, 224);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
