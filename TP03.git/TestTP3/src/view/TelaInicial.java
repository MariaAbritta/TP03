package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;

import models.Dados;

import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInicial {

	private JFrame frame;

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

	public TelaInicial() {
		initialize();
	}

	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.control);
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 450, 224);

		JLabel tiruloUm = new JLabel("BikeAqui!");
		tiruloUm.setForeground(SystemColor.desktop);
		tiruloUm.setFont(new Font("Elephant", Font.PLAIN, 37));
		tiruloUm.setBounds(132, 25, 204, 75);
		frame.getContentPane().add(tiruloUm);

		JButton cadastro = new JButton("Cadastrar-se");
		cadastro.setBounds(163, 111, 119, 38);

		if (Dados.getUsuarios().size() > 0) {
			JButton login = new JButton("Fazer Login");
			login.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Object src = e.getSource();
					if (src == login) {
						frame.dispose();
						TelaLoging.main(null);
					}
				}
			});

			login.setFont(new Font("Cambria", Font.PLAIN, 15));
			login.setBackground(new Color(204, 153, 255));
			login.setBounds(163, 100, 119, 38);
			cadastro.setBounds(163, 150, 119, 38);
			frame.setBounds(100, 100, 450, 250);
			frame.getContentPane().add(login);
		}

		cadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object src = e.getSource();
				if (src == cadastro) {
					frame.dispose();
					TelaCadastroUsuario.main(null);
				}
			}
		});

		cadastro.setFont(new Font("Cambria", Font.PLAIN, 15));
		cadastro.setBackground(new Color(204, 153, 255));

		frame.getContentPane().add(cadastro);

		JLabel tiruloUm_1 = new JLabel("BikeAqui!");
		tiruloUm_1.setForeground(new Color(51, 204, 204));
		tiruloUm_1.setFont(new Font("Elephant", Font.PLAIN, 37));
		tiruloUm_1.setBounds(122, 11, 194, 75);
		frame.getContentPane().add(tiruloUm_1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
