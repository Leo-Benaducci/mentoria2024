package br.com.lbenaducci;

import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		int b = 0;

		String a = "uisdhbiugb";
		if(a.length() > 5) {
			System.out.println("deu certo");
		}

		String d = "c";
		switch(d) {
			case "a" -> System.out.println("é a");
			case "b" -> System.out.println("nao é a");
			default -> System.out.println("n sei o q é");
		}

		char[] chars = a.toCharArray();
		for(int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]);
		}
		for(char c: a.toCharArray()) {
			System.out.println(c);
		}
		Stream.of(a.toCharArray()).forEach(c -> System.out.println(c));
		Stream.of(a.toCharArray()).forEach(System.out::println);

		int count = 0;
		while(count < chars.length -1) {
			count++;
			System.out.println(chars[count]);
		}

		int count2 = 0;
		do {
			count2++;
			System.out.println(chars[count]);
		}while(count2 < chars.length -1);

		Cachorro cachorro = new Cachorro("Luis");
		Cachorro cachorro1 = new Cachorro("Lucas", 3);
		System.out.println(cachorro);
		System.out.println(cachorro1.getNome());
		cachorro1.setIdade(50);
		cachorro.latir();
		String buscar = cachorro.buscar(0);

		Cachorro.foto();

		System.out.println(buscar);
	}
}