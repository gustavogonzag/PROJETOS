package testeAula;

public class TrocaVariaveis {
	private int num1, num2, temp;
	
	public void trocar() {
		num1 = 6;
		num2 = 9;
		temp = 6;
		System.out.println("Antes da troca: " + num1 + " " + num2);
		num1 = num2;
		num2 = temp;
		System.out.println("Depois da troca: " + num1 + " " + num2);
	}
	
	public void trocarXor() {
		num1 = 6;
		num2 = 9;
		System.out.println("Antes da troca: " + num1 + " " + num2);
		num1 = num1 ^ num2;
		num2 = num2 ^ num1;
		num1 = num1 ^ num2;
		System.out.println("Depois da troca: " + num1 + " " + num2);
	}
	
	public static void main (String[] args) {
		TrocaVariaveis troca = new TrocaVariaveis();
		troca.trocar();
		troca.trocarXor();
	}

}