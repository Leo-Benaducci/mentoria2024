package br.com.lbenaducci;

public class Cachorro {
	private String nome;
	private int idade;

	public Cachorro(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public Cachorro(String nome) {
		this(nome, 0);
		//		this.nome = nome;
		//		this.idade = 0;
	}

	public Cachorro() {
		this("Godofredo");
	}

	public void latir() {
		if(idade > 20) {
			System.out.println("....");
		} else {
			System.out.println("Au au");
		}
	}

	public String buscar(int item) {
		if(item == 0) {
			return "Jornal";
		}else {
			return "Bola";
		}
	}

	public static void foto() {
		System.out.println("asougvhbiowvgai");
	}

	public String getNome() {
		return "Cacchorro: " + nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if(idade < 0) {
			System.out.println("Ta maluco");
		}
		if(idade > 20) {
			System.out.println("Ja morreu");
		}
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Cachorro{" +
				"nome='" + nome + '\'' +
				", idade=" + idade +
				'}';
	}
}
