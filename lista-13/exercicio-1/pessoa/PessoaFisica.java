package pessoa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/** Pessoa física: filha de Pessoa, com CPF. */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true) // inclui no texto os dados da classe mãe
public class PessoaFisica extends Pessoa {
    private String cpf;
}
