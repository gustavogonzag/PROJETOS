package testeAula;

public class MediaPonderada {
	private float nota1, nota2, nota3;
	private float peso1, peso2, peso3;
	
	public static float calcularMedia(float nota1, float nota2, float nota3, float peso1, float peso2, float peso3) {
		return ((nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3));
	}
	
	public static void main(String[] args) {
		float nota1, nota2, nota3, peso1, peso2, peso3;
		nota1 = (float) 1.0;
		nota2 = (float) 2.5;
		nota3 = (float) 3.75;
		peso1 = 2;
		peso2 = 1;
		peso3 = 2;
		
		System.out.println("Resultado: " + calcularMedia(nota1, nota2, nota3, peso1, peso2, peso3));
		
	}
}
