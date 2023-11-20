package testeAula;

public class MaiorIdade {
	private int idade;
	
	public void verificar(int idade) {
		this.idade = idade;
		if(idade < 18) {
			System.out.println("Sujeito menor de idade");
		} else if ( idade >= 18) {
			if(idade >= 60) {
				System.out.println("Sujeito idoso");
			} else {
					System.out.println("Sujeito maior de idade");
				}
			}
		}
	
	public static void main (String[] args) {
		MaiorIdade verify = new MaiorIdade();
		verify.verificar(15);
	}
}
