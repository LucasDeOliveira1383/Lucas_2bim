package br.lucas.ex_25_6;

public class TesteRetangulo {
	
	public static void main(String[] args) {
		Retangulo r1 = new Retangulo();
		Retangulo r2 = new Retangulo(new Ponto(1, 1), new Ponto(3,5));

		System.out.println(r1);
		System.out.println("O centro de r1 � :" + r1.centro());
		System.out.println(r2);
		System.out.println("O centro de r2 � :" + r2.centro());
		
		System.out.printf("A distancia entre r1 e r2 � %f\n", r1.distancia(r2));
		
		Retangulo r3 = new Retangulo();
		Ponto p1 = new Ponto(-1,5);
		Ponto p2 = new Ponto(4,7);
		System.out.println(r3);
		r3.setA(p1);
		System.out.println(r3);
		r3.setB(p2);
		System.out.println(r3);
		
		p1.setX(1);
		Retangulo r4 = new Retangulo(p1, p2);
		System.out.println(r4);
		System.out.println(r3);
	}
	
}
