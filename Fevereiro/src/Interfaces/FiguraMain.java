package Interfaces;

public class FiguraMain {

	public static void main(String[] args) {
				
		FiguraGeometrica circulo = new Circulo(Cor.ROSA, 47);
		FiguraGeometrica quadrado = new Quadrado(Cor.VERMELHO, 10);
		FiguraGeometrica retangulo = new Retangulo(Cor.AZUL, 20, 10);
		FiguraGeometrica triangulo = new Triangulo(Cor.BRANCO, 15, 8);
		
		System.out.println(triangulo.calculoArea() );
		System.out.println(quadrado.calculoArea() );
		System.out.println(retangulo.calculoArea() );
		System.out.println(circulo.calculoArea() );

	}

}
