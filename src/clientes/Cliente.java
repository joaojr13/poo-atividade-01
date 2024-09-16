package clientes;

public class Cliente {
	private static int contador = 1;
	private int id;
	private String nome;
	private int idade;
	private String endereco;
	private String telefone;

	public Cliente(String nome, int idade, String endereco, String telefone) {
		this.id = contador++;
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return String.format("%-5d | %-20s | %-5d | %-50s | %-15s", id, nome, idade, endereco, telefone);
	}

}
