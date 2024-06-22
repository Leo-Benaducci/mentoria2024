package br.com.lbenaducci;
import java.util.List;

public class Combo extends Item{
    private List<Item> itens;

    public Combo(String Nome, double Preco, List<Item> itens) {
        super(Nome, Preco,Categoria.COMBO);
        this.itens = itens;
    }

    public List<Item> getItens() {
        return itens;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString() + " [Itens: "); // Cria um StringBuilder inicializado com a representação padrão do objeto + um texto adicional
        for (Item item : itens) { // Itera sobre a lista de itens
            sb.append(item.getNome()).append(", "); // Adiciona o nome de cada item seguido de uma vírgula ao StringBuilder
        }
        sb.append("]"); // Adiciona um fechamento para a lista de itens
        return sb.toString(); // Retorna o conteúdo do StringBuilder como uma String
    }

}
