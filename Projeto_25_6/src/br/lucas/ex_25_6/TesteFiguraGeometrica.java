package br.lucas.ex_25_6;

public class TesteFiguraGeometrica {
	
	public static void main(String[] args) {
		Ponto p = new Ponto(2, 5);
		Linha l = new Linha(p, new Ponto(7, 15));
		Retangulo r = new Retangulo(new Ponto(4,4), new Ponto(7,7));
		
		System.out.printf("Centros: %s\t%s\t%s\n", p.centro(), l.centro(), r.centro());
		System.out.printf("Perimetros: %f\t%f\t%f\n", p.perimetro(),l.perimetro(), r.perimetro());
		System.out.printf("Areas: %f\t%f\t%f\n", p.area(),l.area(), r.area());
		System.out.printf("Alturas: %f\t%f\t%f\n", p.altura(),l.altura(), r.altura());
		System.out.printf("Larguras: %f\t%f\t%f\n", p.largura(),l.largura(), r.largura());
		
		FiguraGeometrica v[] = new FiguraGeometrica[3];
		v[0] = p;
		v[1] = l;
		v[2] = r;
		
		for(int i = 0; i < v.length; i++) {
			System.out.printf("Centro: %s\n", v[i].centro());
			System.out.printf("Perimetro: %f\n", v[i].perimetro());
			System.out.printf("Area: %f\n", v[i].area());
			System.out.printf("Largura: %f\n", v[i].largura());
			System.out.printf("Altura: %f\n", v[i].altura());
		}

	}

}
