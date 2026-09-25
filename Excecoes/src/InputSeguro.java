import java.util.Scanner;

public class InputSeguro {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int palpite = 0;
		boolean entradaValida = false; //variável de controle
		
		while(entradaValida == false) {
			System.out.print("Digite um número inteiro: ");
			
			try {
				//tentar ler o número
				palpite = scanner.nextInt();
				
				//Se a linha de cima der erro, o código PULA para o catch
				//Se NÂO der erro, a linha de baixo é executada:
				entradaValida = true;
			} catch(Exception ex) {
				System.out.println("Erro! Você não digitou um número válido. Tente de novo.");
				//Limpa a sujeira do Scanner para a próxima tentativa
				scanner.nextLine();
			}
		}
		
		System.out.println("Parabéns! Você digitou o número: " + palpite);
	}
}
