import java.util.Locale;
import java.util.Scanner;

// Lista 16 - Exercício 1: enum NivelAcesso com switch expression
public class Main {

    enum NivelAcesso {
        ADMINISTRADOR, USUARIO, VISITANTE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escolha o nível (ADMINISTRADOR, USUARIO ou VISITANTE): ");
        String entrada = sc.hasNextLine() ? sc.nextLine().trim().toUpperCase(Locale.ROOT) : "";
        sc.close();

        NivelAcesso nivel;
        try {
            nivel = NivelAcesso.valueOf(entrada);
        } catch (IllegalArgumentException e) {
            System.out.println("Nível inválido. Use ADMINISTRADOR, USUARIO ou VISITANTE.");
            return;
        }

        // switch moderno: retorna o valor direto, sem break, e cobre todos os casos do enum
        String mensagem = switch (nivel) {
            case ADMINISTRADOR -> "Acesso total";
            case USUARIO -> "Pode visualizar e editar seus dados";
            case VISITANTE -> "Pode apenas visualizar";
        };

        System.out.println(nivel + ": " + mensagem);
    }
}
