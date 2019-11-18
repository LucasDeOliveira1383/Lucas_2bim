package br.lucas.ex_25_6;

public class TesteGeral {
	public static void main(String[] args) {
		Ponto p1 = new Ponto();
		Ponto p2 = new Ponto(1, 1);
		Ponto p3 = null;
		Ponto p4 = new Ponto();
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.printf("{%d, %d}\n", p1.getX(), p1.getY());
		System.out.printf("{%d, %d}\n", p2.getX(), p2.getY());
		
		System.out.println("p1 está no " + p1.quadrante());
		System.out.println("p2 está no " + p2.quadrante());
		
		System.out.printf("A distancia entre p1 e p2 é %f\n", p1.distancia(p2));
		
		System.out.println("p1 e p2 sao " + (p1.equals(p2) ? "iguais" : "diferentes"));
		System.out.println("p1 e p1 sao " + (p1.equals(p1) ? "iguais" : "diferentes"));
		System.out.println("p1 e p3 sao " + (p1.equals(p3) ? "iguais" : "diferentes"));
		System.out.println("p1 e p4 sao " + (p1.equals(p4) ? "iguais" : "diferentes"));
		System.out.println(p1.ObjectToString());
		System.out.println(p3);
		p3 = p1;
		System.out.println("p1 e p3 sao " + (p1.equals(p3) ? "iguais" : "diferentes"));
		System.out.println(p1.ObjectToString());
		System.out.println(p3.ObjectToString());
		p3.setX(2);
		System.out.println("p1 e p3 sao " + (p1.equals(p3) ? "iguais" : "diferentes"));
		System.out.println(p1.ObjectToString());
		System.out.println(p3.ObjectToString());
	}
}
