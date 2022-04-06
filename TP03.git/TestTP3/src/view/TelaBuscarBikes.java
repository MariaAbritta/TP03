package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import models.Bicicleta;
import models.Bicicletario;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;

public class TelaBuscarBikes {

	private JFrame frame;
	Bicicleta bikes = new Bicicleta(null, 0);


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaBuscarBikes window = new TelaBuscarBikes();
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
	public TelaBuscarBikes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 221);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBicicletas = new JLabel("Bicicletas");
		lblBicicletas.setForeground(SystemColor.desktop);
		lblBicicletas.setFont(new Font("Elephant", Font.PLAIN, 37));
		lblBicicletas.setBounds(123, 11, 246, 75);
		frame.getContentPane().add(lblBicicletas);
		
		JLabel tiruloUm_1 = new JLabel("Bicicletas");
		tiruloUm_1.setForeground(new Color(0, 204, 204));
		tiruloUm_1.setFont(new Font("Elephant", Font.PLAIN, 37));
		tiruloUm_1.setBounds(113, 0, 246, 75);
		frame.getContentPane().add(tiruloUm_1);
		
		JButton sarah = new JButton("Sarah Kubitschek");
		sarah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Printa todas as infos da Pessoa
				//JOptionPane.showMessageDialog(sarah, bikes.buscarBikeSarah(null));
				JOptionPane.showOptionDialog(sarah, bikes.buscarBikeSarah(null), (TelaAlugarBikesSarah.main(null)), 0, JOptionPane.INFORMATION_MESSAGE,null, null, e);
			}
		});
		sarah.setFont(new Font("Cambria", Font.PLAIN, 15));
		sarah.setBackground(new Color(255, 204, 255));
		sarah.setBounds(145, 86, 147, 34);
		frame.getContentPane().add(sarah);
		
		JButton eco = new JButton("Parque Ecologico");
		eco.setFont(new Font("Cambria", Font.PLAIN, 15));
		eco.setBackground(new Color(255, 255, 204));
		eco.setBounds(145, 131, 147, 34);
		frame.getContentPane().add(eco);
	}
}
