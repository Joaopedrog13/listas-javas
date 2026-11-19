// Lista 15 - Exercício 2: Director cria os perfis; o cliente completa id e nome
public class Main {
    public static void main(String[] args) {
        ProdutoDirector director = new ProdutoDirector();

        Produto.Builder builderLivro = new Produto.Builder();
        director.construirLivroPadrao(builderLivro);          // Director define categoria, preço e descrição
        Produto livro = builderLivro.id(10L)                  // cliente ainda define id e nome
                                    .nome("Dom Casmurro")
                                    .build();

        Produto.Builder builderEbook = new Produto.Builder();
        director.construirEbookGratuito(builderEbook);
        Produto ebook = builderEbook.id(11L)
                                    .nome("Guia de Reciclagem")
                                    .build();

        System.out.println("Livro: " + livro);
        System.out.println("E-book: " + ebook);
    }
}
