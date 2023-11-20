package cliente;

import java.util.Scanner;

public class Cliente {
	private String nome, cpf;
	private Integer idade = 0;
	
	public Scanner sc = new Scanner(System.in);

	public Cliente() {
	};

	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public void inserirDados() {
		System.out.println("Digite o nome do Cliente: ");
		this.setNome(sc.nextLine());
		System.out.println("Digite o CPF do Cliente: ");
		this.setCpf(sc.nextLine());
		System.out.println("Digite a Idade do Cliente: ");
		this.setIdade(Integer.parseInt(sc.nextLine()));
	}
	
	public void imprimeDados() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Cpf: " + this.getCpf());
		System.out.println("Idade: " + this.getIdade());
	}

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.inserirDados();
		System.out.println("-----DADOS DO CLIENTE-----");
		cliente.imprimeDados();
		System.out.println("-----ALTERANDO OS DADOS-----");
		cliente.inserirDados();
		System.out.println("-----EXIBINDO DADOS ALTERADOS-----");
		cliente.imprimeDados();
	}
}
