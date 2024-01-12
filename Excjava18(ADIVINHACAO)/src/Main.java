import java.util.Scanner;
import java.util.Random; // Importa a biblioteca Random

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int Palpite = 0;
		int Tentativas = 0;

		// Cria uma instância da classe Random
		Random random = new Random();

		// Gera um número aleatório entre 1 e 100
		int NumeroAleatorio = random.nextInt(10) + 1;

		while (Palpite != NumeroAleatorio) {
			System.out.println("Chute um valor de 1 à 10: ");
			Palpite = sc.nextInt();
			Tentativas++;
			
			if (Palpite > NumeroAleatorio) {
				System.out.println("Que tal tentar um número menor?\n");
			}
			else if (Palpite < NumeroAleatorio) {
				System.out.println("Que tal tentar um número maior?\n");
			}
			else {
				System.out.println("Número certo parabéns! :D\n");
				System.out.println("Você acertou em " + Tentativas + " Tentativa(s)");
			}
		}
		

		sc.close();

	}

}
