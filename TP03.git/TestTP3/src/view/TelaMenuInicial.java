package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TelaMenuInicial {
	
	static JFrame janela = new JFrame("BikeAqui!");
	static JLabel titulo = new JLabel("Menu Principal");
	static JButton Cadastrar = new JButton("Cadastrar");
	//static JButton Fechar = new JButton("Fechar");
	static JButton Fechar = new JButton("Fechar"); 
	//public static ControleDados dados = new ControleDados(); exemplo
	
	public TelaMenuInicial() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 150, 30);
		Fechar.setBounds(140, 100, 100, 30);
		Cadastrar.setBounds(140, 50, 100, 30);

		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(Cadastrar);
		janela.add(Fechar);
		
		janela.setSize(400, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaMenuInicial menu = new TelaMenuInicial();
		
		Cadastrar.addActionListener((ActionListener) menu);
		//Fechar.addActionListener((ActionListener) menu);
		Fechar.addActionListener((ActionListener) menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == Cadastrar)
			//new Main().menuUsuario();
		
		//if(src == prof)
			//new TelaPessoa().mostrarDados(dados, 2);
		
		if(src == Fechar)
			JOptionPane.showMessageDialog(null, 
					"Ainda precisam ser implementadas as funcionalidades\n"
					+ "relacionadas a curso e a matrícula", null, 
					JOptionPane.INFORMATION_MESSAGE);
	}
}
