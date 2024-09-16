package clientes;

import java.util.Scanner;

public class Menu {
	private Scanner scanner;
	private ListaCliente lista;

	public Menu() {
		this.scanner = new Scanner(System.in);
		this.lista = new ListaCliente();
	}

	public void exibirMenu() {
		int opcao;
		do {
			System.out.println("\nSistema de Cadastro de Clientes");
			System.out.println("1. Cadastrar Cliente");
			System.out.println("2. Consultar Cliente");
			System.out.println("3. Atualizar Cliente");
			System.out.println("4. Remover Cliente");
			System.out.println("5. Listar Todos os Clientes");
			System.out.println("6. Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				cadastrarCliente();
				break;
			case 2:
				consultarCliente();
				break;
			case 3:
				atualizarCliente();
				break;
			case 4:
				removerCliente();
				break;
			case 5:
				listarClientes();
				break;
			case 6:
				System.out.println("Saindo do sistema...");
				break;
			default:
				System.out.println("Opção inválida! Tente novamente.");
			}
		} while (opcao != 6);

		scanner.close();
	}

	private void cadastrarCliente() {
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		System.out.print("Idade: ");
		int idade = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Endereço: ");
		String endereco = scanner.nextLine();
		System.out.print("Telefone: ");
		String telefone = scanner.nextLine();
		Cliente cliente = new Cliente(nome, idade, endereco, telefone);
		lista.add(cliente);
	}

	private void consultarCliente() {
		System.out.print("Nome do Cliente a ser consultado: ");
		String nomeConsulta = scanner.nextLine();
		Cliente clienteEncontrado = lista.get(nomeConsulta);
		if (clienteEncontrado != null) {
			System.out.println("\nCliente encontrado:");
			System.out.println(clienteEncontrado);
		} else {
			System.out.println("Cliente não encontrado.");
		}
	}

	private void atualizarCliente() {
		System.out.print("Nome do Cliente a ser atualizado: ");
		String nomeAtualizar = scanner.nextLine();
		System.out.print("Novo Nome: ");
		String novoNome = scanner.nextLine();
		System.out.print("Nova Idade: ");
		int novaIdade = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Novo Endereço: ");
		String novoEndereco = scanner.nextLine();
		System.out.print("Novo Telefone: ");
		String novoTelefone = scanner.nextLine();
		Cliente novoCliente = new Cliente(novoNome, novaIdade, novoEndereco, novoTelefone);
		if (lista.update(nomeAtualizar, novoCliente)) {
			System.out.println("Cliente atualizado com sucesso.");
		} else {
			System.out.println("Cliente não encontrado.");
		}
	}

	private void removerCliente() {
		System.out.print("Nome do Cliente a ser removido: ");
		String nomeRemover = scanner.nextLine();
		if (lista.remove(nomeRemover)) {
			System.out.println("Cliente removido com sucesso.");
		} else {
			System.out.println("Cliente não encontrado.");
		}
	}

	private void listarClientes() {
		lista.display();
	}
}
