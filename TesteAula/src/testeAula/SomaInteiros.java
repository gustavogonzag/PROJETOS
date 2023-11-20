package testeAula;

import java.util.Scanner;

public class SomaInteiros {
	private int intA;
	private int intB;
	
	public void setIntA(int intA) {
		this.intA = intA;
	}
	
	public int getIntA() {
		return this.intA;
	}
	
	public void setIntB(int intB) {
		this.intB = intB;
	}
	
	public int getIntB() {
		return this.intB;
	}
	
	public int calcular(int intA, int intB) {
		int a = intA;
		int b = intB;
		return(a+b);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro inteiro: ");
		int a = scanner.nextInt();
		System.out.println("Digite o segundo inteiro: ");
		int b = scanner.nextInt();
		SomaInteiros somar = new SomaInteiros();
		System.out.println("O resultado é: " + somar.calcular(a, b));
	}
	
}
