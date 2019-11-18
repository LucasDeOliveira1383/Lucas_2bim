package br.lucas.ex_25_6;

public class TesteLinha {
	
	public static void main(String[] args) {
		Linha l1 = new Linha();
		Linha l2 = new Linha(new Ponto(1, 1), new Ponto(3,5));

		System.out.println(l1);
		System.out.println("O centro de l1 é :" + l1.centro());
		System.out.println(l2);
		System.out.println("O centro de l2 é :" + l2.centro());
		
		System.out.printf("A distancia entre l1 e l2 é %f\n", l1.distancia(l2));
		
		Linha l3 = new Linha();
		Ponto p1 = new Ponto(-1,5);
		Ponto p2 = new Ponto(4,7);
		System.out.println(l3);
		l3.setA(p1);
		System.out.println(l3);
		l3.setB(p2);
		System.out.println(l3);
		
		p1.setX(1);
		Linha l4 = new Linha(p1, p2);
		System.out.println(l4);
		System.out.println(l3);
	}
	
}
