package br.lucas.ex_25_6;

public class TesteTriangulo {
	public static void main(String[] args) {
		Triangulo r1 = new Triangulo();
		Triangulo r2 = new Triangulo(new Ponto(1, 1), new Ponto(3,5));

		System.out.println(r1);
		System.out.println("O centro de r1 é :" + r1.centro());
		System.out.println(r2);
		System.out.println("O centro de r2 é :" + r2.centro());
		
		System.out.printf("A distancia entre r1 e r2 é %f\n", r1.distancia(r2));
		
		Triangulo r3 = new Triangulo();
		Ponto p1 = new Ponto(-1,5);
		Ponto p2 = new Ponto(4,7);
		System.out.println(r3);
		r3.setA(p1);
		System.out.println(r3);
		r3.setB(p2);
		System.out.println(r3);
		
		p1.setX(1);
		Triangulo r4 = new Triangulo(p1, p2);
		System.out.println(r4);
		System.out.println(r3);
	}
}
