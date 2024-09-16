package clientes;

public class Node {
	private Cliente cliente;
	private Node next;

	public Node() {

	}

	public Node(Cliente cliente) {
		this.cliente = cliente;
		this.next = null;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
