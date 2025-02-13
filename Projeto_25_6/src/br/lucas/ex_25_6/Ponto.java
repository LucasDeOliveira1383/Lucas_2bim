package br.lucas.ex_25_6;

public class Ponto extends FiguraGeometrica {
	private int x;
	private int y;
	
	public Ponto() {
		x = 0;
		y = 0;
	}
	
	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public String quadrante() {
		if(x > 0 && y > 0)
			return "I Quadrante";
		if(x < 0 && y > 0)
			return "II Quadrante";
		if(x < 0 && y < 0)
			return "III Quadrante";
		if(x > 0 && y < 0)
			return "IV Quadrante";
		return "Origem";
	}
	
	public float distancia(Ponto pt) {
		return (float) Math.sqrt( (x-pt.x)*(x-pt.x) + (y-pt.y)*(y-pt.y));
	}
	
	public Ponto centro() {
		return new Ponto(x, y);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(!obj.getClass().equals(Ponto.class))
			return false;
		if(obj == this)
			return true;
		
		if(this.x != ((Ponto)obj).x)
			return false;
		if(this.y != ((Ponto)obj).y)
			return false;
		
		return true;
	}
	
	@Override
	public String toString() {
		return "(" + x + "; " + y + ")";
	}
	
	@Override
	public float perimetro() {
		return 0;
	}
	
	@Override
	public float area() {
		return 0;
	}
	
	@Override
	public float largura() {
		return 0;
	}
	
	@Override
	public float altura() {
		return 0;
	}
}
