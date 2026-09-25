import java.util.Scanner;

public class GameHelper {
	public int getUserInput(String prompt) {
		Scanner scanner = new Scanner(System.in);
		int palpite = 0;
		boolean entradaValida = false; //Variável de controle do laço
		
		while(entradaValida == false) {
			System.out.print(prompt + ":");
			try {
				palpite = scanner.nextInt();
				entradaValida = true;
			}catch(Exception ex) {
				System.out.println("Erro! Por favor, digite apenas números inteiros.");
				scanner.nextLine();
			}
		}
		return palpite;
	}
}
