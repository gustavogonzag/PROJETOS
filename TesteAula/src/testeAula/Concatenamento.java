package testeAula;

public class Concatenamento {

	private String nome = "";
	private String sobrenome = "";
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String imprimeNome() {
		return "Nome completo: " + this.nome + " " + this.sobrenome;
	}
	
	public static void main(String[] args) {
		
		Concatenamento concat = new Concatenamento();
		concat.setNome("Gustueivo");
		concat.setSobrenome("Gonzueiga");
		System.out.println(concat.imprimeNome());
	}

}
