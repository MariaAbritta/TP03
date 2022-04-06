package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import models.Plano30;
import models.Plano60;
import models.Plano1440;

public class TelaPlanos {

	private JFrame frame;
	Plano30 p30 = new Plano30();
	Plano60 p60 = new Plano60();
	Plano1440 p1140 = new Plano1440();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPlanos window = new TelaPlanos();
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
	public TelaPlanos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 292);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPlanos = new JLabel("Planos");
		lblPlanos.setForeground(SystemColor.desktop);
		lblPlanos.setFont(new Font("Elephant", Font.PLAIN, 37));
		lblPlanos.setBounds(148, 14, 204, 75);
		frame.getContentPane().add(lblPlanos);
		
		JLabel tiruloUm_1 = new JLabel("Planos");
		tiruloUm_1.setForeground(new Color(51, 204, 204));
		tiruloUm_1.setFont(new Font("Elephant", Font.PLAIN, 37));
		tiruloUm_1.setBounds(138, 0, 194, 75);
		frame.getContentPane().add(tiruloUm_1);
		
		JButton btnPlanoMinutos = new JButton("Plano 30 minutos");
		btnPlanoMinutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnPlanoMinutos.setFont(new Font("Cambria", Font.PLAIN, 15));
		btnPlanoMinutos.setBackground(new Color(204, 204, 255));
		btnPlanoMinutos.setBounds(138, 100, 150, 36);
		frame.getContentPane().add(btnPlanoMinutos);
		
		JButton btnPlanoHora = new JButton("Plano 1 hora");
		btnPlanoHora.setFont(new Font("Cambria", Font.PLAIN, 15));
		btnPlanoHora.setBackground(new Color(255, 255, 204));
		btnPlanoHora.setBounds(138, 151, 150, 36);
		frame.getContentPane().add(btnPlanoHora);
		
		JButton listar = new JButton("Plano 24 horas");
		listar.setFont(new Font("Cambria", Font.PLAIN, 15));
		listar.setBackground(new Color(255, 204, 255));
		listar.setBounds(138, 198, 150, 36);
		frame.getContentPane().add(listar);
	}

}
