// Lista 15 - Exercício 3: build() valida as regras de negócio
public class Main {
    public static void main(String[] args) {
        // Produto válido, para comparar
        Produto ok = new Produto.Builder().id(1L).nome("Caneta").preco(3.50).categoria("Papelaria").build();
        System.out.println("Válido: " + ok);

        System.out.println("\na) Teste sem nome (obrigatório):");
        try {
            new Produto.Builder().id(2L).build();
        } catch (IllegalStateException e) {
            System.out.println("   Bloqueado: " + e.getMessage());
        }

        System.out.println("\na) Teste sem id (obrigatório):");
        try {
            new Produto.Builder().nome("Lápis").build();
        } catch (IllegalStateException e) {
            System.out.println("   Bloqueado: " + e.getMessage());
        }

        System.out.println("\nb) Teste com preço negativo:");
        try {
            new Produto.Builder().id(3L).nome("Borracha").preco(-5.0).build();
        } catch (IllegalArgumentException e) {
            System.out.println("   Bloqueado: " + e.getMessage());
        }

        System.out.println("\nc) Teste de e-book com preço diferente de 0.0:");
        try {
            new Produto.Builder().id(4L).nome("E-book pago").categoria("E-books").preco(19.90).build();
        } catch (IllegalArgumentException e) {
            System.out.println("   Bloqueado: " + e.getMessage());
        }

        System.out.println("\nO Director continua funcionando com as validações:");
        ProdutoDirector director = new ProdutoDirector();
        Produto.Builder b = new Produto.Builder();
        director.construirEbookGratuito(b);
        System.out.println("   " + b.id(5L).nome("Guia de Reciclagem").build());
    }
}
