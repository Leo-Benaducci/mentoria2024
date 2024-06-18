package br.com.lbenaducci;

import org.w3c.dom.ls.LSOutput;

import java.awt.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		Calculadora calculadora = new Calculadora(new Soma(() -> 2,() ->3));


		System.out.println(calculadora.isEqualTo());

	}



}