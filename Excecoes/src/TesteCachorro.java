
class GoodDog{
	private int size;
		
		public void setSize(int s) {
			if(s <= 0) {
				//Em vez de só ignorar, nós Lançamos um erro!
				throw new IllegalArgumentException("O tamanho do cachorro deve ser maior que zero!");
			}
			
			size = s; //Só chega aqui se não lançar exceção
		}	
}

public class TesteCachorro {
	public static void main(String[] args) {
		GoodDog dog = new GoodDog();
		
		System.out.println("Tentando definir um tamanho negativo...");
		dog.setSize(-5); //Isso vai causar um crash programado por nós!
		
		System.out.println("Esta linha não será executada.");
	}
}
