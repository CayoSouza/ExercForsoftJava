package model;

public class Pessoa {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.split(" ").length>=2)
			this.nome = nome;
	}
}
