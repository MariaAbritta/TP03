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
/**
 * Equipara se os dados fornecidos estão nos dados cadastrados de loging
 * @author Maria Abritta e Thyago Moura 
 * @version 1.0 (Abril 2022)
 */
public class TelaBuscarBicicletario {

	private JFrame frame;
	Bicicletario bicicletario = new Bicicletario(null, null);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaBuscarBicicletario window = new TelaBuscarBicicletario();
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
	public TelaBuscarBicicletario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 220);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		/**
		 * Exibe as informações do parque Sarah e quantas bicicletas disponíveis.
		 */
		JButton sarah = new JButton("Sarah Kubitschek");
		sarah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Printa todas as infos da Pessoa
				JOptionPane.showMessageDialog(sarah, "Endereco: Srps - Brasilia, DF, 70297-400\n"
						+ "Horarios: Atendimento 24 horas.\n" + 
						"Numero de Bicicletas disponiveis: "+ bicicletario.setDisponibilidadeBicicletasSarah(0));
				frame.dispose();
				TelaMenu.main(null);
			}
		});
		sarah.setFont(new Font("Cambria", Font.PLAIN, 15));
		sarah.setBackground(new Color(255, 204, 255));
		sarah.setBounds(151, 86, 147, 34);
		frame.getContentPane().add(sarah);
		
		/**
		 * Exibe as informações do parque Ecológico e quantas bicicletas disponíveis.
		 */
		JButton eco = new JButton("Parque Ecologico");
		eco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Printa todas as infos da Pessoa
				JOptionPane.showMessageDialog(eco, "Endereco: Avenida Castanheiras.\n"
						+ "Situado atras da Residencia Oficial de Aguas Claras,\n"
						+ "entre as quadras 301, 104, 105 e 106 da cidade.\n"
						+ "Horarios: Diariamente, das 06h as 22h\n"+ 
						"Numero de Bicicletas disponiveis: "+ bicicletario.setDisponibilidadeBicicletasEco(0));
				frame.dispose();
				TelaMenu.main(null);
			}
		});
		eco.setFont(new Font("Cambria", Font.PLAIN, 15));
		eco.setBackground(new Color(255, 255, 204));
		eco.setBounds(151, 131, 147, 34);
		frame.getContentPane().add(eco);
		
		JLabel lblBicicletarios = new JLabel("Bicicletarios");
		lblBicicletarios.setForeground(SystemColor.desktop);
		lblBicicletarios.setFont(new Font("Elephant", Font.PLAIN, 37));
		lblBicicletarios.setBounds(102, 11, 246, 75);
		frame.getContentPane().add(lblBicicletarios);
		
		JLabel tiruloUm_1 = new JLabel("Bicicletarios");
		tiruloUm_1.setForeground(new Color(0, 204, 204));
		tiruloUm_1.setFont(new Font("Elephant", Font.PLAIN, 37));
		tiruloUm_1.setBounds(92, 0, 246, 75);
		frame.getContentPane().add(tiruloUm_1);
	}
}