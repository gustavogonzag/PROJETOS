package cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	
	private String nome, email, nacionalidade;
	private ArrayList<String> postagens;
	private int quantidadeDePostagens = 0, pontuacao = 0;
	
	public Usuario(String nome, String email, String nacionalidade, ArrayList<String> postagens, int quantidadeDePostagens, int pontuacao) {
		super();
		this.nome = nome;
		this.email = email;
		this.nacionalidade = nacionalidade;
		this.setPostagens(postagens);
		this.quantidadeDePostagens = quantidadeDePostagens;
		this.pontuacao = pontuacao;
	}

	public Usuario() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}	
	
	public int getQuantidadeDePostagens() {
		return quantidadeDePostagens;
	}
	
	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int delta) {
		if(delta > 0) {
			this.pontuacao += delta;
		}		
	}

	public void setQuantidadeDePostagens(int quantidadeDePostagens) {
		this.quantidadeDePostagens = quantidadeDePostagens;
	}

	public ArrayList<String> getPostagens() {
		return postagens;
	}

	public void setPostagens(ArrayList<String> postagens) {
		this.postagens = postagens;
	}
	
	public void mostrarPostagens() {
		for(int i = 0; i < postagens.size(); i++) {
			System.out.println(postagens.get(i));
		}
	}
	
	public void adicionarPostagem(String post) {
		postagens.add(post);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		String sn = "";
		do {
			Usuario usuario = new Usuario();
			System.out.println("---INSERINDO DADOS---");
			System.out.println("Digite o nome: ");
			usuario.setNome(sc.nextLine());
			System.out.println("Digite o email: ");
			usuario.setEmail(sc.nextLine());
			System.out.println("Digite a nacionalidade: ");
			usuario.setNacionalidade(sc.nextLine());
			System.out.println("Digite seu post: ");
			String post = sc.nextLine();
			usuario.adicionarPostagem(post);
			listaUsuarios.add(usuario);
			System.out.println("------");
			System.out.println("Quer cadastrar mais um usuário?");
			sn = sc.nextLine();
			usuario.mostrarPostagens();
		} while(sn != "n");
	}	
}
