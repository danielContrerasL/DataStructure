package test;

import structure.Stack;

public class TestStack {
	private Stack<Integer> aux = new Stack<Integer>();
	
	public void add() {
		for (int i = 0; i < 10; i++) {
			aux.push(i);
		}
		
//		for (int i = 0; i < 10; i++) {
		while (!aux.isEmpty()) {
			System.out.println(aux.pop());
		}
	}
	
	public static void main(String[] args) {
		new TestStack().add();
	}

}
