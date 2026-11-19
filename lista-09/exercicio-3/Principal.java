// Lista 09 - Exercício 3: reposição e venda de um Produto
public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("Caderno universitário", 24.90, 10);
        System.out.println("=== Dados iniciais ===");
        produto.exibirProduto();

        System.out.println("\n=== Reposição ===");
        produto.reporEstoque(5);
        produto.exibirProduto();

        System.out.println("\n=== Venda ===");
        produto.venderProduto(12);
        produto.exibirProduto();

        System.out.println("\n=== Venda maior que o estoque ===");
        produto.venderProduto(20);
        produto.exibirProduto();
    }
}
