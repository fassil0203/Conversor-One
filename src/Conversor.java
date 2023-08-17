import java.util.Scanner;

public class Conversor {
	
	public static void exibirMenu () {
		System.out.println("===================================");
		System.out.println("Bem Vindo ao Conversor");
		System.out.println("1 -cm -> Metros");
		System.out.println("2 - metros -> Cm");
		System.out.println("9 - Sair do Sistema ");
		System.out.println("Digite uma Opcao Válida");
		System.out.println("====================================");
		
		
	}
	
	// Metodo
	
	public static void conversor (String uniOri,String uniDest, double proporcao , Scanner leitor) { 
		System.out.println(" Ok, voce escolheu :" + uniOri + " --> " + uniDest);
		System.out.println(" Digite o Valor a ser Convertido ");
		double valor = leitor.nextDouble();
		double valorFinal = valor * proporcao;
		System.out.println("Valor Final = " + valorFinal);
		
	
	}

}
