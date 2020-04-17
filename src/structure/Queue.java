package structure;

/**
 * 
 * @author Daniel Felipe Contreras Lopez
 * @author daniel.contreras@uptc.edu.co
 * @author cldfrkr@hotmail.com
 * @param <T>
 */
public class Queue<T> extends Node<T> {

	private Node<T> top;
	private Node<T> queue;
	
	/**
	 * Crea una Cola vacia
	 */
	public Queue() {
		this.top = null;
		this.queue = null;
	}
	
	/**
	 * Crea una cola con un elemento
	 * @param insert Nodo Tipo T
	 */
	public Queue(Node<T> insert) {
		this.top = insert;
		this.queue = insert;
	}

	/**
	 * Agrega un elemento a la Cola
	 * 
	 * @param info
	 *            Tipo T
	 */
	public void push(T info) {
		if (!(this.isEmpty())) {
			this.queue.setNext(new Node<T>(info));
			this.queue = this.queue.getNext();
		} else {
			this.top = new Node<T>(info);
			this.queue = this.top;
		}
	}
	
	/**
	 * Retira el primer elemento en la Cola
	 * @return Info de Tipo T
	 */
	public T pop() {
		if (!(this.isEmpty())) {
			T info = this.top.info;
			this.top = this.top.getNext();
			return info;
		}
		return null;
	}
	
	/**
	 * Revisa si la lista esta vacia
	 * @return true = lista vacia
	 */
	public boolean isEmpty() {
		return this.top == null;
	}
	
	/**
	 * Regresa eltope de la Cola
	 * @return Nodo Tipo T
	 */
	public Node<T> getTop() {
		return this.top;
	}

}
