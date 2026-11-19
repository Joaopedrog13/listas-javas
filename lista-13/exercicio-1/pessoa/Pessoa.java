package pessoa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/** Classe mãe. O Lombok gera construtores, getters, setters e toString(). */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Pessoa {
    private String nome;
    private String telefone;
}
