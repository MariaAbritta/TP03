package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPedidos {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPedidos window = new TelaPedidos();
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
	public TelaPedidos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 236);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPedidos = new JLabel("Pedidos");
		lblPedidos.setForeground(SystemColor.desktop);
		lblPedidos.setFont(new Font("Elephant", Font.PLAIN, 37));
		lblPedidos.setBounds(140, 14, 204, 75);
		frame.getContentPane().add(lblPedidos);
		
		JLabel tiruloUm_1 = new JLabel("Pedidos");
		tiruloUm_1.setForeground(new Color(51, 204, 204));
		tiruloUm_1.setFont(new Font("Elephant", Font.PLAIN, 37));
		tiruloUm_1.setBounds(130, 0, 194, 75);
		frame.getContentPane().add(tiruloUm_1);
		
		JButton listar = new JButton("Escolher plano");
		listar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object src = e.getSource();
				if (src == listar) {
					frame.dispose();
					TelaPlanos.main(null);
				}
			}
		});
		listar.setFont(new Font("Cambria", Font.PLAIN, 15));
		listar.setBackground(new Color(204, 204, 255));
		listar.setBounds(150, 100, 129, 36);
		frame.getContentPane().add(listar);
		
		JButton btnEscolherPlano = new JButton("Listar pedidos");
		btnEscolherPlano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnEscolherPlano.setFont(new Font("Cambria", Font.PLAIN, 15));
		btnEscolherPlano.setBackground(new Color(255, 255, 204));
		btnEscolherPlano.setBounds(150, 150, 129, 36);
		frame.getContentPane().add(btnEscolherPlano);
	}
}
