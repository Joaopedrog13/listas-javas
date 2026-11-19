import java.util.Map;

// Lista 14 - Exercício 1: varargs para somar valores de produtos por tipo
public class Main {
    public static void main(String[] args) {
        CentroDeDistribuicao centro = new CentroDeDistribuicao(
                "12.345.678/0001-90", "CD Barreiro", "Av. Afonso Vaz de Melo, 1200 - Belo Horizonte/MG");

        Produto p1 = new Produto(1, "Notebook", "Eletrônicos", 3500.00);
        Produto p2 = new Produto(2, "Mouse", "Eletrônicos", 89.90);
        Produto p3 = new Produto(3, "Cadeira", "Móveis", 750.00);
        Produto p4 = new Produto(4, "Mesa", "Móveis", 1200.00);
        Produto p5 = new Produto(5, "Arroz 5 kg", "Alimentos", 28.50);

        System.out.println("Centro: " + centro.getNome() + " | CNPJ: " + centro.getCnpj());
        System.out.println("Endereço: " + centro.getEndereco());

        System.out.println("\n1) Com cinco produtos:");
        imprimir(centro.somarPorTipo(p1, p2, p3, p4, p5));

        System.out.println("\n2) Com dois produtos:");
        imprimir(centro.somarPorTipo(p3, p5));

        System.out.println("\n3) Passando um vetor:");
        Produto[] lote = { p1, p2 };
        imprimir(centro.somarPorTipo(lote));

        System.out.println("\n4) Sem nenhum produto (varargs vira um vetor vazio):");
        imprimir(centro.somarPorTipo());
    }

    static void imprimir(Map<String, Double> totais) {
        if (totais.isEmpty()) {
            System.out.println("   (nenhum produto informado)");
        }
        for (Map.Entry<String, Double> e : totais.entrySet()) {
            System.out.printf("   %-12s R$ %.2f%n", e.getKey() + ":", e.getValue());
        }
    }
}
