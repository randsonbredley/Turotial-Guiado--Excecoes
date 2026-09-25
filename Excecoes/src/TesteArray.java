
public class TesteArray {
	public static void main(String[] args) {
		int[] nums = {10,20,30}; //Array com indices 0,1 e 2
		
		System.out.println("Iniciando o loop...");
		
		//Vamos forçar um loop que tenta acessar o indice 3 (que não exste!)
		for(int i=0; i <= 3; i++) {
			System.out.println("Valor: " + nums[i]);
		}
		
		System.out.println("Fim do programa!"); //Será que o programa chega aqui?
	}

}
