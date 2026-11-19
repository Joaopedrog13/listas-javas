package pessoa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/** Pessoa jurídica: filha de Pessoa, com CNPJ. */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true) // inclui no texto os dados da classe mãe
public class PessoaJuridica extends Pessoa {
    private String cnpj;
}
