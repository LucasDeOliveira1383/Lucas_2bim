package br.lucas.ex_25_6;

public abstract class FiguraGeometrica {
	public abstract Ponto centro();
	public abstract float perimetro();
	public abstract float area();
	public abstract float largura();
	public abstract float altura();
	
	public float distancia(FiguraGeometrica figura) {
		return centro().distancia(forma.centro());
	}
	
	public String ObjectToString() {
		return super.toString();
	}
}
