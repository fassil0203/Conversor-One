import java.util.Scanner;

public class ConversorJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int input = 0;

		while (input != 9) {
			Conversor.exibirMenu();
			input = entrada.nextInt();

			switch (input) {

			case 1:
				Conversor.conversor("cm ", "metro", 0.01, entrada);

				break;

			case 2:
				Conversor.conversor("metro", "cm", 100, entrada);

				break;

			case 9:
				System.out.println("Que Pena!! Saindo do Programa ....");

				break;
			default:
				System.out.println("Digite uma Opcao Valida ");

				break;

			}

		}
		System.out.println();
		entrada.close();

	}

}
