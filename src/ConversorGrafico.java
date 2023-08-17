import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ConversorGrafico extends  JFrame{
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem opcao1;
	private JMenuItem opcao2;
	private JMenuItem opcao3;
	
	//Construtor
	
	public ConversorGrafico() {
		
		setSize(400, 300);
		setTitle("Conversor ONE = )");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel painel = new JPanel();
		
		exibirMenu();
		painel.add(menuBar);
		add(painel);
		
		
	}
	
	public void exibirMenu() {
		menuBar = new JMenuBar();
		menu = new JMenu("Escolha uma Opçao  Valida :");
		opcao1 = new JMenuItem("Centimetros para Metros");
		opcao2 = new JMenuItem("Metros para Centimetros");
		opcao3 = new JMenuItem("Sair");

		menu.add(opcao1);
		menu.add(opcao2);
		menu.add(opcao3);

		menuBar.add(menu);
		opcao3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Que Pena sua Saida...");
				System.exit(0);

				}			
			
		}
		);

	}

	private void exibirMenu() {
		// TODO Auto-generated method stub

	}

















	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConversorGrafico janela = new ConversorGrafico();		//Criando a Janela
		janela .setVisible(true);
		

	}

}
