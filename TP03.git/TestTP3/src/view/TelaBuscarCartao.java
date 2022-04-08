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

import javax.swing.JTextField;

import controller.ControllerLoging;
import controller.ControllerPagamentos;

import javax.swing.JButton;
/**
 * Tela de buscar cartão
 * @author Maria Abritta e Thyago Moura 
 * @version 1.0 (Abril 2022)
 */
public class TelaBuscarCartao {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaBuscarCartao window = new TelaBuscarCartao();
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
	public TelaBuscarCartao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 222);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel tiruloUm_1 = new JLabel("Buscar cartao");
		tiruloUm_1.setForeground(SystemColor.desktop);
		tiruloUm_1.setFont(new Font("Elephant", Font.PLAIN, 37));
		tiruloUm_1.setBounds(85, 14, 302, 75);
		frame.getContentPane().add(tiruloUm_1);
		
		JLabel lblBuscarCartao = new JLabel("Buscar cartao");
		lblBuscarCartao.setForeground(new Color(51, 204, 204));
		lblBuscarCartao.setFont(new Font("Elephant", Font.PLAIN, 37));
		lblBuscarCartao.setBounds(75, 0, 312, 75);
		frame.getContentPane().add(lblBuscarCartao);
		
		JLabel lblBusquePeloCvv = new JLabel("Busque CVV do cartao que deseja encontrar:");
		lblBusquePeloCvv.setFont(new Font("Cambria", Font.PLAIN, 15));
		lblBusquePeloCvv.setBounds(47, 86, 335, 14);
		frame.getContentPane().add(lblBusquePeloCvv);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(47, 107, 335, 20);
		frame.getContentPane().add(textField);
		
		/**
		 * Tenta encontrar o cartão em questão.
		 */
		JButton check = new JButton("OK");
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroCartao.cartaoCadastrado = ControllerPagamentos.validarBusca(textField.getText());
				if(TelaCadastroCartao.cartaoCadastrado != null) {
					JOptionPane.showMessageDialog(check,
							"Cartao nao encontrado!");	
				} else {
					frame.dispose();
						JOptionPane.showMessageDialog(check,
								"Forma de pagamento: " + TelaCadastroCartao.textForma.getText() +
								"\nNumero do cartao : " + TelaCadastroCartao.txtNumCartao.getText() +
								"\nNome no cartao : " + TelaCadastroCartao.txtNome.getText() +
								"\nCVV: " + TelaCadastroCartao.textCVV.getText());

					
				}
				frame.dispose();
				TelaMenu.main(null);
			}
		});
		check.setFont(new Font("Cambria", Font.PLAIN, 11));
		check.setBackground(SystemColor.desktop);
		check.setBounds(169, 138, 89, 23);
		frame.getContentPane().add(check);
	}

}
