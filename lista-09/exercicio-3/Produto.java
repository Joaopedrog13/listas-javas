/** Produto com nome, preço e quantidade em estoque. */
public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public int getQuantidadeEstoque() { return quantidadeEstoque; }
    public void setQuantidadeEstoque(int quantidadeEstoque) { this.quantidadeEstoque = quantidadeEstoque; }

    /** Aumenta o estoque. */
    public void reporEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade de reposição inválida.");
            return;
        }
        quantidadeEstoque += quantidade;
        System.out.println("Reposição de " + quantidade + " unidade(s) feita.");
    }

    /** Reduz o estoque somente se houver quantidade suficiente. */
    public void venderProduto(int quantidade) {
        if (quantidade > quantidadeEstoque) {
            System.out.println("Venda de " + quantidade + " unidade(s) recusada: estoque insuficiente ("
                    + quantidadeEstoque + " disponível).");
            return;
        }
        quantidadeEstoque -= quantidade;
        System.out.println("Venda de " + quantidade + " unidade(s) feita.");
    }

    /** Mostra os dados do produto. */
    public void exibirProduto() {
        System.out.printf("Produto: %s | Preço: R$ %.2f | Estoque: %d%n", nome, preco, quantidadeEstoque);
    }
}
