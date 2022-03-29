package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JButton;

public class TelaViagem {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaViagem window = new TelaViagem();
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
	public TelaViagem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 384);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel tituloDois = new JLabel("Viagem");
		tituloDois.setForeground(SystemColor.desktop);
		tituloDois.setFont(new Font("Elephant", Font.PLAIN, 37));
		tituloDois.setBounds(150, 14, 204, 75);
		frame.getContentPane().add(tituloDois);
		
		JLabel tiruloUm = new JLabel("Viagem");
		tiruloUm.setForeground(new Color(51, 204, 204));
		tiruloUm.setFont(new Font("Elephant", Font.PLAIN, 37));
		tiruloUm.setBounds(140, 0, 194, 75);
		frame.getContentPane().add(tiruloUm);
		
		JButton cadastrar = new JButton("Cadastrar dados");
		cadastrar.setBackground(new Color(255, 204, 255));
		cadastrar.setFont(new Font("Cambria", Font.PLAIN, 15));
		cadastrar.setBounds(146, 100, 151, 35);
		frame.getContentPane().add(cadastrar);
		
		JButton listar = new JButton("Listar dados");
		listar.setBackground(new Color(204, 204, 255));
		listar.setFont(new Font("Cambria", Font.PLAIN, 15));
		listar.setBounds(146, 146, 151, 35);
		frame.getContentPane().add(listar);
		
		JButton editar = new JButton("Editar dados");
		editar.setBackground(new Color(255, 255, 204));
		editar.setFont(new Font("Cambria", Font.PLAIN, 15));
		editar.setBounds(146, 192, 151, 35);
		frame.getContentPane().add(editar);
		
		JButton deletar = new JButton("Deletar dados");
		deletar.setBackground(new Color(153, 204, 255));
		deletar.setFont(new Font("Cambria", Font.PLAIN, 15));
		deletar.setBounds(146, 238, 151, 35);
		frame.getContentPane().add(deletar);
		
		JButton buscar = new JButton("Buscar dados");
		buscar.setBackground(new Color(204, 255, 255));
		buscar.setFont(new Font("Cambria", Font.PLAIN, 15));
		buscar.setBounds(146, 284, 151, 35);
		frame.getContentPane().add(buscar);
	}
}
