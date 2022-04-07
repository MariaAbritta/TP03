package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import models.Bicicletario;
import models.Dados;

public class TelaBicicletario {

	private JFrame frame;
	Bicicletario bicicletario = new Bicicletario(null, null);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaBicicletario window = new TelaBicicletario();
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
	public TelaBicicletario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 267);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel tiruloUm_1 = new JLabel("Bicicletarios");
		tiruloUm_1.setForeground(SystemColor.desktop);
		tiruloUm_1.setFont(new Font("Elephant", Font.PLAIN, 37));
		tiruloUm_1.setBounds(99, 14, 246, 75);
		frame.getContentPane().add(tiruloUm_1);

		JLabel lblBicicletarios = new JLabel("Bicicletarios");
		lblBicicletarios.setForeground(new Color(51, 204, 204));
		lblBicicletarios.setFont(new Font("Elephant", Font.PLAIN, 37));
		lblBicicletarios.setBounds(89, 0, 246, 75);
		frame.getContentPane().add(lblBicicletarios);

		JButton listar = new JButton("Listar bicicletarios");
		listar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Printa todas as infos da Pessoa
				JOptionPane.showMessageDialog(listar, bicicletario.getLocalidade());
				frame.dispose();
				TelaMenu.main(null);
			}
		});
		listar.setBackground(new Color(204, 255, 153));
		listar.setFont(new Font("Cambria", Font.PLAIN, 15));
		listar.setBounds(134, 100, 163, 33);
		frame.getContentPane().add(listar);

		JButton buscar = new JButton("Buscar bicicletarios");
		buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Printa todas as infos da Pessoa
				frame.dispose();
				TelaBuscarBicicletario.main(null);

			}
		});
		buscar.setBackground(new Color(204, 255, 255));
		buscar.setFont(new Font("Cambria", Font.PLAIN, 15));
		buscar.setBounds(134, 144, 163, 33);
		frame.getContentPane().add(buscar);
		
		JButton funcio = new JButton("Funcionalidade");
		funcio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Printa todas as infos da Pessoa
				new TelaFuncioBicicletario();
				TelaFuncioBicicletario.main(null);
				
			}
		});
		funcio.setFont(new Font("Cambria", Font.PLAIN, 15));
		funcio.setBackground(new Color(204, 153, 255));
		funcio.setBounds(134, 186, 163, 27);
		frame.getContentPane().add(funcio);

	}
}
