package Interfaces;

public abstract class FiguraGeometricaClass implements FiguraGeometrica {

	private Cor cor;

	public FiguraGeometricaClass(Cor cor) {
		super();
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	
}
