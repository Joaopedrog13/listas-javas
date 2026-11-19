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
            return new Produto(this);
        }
    }
}
