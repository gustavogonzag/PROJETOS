package moto;

public class Moto {
	private String marca, modelo, placa;
	private Integer chassis, cilindradas;
	private Double kilometragem;
	
	public Moto(String marca, String modelo, String placa, Integer chassis, Integer cilindradas, Double kilometragem) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.chassis = chassis;
		this.cilindradas = cilindradas;
		this.kilometragem = kilometragem;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Integer getChassis() {
		return chassis;
	}
	public void setChassis(Integer chassis) {
		this.chassis = chassis;
	}
	public Integer getCilindradas() {
		return cilindradas;
	}
	public void setCilindradas(Integer cilindradas) {
		this.cilindradas = cilindradas;
	}
	public Double getKilometragem() {
		return kilometragem;
	}
	public void setKilometragem(Double kilometragem) {
		this.kilometragem = kilometragem;
	}
	
	public void imprimeMoto() {
		System.out.println("DETALHES DA MOTO:");
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Cilindradas: " + cilindradas);
		System.out.println("Kilometragem: " + kilometragem);
		System.out.println("Placa: " + placa);
		System.out.println("Chassis: " + chassis);
	}
	
	public static void main(String[] args) {
		Moto moto = new Moto("Honda", "CB500", "GIT-709", 952145, 500, 20.700 );
		moto.imprimeMoto();
		moto.setPlaca("GIT-HUB");
		System.out.println("------ALTERANDO PLACA------");
		moto.imprimeMoto();
	}
	
}
