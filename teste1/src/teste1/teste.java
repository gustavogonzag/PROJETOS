package teste1;
import java.util.ArrayList;
import java.util.Scanner;

class Pergunta {
    private String texto;
    private ArrayList<String> alternativas;
    private int alternativaCerta;

    public Pergunta(String texto, ArrayList<String> alternativas, int alternativaCerta) {
        this.texto = texto;
        this.alternativas = alternativas;
        this.alternativaCerta = alternativaCerta;
    }

    public void executarPergunta() {
        System.out.println(texto);

        for (int i = 0; i < alternativas.size(); i++) {
            System.out.println((i + 1) + ". " + alternativas.get(i));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha a alternativa correta (1 a 4): ");
        int respostaUsuario = scanner.nextInt();

        if (respostaUsuario == alternativaCerta) {
            System.out.println("Resposta correta!\n");
        } else {
            System.out.println("Resposta incorreta. A alternativa correta era: " + alternativaCerta + "\n");
        }
    }
}

public class Quiz {
    public static void main(String[] args) {
        ArrayList<Pergunta> perguntas = new ArrayList<>();
        perguntas.add(new Pergunta("Qual é a capital do Brasil?",
                new ArrayList<>(List.of("Rio de Janeiro", "Brasília", "São Paulo", "Salvador")), 2));
        perguntas.add(new Pergunta("Qual é o maior planeta do sistema solar?",
                new ArrayList<>(List.of("Terra", "Marte", "Júpiter", "Vênus")), 3));
        perguntas.add(new Pergunta("Quem escreveu 'Dom Quixote'?",
                new ArrayList<>(List.of("Miguel de Cervantes", "William Shakespeare", "Charles Dickens", "Jane Austen")), 1));

        int pontuacao = 0;
        for (Pergunta pergunta : perguntas) {
            pergunta.executarPergunta();
            pontuacao += 1; // Incrementa a pontuação para cada pergunta respondida
        }

        System.out.println("Pontuação final: " + pontuacao + " de " + perguntas.size() + " perguntas.");
    }
}

