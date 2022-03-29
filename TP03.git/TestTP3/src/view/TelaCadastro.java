package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import models.Usuario;
import javax.swing.JMenuBar;

public class TelaCadastro {

	private JFrame frame;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro window = new TelaCadastro();
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
	public TelaCadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.CYAN);
		lblNewLabel.setBounds(122, 86, 45, 21);
		frame.getContentPane().add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBounds(122, 118, 204, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnNewButton = new JButton("Mostrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Seu nome é: " + txtNome.getText());
			}
		});
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setBounds(185, 163, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
