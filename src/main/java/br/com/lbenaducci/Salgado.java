package br.com.lbenaducci;

public sealed interface Salgado extends Comida permits Risoles, Pizza{
}
