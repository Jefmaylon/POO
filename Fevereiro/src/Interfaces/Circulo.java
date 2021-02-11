package Interfaces;

public class Circulo implements FiguraGeometrica{
	
	private double raio;

	public Circulo(Cor cor, double raio) {
		super();
		this.raio = raio;
	}
	
	public double calculoArea() {
		return Math.PI * (this.raio * this.raio); 
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio (double raio) {
		this.raio = raio;
	}
}
