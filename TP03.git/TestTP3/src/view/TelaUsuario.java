package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import controller.ControllerLoging;
import controller.ControllerUsuarios;
import models.Usuario;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaUsuario {

	private Usuario user = new Usuario();
	private TelaCadastroUsuario tc = new TelaCadastroUsuario();
	
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
		lblUsuario.setBounds(141, 14, 204, 75);
		frame.getContentPane().add(lblUsuario);
		
		JLabel tiruloUm_1 = new JLabel("Usuario");
		tiruloUm_1.setForeground(new Color(51, 204, 204));
		tiruloUm_1.setFont(new Font("Elephant", Font.PLAIN, 37));
		tiruloUm_1.setBounds(131, 0, 194, 75);
		frame.getContentPane().add(tiruloUm_1);
		
		JButton listar = new JButton("Listar dados");
		listar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Printa todas as infos da Pessoa
				JOptionPane.showMessageDialog(listar, 
						"Seu nome �: " + Usuario.usuario[ControllerUsuarios.indiceUser][0] +
						"\nSeu email �: " +	 Usuario.usuario[ControllerUsuarios.indiceUser][1] +
						"\nSeu RG �: " + Usuario.usuario[ControllerUsuarios.indiceUser][2] +
						"\nSeu CPF �: " + Usuario.usuario[ControllerUsuarios.indiceUser][3] +
						"\nSUA Senha �: " + Usuario.usuario[ControllerUsuarios.indiceUser][4] +
						"\nSeu Telefone �: " + Usuario.usuario[ControllerUsuarios.indiceUser][5]
						);
				
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
