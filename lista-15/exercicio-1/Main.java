// Lista 15 - Exercício 1: produto completo e parcial com o Builder
public class Main {
    public static void main(String[] args) {
        Produto completo = new Produto.Builder()
                .id(1L)
                .nome("Fone Bluetooth")
                .descricao("Fone sem fio com cancelamento de ruído")
                .preco(249.90)
                .categoria("Eletrônicos")
                .build();

        Produto parcial = new Produto.Builder()
                .id(2L)
                .nome("Garrafa térmica")
                .build();

        System.out.println("Completo: " + completo);
        System.out.println("Parcial:  " + parcial);
        // Produto é imutável: não existe setNome(), e new Produto(...) não compila (construtor privado).
    }
}
