import java.util.ArrayList;
import java.util.List;

/** Pedido que armazena vários produtos. */
public class Pedido {
    private List<Produto> produtos = new ArrayList<>();

    /** Insere um produto no pedido. */
    public void inserirProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    /** Retorna o total do pedido (soma dos subtotais). */
    public double getTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getSubtotal();
        }
        return total;
    }
}
