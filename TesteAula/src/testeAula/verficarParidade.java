package testeAula;

public class verficarParidade {

	public int verificar(int numero) {
		int num = numero;
		if(num % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		return numero;
	}
	
	public static void main (String[] args) {
		verficarParidade verify = new verficarParidade();
		verify.verificar(5);
	}
}