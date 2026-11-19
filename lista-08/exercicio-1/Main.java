import java.util.Scanner;

// Lista 08 - Exercício 1: classe Pedido com vários Produtos
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pedido pedido = new Pedido();

        int quantidadeProdutos = lerInt(sc, "Quantos produtos deseja inserir no pedido? ");
        for (int i = 1; i <= quantidadeProdutos; i++) {
            System.out.println("\nProduto " + i + ":");
            System.out.print("  Nome: ");
            String nome = sc.nextLine().trim();
            int quantidade = lerInt(sc, "  Quantidade: ");
            double preco = lerDouble(sc, "  Preço unitário: R$ ");
            pedido.inserirProduto(new Produto(nome, quantidade, preco));
        }

        System.out.println("\nPedido ->");
        for (Produto p : pedido.getProdutos()) {
            System.out.printf("   %s -> %d * %.2f = %.2f%n", p.getNome(), p.getQuantidade(), p.getPreco(), p.getSubtotal());
        }
        // o total é impresso pelo main, como pede o enunciado
        System.out.printf("Total do pedido: R$ %.2f%n", pedido.getTotal());
        sc.close();
    }

    static double lerDouble(Scanner sc, String msg) {
        while (true) {
            System.out.print(msg);
            if (!sc.hasNextLine()) System.exit(0);
            try {
                double v = Double.parseDouble(sc.nextLine().trim().replace(",", "."));
                if (v >= 0) return v;
            } catch (NumberFormatException e) { }
            System.out.println("Valor inválido! Digite um número maior ou igual a zero.");
        }
    }

    static int lerInt(Scanner sc, String msg) {
        while (true) {
            System.out.print(msg);
            if (!sc.hasNextLine()) System.exit(0);
            try {
                int v = Integer.parseInt(sc.nextLine().trim());
                if (v >= 0) return v;
            } catch (NumberFormatException e) { }
            System.out.println("Valor inválido! Digite um número inteiro maior ou igual a zero.");
        }
    }
}
