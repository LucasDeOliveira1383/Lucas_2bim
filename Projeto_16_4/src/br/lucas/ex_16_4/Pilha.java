package br.lucas.ex_16_4;

public class Pilha {
	
	int elementos[];
	int topo;
	
	public Pilha() {
		elementos = new int[10];
		topo = -1;
	}
	
	public void push(int e) {
		if (isFull()) {
			throw new RuntimeException("Stack Overflow!");
		}
		topo++;
		elementos[topo] = e;
	}
	
	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack Empty!");
		}
		int e;
		e = elementos[topo];
		topo--;
		return e;
	}
	
	public boolean isEmpty() {
		return (topo == -1);
	}
	
	public boolean isFull() {
		return (topo == 9);
	}
	
	public int top() {
		if(isEmpty()) {
			throw new RuntimeException("Empty Stack!");
		}
		return elementos[topo];
	}
}
