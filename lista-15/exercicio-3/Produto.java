/**
 * Produto imutável: atributos final, sem setters e construtor privado.
 * Só é criado pelo Builder (padrão de projeto de criação Builder).
 */
public class Produto {
    private final Long id;
    private final String nome;
    private final String descricao;
    private final Double preco;
    private final String categoria;

    // Construtor privado: só o Builder cria um Produto
    private Produto(Builder builder) {
        this.id = builder.id;
        this.nome = builder.nome;
        this.descricao = builder.descricao;
        this.preco = builder.preco;
        this.categoria = builder.categoria;
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public Double getPreco() { return preco; }
    public String getCategoria() { return categoria; }

    @Override
    public String toString() {
        return "Produto{id=" + id + ", nome='" + nome + "', descricao='" + descricao
                + "', preco=" + preco + ", categoria='" + categoria + "'}";
    }

    /** Builder com interface fluente: cada método devolve o próprio Builder. */
    public static class Builder {
        private Long id;
        private String nome;
        private String descricao;
        private Double preco;
        private String categoria;

        public Builder id(Long id) { this.id = id; return this; }
        public Builder nome(String nome) { this.nome = nome; return this; }
        public Builder descricao(String descricao) { this.descricao = descricao; return this; }
        public Builder preco(Double preco) { this.preco = preco; return this; }
        public Builder categoria(String categoria) { this.categoria = categoria; return this; }

        public Produto build() {
            // a) id e nome são obrigatórios
            if (id == null) {
                throw new IllegalStateException("O id é obrigatório.");
            }
            if (nome == null || nome.isBlank()) {
                throw new IllegalStateException("O nome é obrigatório.");
            }
            // b) se informado, o preço não pode ser negativo
            if (preco != null && preco < 0) {
                throw new IllegalArgumentException("O preço não pode ser negativo.");
            }
            // c) validação cruzada: e-book precisa ter preço 0.0
            if ("E-books".equals(categoria) && (preco == null || preco != 0.0)) {
                throw new IllegalArgumentException("Produtos da categoria E-books devem ter preço 0.0.");
            }
            return new Produto(this);
        }
    }
}
