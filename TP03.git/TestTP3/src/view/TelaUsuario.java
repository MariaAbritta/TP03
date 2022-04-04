package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import models.Usuario;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaUsuario {

	private Usuario user = new Usuario();
	private TelaCadastro tc = new TelaCadastro();
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaUsuario window = new TelaUsuario();
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
	public TelaUsuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 287);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setForeground(SystemColor.desktop);
		lblUsuario.setFont(new Font("Elephant", Font.PLAIN, 37));
		lblUsuario.setBounds(155, 14, 204, 75);
		frame.getContentPane().add(lblUsuario);
		
		JLabel tiruloUm_1 = new JLabel("Usuario");
		tiruloUm_1.setForeground(new Color(51, 204, 204));
		tiruloUm_1.setFont(new Font("Elephant", Font.PLAIN, 37));
		tiruloUm_1.setBounds(145, 0, 194, 75);
		frame.getContentPane().add(tiruloUm_1);
		
		JButton listar = new JButton("Listar dados");
		listar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*System.out.println("Nome: " + user.getNome() + "\nE-mail: " + user.getEmail() + "\nRG: " + user.getRg() + "\nCPF: " + user.getCpf() + 
						"\nTelefone: " + user.getTelefone());*/// Printa todas as infos da Pessoa
				JOptionPane.showMessageDialog(listar, "Seu nome é " + user.getNome());
			}
		});
		listar.setBackground(new Color(255, 204, 255));
		listar.setFont(new Font("Cambria", Font.PLAIN, 15));
		listar.setBounds(155, 100, 130, 34);
		frame.getContentPane().add(listar);
		
		JButton editar = new JButton("Editar dados");
		editar.setFont(new Font("Cambria", Font.PLAIN, 15));
		editar.setBackground(new Color(204, 204, 255));
		editar.setBounds(155, 145, 130, 34);
		frame.getContentPane().add(editar);
		editar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object src = e.getSource();
				if(src == editar) {
					new TelaEditarUsuario();
					TelaEditarUsuario.main(null);
				}
			}
		});
		
		
		JButton deletar = new JButton("Deletar dados");
		deletar.setBackground(new Color(255, 255, 204));
		deletar.setFont(new Font("Cambria", Font.PLAIN, 15));
		deletar.setBounds(155, 190, 130, 34);
		frame.getContentPane().add(deletar);
	}

}
