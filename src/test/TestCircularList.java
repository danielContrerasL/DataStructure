package test;

import dobleList.CircularList;
import structure.Node;

public class TestCircularList {

	private CircularList<String> circularList;

	public TestCircularList() {
		this.circularList = new CircularList<String>();
		this.add();
	}

	private void add() {
		for (int i = 0; i < 20; i++) {
			this.circularList.add("" + (char) ('a' + i));
		}
	}

	public void print() {
		Node<String> aux = this.circularList.getHead();
		while (aux != null) {
			System.out.println(aux.getInfo());
			aux = aux.getNext();
		}
	}

	public static void main(String[] args) {
		TestCircularList t = new TestCircularList();
		t.print();
	}

}
