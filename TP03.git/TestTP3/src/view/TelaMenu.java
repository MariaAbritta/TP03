package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMenu window = new TelaMenu();
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
	public TelaMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 422);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel tiruloUm = new JLabel("BikeAqui!");
		tiruloUm.setForeground(SystemColor.desktop);
		tiruloUm.setFont(new Font("Elephant", Font.PLAIN, 37));
		tiruloUm.setBounds(130, 14, 204, 75);
		frame.getContentPane().add(tiruloUm);
		
		JLabel tiruloUm_1 = new JLabel("BikeAqui!");
		tiruloUm_1.setForeground(new Color(51, 204, 204));
		tiruloUm_1.setFont(new Font("Elephant", Font.PLAIN, 37));
		tiruloUm_1.setBounds(120, 0, 194, 75);
		frame.getContentPane().add(tiruloUm_1);
		
		JButton usuario = new JButton("Usuario");
		usuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		usuario.setBackground(new Color(255, 204, 255));
		usuario.setFont(new Font("Cambria", Font.PLAIN, 15));
		usuario.setBounds(162, 91, 113, 36);
		frame.getContentPane().add(usuario);
		
		JButton bicicletario = new JButton("Bicicletario");
		bicicletario.setFont(new Font("Cambria", Font.PLAIN, 15));
		bicicletario.setBackground(new Color(204, 204, 255));
		bicicletario.setBounds(162, 138, 113, 36);
		frame.getContentPane().add(bicicletario);
		
		JButton bicicletas = new JButton("Bicicletas");
		bicicletas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bicicletas.setFont(new Font("Cambria", Font.PLAIN, 15));
		bicicletas.setBackground(new Color(255, 255, 204));
		bicicletas.setBounds(162, 183, 113, 36);
		frame.getContentPane().add(bicicletas);
		
		JButton viagem = new JButton("Viagem");
		viagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		viagem.setFont(new Font("Cambria", Font.PLAIN, 15));
		viagem.setBackground(new Color(153, 204, 255));
		viagem.setBounds(162, 229, 113, 36);
		frame.getContentPane().add(viagem);
		
		JButton pedidos = new JButton("Pedidos");
		pedidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pedidos.setFont(new Font("Cambria", Font.PLAIN, 15));
		pedidos.setBackground(new Color(204, 255, 255));
		pedidos.setBounds(162, 276, 113, 36);
		frame.getContentPane().add(pedidos);
		
		JButton pagamentos = new JButton("Pagamentos");
		pagamentos.setFont(new Font("Cambria", Font.PLAIN, 15));
		pagamentos.setBackground(new Color(204, 255, 153));
		pagamentos.setBounds(162, 323, 113, 36);
		frame.getContentPane().add(pagamentos);
	}

}
