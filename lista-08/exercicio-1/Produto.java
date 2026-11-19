/** Produto de um pedido: nome, quantidade e preço unitário. */
public class Produto {
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public int getQuantidade() { return quantidade; }
    public double getPreco() { return preco; }

    /** Subtotal do produto: quantidade x preço. */
    public double getSubtotal() {
        return quantidade * preco;
    }
}
