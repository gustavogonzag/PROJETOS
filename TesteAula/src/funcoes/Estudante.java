package funcoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Estudante {
	private String nome, sobrenome;
	private Date dataNasc, x;
	private int idade;	
	
	public Estudante(String nome, String sobrenome, Date dataNasc, int idade) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNasc = dataNasc;
		this.idade = idade;
	}
	
	public Estudante() {
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		try {
	        SimpleDateFormat nasc = new SimpleDateFormat("dd/MM/yyyy");
	        this.dataNasc = nasc.parse(dataNasc);
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }
	}

	public Date getX() {
		return x;
	}

	public void setX(Date x) {
		this.x = x;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int calcularIdade() {
		if (dataNasc == null) {
            // Retorna um valor padrão ou lança uma exceção, dependendo da sua lógica de manipulação de erros.
            return -1; // Valor padrão para indicar que a data de nascimento não está definida.
        }

        // Obtém o ano atual
        Calendar calendarAtual = Calendar.getInstance();
        int anoAtual = calendarAtual.get(Calendar.YEAR);

        // Obtém o ano de nascimento
        Calendar calendarNascimento = Calendar.getInstance();
        calendarNascimento.setTime(dataNasc);
        int anoNascimento = calendarNascimento.get(Calendar.YEAR);

        // Calcula a idade
        int idade = anoAtual - anoNascimento;

        return idade;
	}
	
	public static void main (String[] args) {
		Estudante aluno = new Estudante();
		aluno.setDataNasc("11/03/1997");
		System.out.println(aluno.getDataNasc());
		System.out.println(aluno.calcularIdade());
	}
	
}
