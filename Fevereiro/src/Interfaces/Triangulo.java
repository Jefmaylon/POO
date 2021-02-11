package Interfaces;

public class Triangulo implements FiguraGeometrica{

	private double base;
	private double altura;
	public Triangulo(Cor cor, double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	public double calculoArea() {
		return this.base * this.altura / 2;
	}
	
	public double getArea() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
