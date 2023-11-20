
public class Conta {
	private int numero;
	private String nome;
	private float saldo;
	
	public void inicializa(String n, float s) {
		nome = n;
		saldo = s;
		if(saldo < 0) {
			System.out.println("Não pode criar uma conta com saldo devedor.");
		}
	}
	
	public void deposita(float valor) {
		saldo = saldo + valor;
	}
	
	public void consulta() {
		System.out.println("Cliente: " + nome);
		System.out.println("Número da conta: " + numero);
		System.out.println("Saldo atual: " + saldo);
	}
	
	public int saque(float valor) {
		if(saldo < 0) {
			return 0;
		} else {
			saldo = saldo - valor;
			return -1;
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}


//class Conta
//{
//  int numero;     // São atributos
//  string nome;    // privados por
//  float saldo;    // default
//public:
//  void inicializa(string n, float s);
//  void deposita(float valor);
//  void consulta();
//  int saque(float valor);
//};