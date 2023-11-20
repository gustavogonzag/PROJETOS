package testeAula;

public class AreaTriangulo {
	private int largura, altura;

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public int calcular(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
		return (this.largura * this.altura) / 2;
	}
	
	public static void main (String[] args) {
		AreaTriangulo area = new AreaTriangulo();
		System.out.println(area.calcular(5, 2));
	}
}
