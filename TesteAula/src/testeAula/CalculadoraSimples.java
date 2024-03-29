package testeAula;

import java.util.Scanner;

public class CalculadoraSimples {
	float num1, num2;

	public float getNum1() {
		return num1;
	}

	public void setNum1(float num1) {
		this.num1 = num1;
	}

	public float getNum2() {
		return num2;
	}

	public void setNum2(float num2) {
		this.num2 = num2;
	}

	public float adicao(float num1, float num2) {
		return num1 + num2;
	}

	public float subtracao(float num1, float num2) {
		return num1 - num2;
	}

	public float multiply(float num1, float num2) {
		return num1 * num2;
	}

	public float div(float num1, float num2) {
		return num1 / num2;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CalculadoraSimples calc = new CalculadoraSimples();

		float num1;
		float num2;
		int op = 0;

		System.out.println("Digite o primeiro valor: ");
		num1 = (scan.nextFloat());

		System.out.println("Digite o segundo valor: ");
		num2 = (scan.nextFloat());

		System.out.println("-------------------------");
		System.out.println("Qual operação deseja realizar?");
		System.out.println("1 - ADIÇÃO");
		System.out.println("2 - SUBTRAÇÃO");
		System.out.println("3 - MULTIPLICAÇÃO");
		System.out.println("4 - DIVISÃO");
		
		op = scan.nextInt();
		switch (op) {
		case 1:
			System.out.println("O resultado é: " + calc.adicao(num1, num2));
			break;
		case 2:
			System.out.println("O resultado é: " + calc.subtracao(num1, num2));
			break;
		case 3:
			System.out.println("O resultado é: " + calc.multiply(num1, num2));
			break;
		case 4:
			System.out.println("O resultado é: " + calc.div(num1, num2));
			break;
		default:
			System.out.println("Opção inválida");
		}
	}

}
