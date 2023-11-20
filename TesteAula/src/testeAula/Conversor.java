package testeAula;

import java.util.Scanner;

public class Conversor {
	private float temperatura;

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	
	public void convertCtoF(float temp) {
		this.temperatura = (temp * (9 / 5) + 32);
		System.out.println("Temperatura em F: " + this.temperatura);
	}
	
	public void convertFtoC(float temp) {
		this.temperatura = ((temp - 32) * 5/9);
		System.out.println("Temperatura em C: " + this.temperatura);
	}
	
	public static void main (String[] args) {
		Conversor conv = new Conversor();
		Scanner scan = new Scanner(System.in);
		float temp;
		int resp;
		System.out.println("F para C digita 0");
		System.out.println("C para F digita 1");
		resp = scan.nextInt();
		if(resp == 1) {
			System.out.println("Digite a temperatura: ");
			temp = scan.nextFloat();
			conv.setTemperatura(temp);
			conv.convertCtoF(temp);
		} else if (resp == 0) {
			System.out.println("Digite a temperatura: ");
			temp = scan.nextFloat();
			conv.setTemperatura(temp);
			conv.convertFtoC(temp);
		} else {
			System.out.println("Opção errada!");
		}		
	}
}
