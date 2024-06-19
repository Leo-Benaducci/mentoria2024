package br.com.lbenaducci;

import java.util.Random;

public class Main {
	public static void main(String[] args) throws QualquerCoisaException {
		System.out.println("vish");
		//...
		try {
			seraQDeuErro();
			seraQDeuErro2();
			System.out.println("Deu certo");
		} catch(QualquerCoisaException e) {
			System.out.println("vish deu erro");
		} catch(UnsupportedOperationException e) {
			throw new QualquerCoisaException(e);
		} catch(Exception e) {
			System.out.println("vish deu outro erro");
		} finally {
			System.out.println("vish");
		}
		//...
	}

	public static void seraQDeuErro() throws QualquerCoisaException {
		if(new Random().nextBoolean()) {
			throw new QualquerCoisaException();
		}
	}

	public static void seraQDeuErro2() {
		if(new Random().nextBoolean()) {
			throw new UnsupportedOperationException();
		}
	}
}