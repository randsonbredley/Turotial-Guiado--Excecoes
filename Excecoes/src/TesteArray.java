
public class TesteArray {
	public static void main(String[] args) {
		int[] nums = {10,20,30}; //Array com indices 0,1 e 2
		
		System.out.println("Iniciando o loop...");
		
		try {
			//colocando o código arriscado aqui dentro!
			for(int i = 0; i <= 3; i++) {
				System.out.println("Valor: " + nums[i]);
			}
		} catch(Exception ex) {
			//Se der erro, o fluxo pula para cá!
			System.out.println("Ops! Tentamos acessar uma posição inválida no array.");
		}
		
		System.out.println("Fim do programa!"); //Será que o programa chega aqui?
	}

}
