package clientes;

public class ListaCliente {
	private Node head;

	public ListaCliente() {

	}

	public void add(Cliente cliente) {
		Node novoNode = new Node(cliente);
		if (head == null) {
			head = novoNode;
		} else {
			Node atual = head;
			while (atual.getNext() != null) {
				atual = atual.getNext();
			}
			atual.setNext(novoNode);
		}
	}

	public Cliente get(String nome) {
		Node atual = head;
		while (atual != null) {
			if (atual.getCliente().getNome().equalsIgnoreCase(nome)) {
				return atual.getCliente();
			}

			atual = atual.getNext();
		}
		return null;
	}

	public boolean update(String nome, Cliente novoCliente) {
		Node atual = head;
		while (atual != null) {
			if (atual.getCliente().getNome().equalsIgnoreCase(nome)) {
				atual.setCliente(novoCliente);
				return true;
			}

			atual = atual.getNext();
		}
		return false;
	}

	public boolean remove(String nome) {
		if (head == null)
			return false;

		if (head.getCliente().getNome().equalsIgnoreCase(nome)) {
			head = head.getNext();
			return true;
		}

		Node anterior = head;
		Node atual = head.getNext();
		while (atual != null) {
			if (atual.getCliente().getNome().equalsIgnoreCase(nome)) {
				anterior.setNext(atual.getNext());
				return true;
			}
			anterior = atual;
			atual = atual.getNext();
		}

		return false;
	}

	public void display() {
		Node current = head;
		if (current == null) {
			System.out.println("Nenhum cliente cadastrado.");
			return;
		}

		System.out.println("\nLista de Clientes Cadastrados:");
		System.out.println("-".repeat(100));
		System.out.println(
				"ID    | Nome                 | Idade | Endereço                                             | Telefone       ");
		System.out.println("-".repeat(100));

		while (current != null) {
			System.out.println(current.getCliente());
			current = current.getNext();
		}

		System.out.println("-".repeat(100));
	}
}
