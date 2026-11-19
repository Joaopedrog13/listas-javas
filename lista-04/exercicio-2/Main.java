import java.util.Scanner;

// Lista 04 - Exercício 2: média, menor e maior nota com do-while
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota, soma = 0, menor = 0, maior = 0;
        int quantidade = 0;
        String resposta;

        do {
            // lê e valida a nota (0 a 10)
            boolean valida;
            do {
                System.out.print("Informe a nota (0 a 10): ");
                nota = lerNumero(sc);
                valida = nota >= 0 && nota <= 10;
                if (!valida) System.out.println("Nota inválida! Apenas notas de 0 a 10 são aceitas.");
            } while (!valida);

            quantidade++;
            soma += nota;
            if (quantidade == 1 || nota < menor) menor = nota;
            if (quantidade == 1 || nota > maior) maior = nota;

            // pergunta se deseja continuar
            do {
                System.out.print("Deseja inserir outra nota? (s/n): ");
                resposta = sc.nextLine().trim().toLowerCase();
            } while (!resposta.equals("s") && !resposta.equals("n"));
        } while (resposta.equals("s"));

        System.out.println("\nNotas inseridas: " + quantidade);
        System.out.printf("Menor nota: %.2f%n", menor);
        System.out.printf("Média das notas: %.2f%n", soma / quantidade);
        System.out.printf("Maior nota: %.2f%n", maior);
        sc.close();
    }

    // Lê um número aceitando vírgula ou ponto; se não for número, retorna -1 (valor inválido)
    static double lerNumero(Scanner sc) {
        String entrada = sc.nextLine().trim().replace(",", ".");
        try {
            return Double.parseDouble(entrada);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
