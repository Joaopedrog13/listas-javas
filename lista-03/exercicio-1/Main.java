import java.util.Scanner;

// Lista 03 - Exercício 1: estatísticas de notas e faltas com while (termina com nota negativa)
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alunos = 0, acimaDe90 = 0, reprovados = 0;
        double soma = 0, maior = 0, menor = 0;

        System.out.println("Informe a nota final (0 a 100) e as faltas de cada aluno. Nota negativa encerra.");
        double nota = lerDouble(sc, "\nNota final: ");
        while (nota >= 0) {
            if (nota > 100) {
                System.out.println("Nota inválida! A nota vai de 0 a 100.");
            } else {
                int faltas = lerInt(sc, "Total de faltas: ");
                while (faltas < 0) {
                    System.out.println("Faltas inválidas! Digite 0 ou mais.");
                    faltas = lerInt(sc, "Total de faltas: ");
                }
                alunos++;
                soma += nota;
                if (alunos == 1 || nota > maior) maior = nota;
                if (alunos == 1 || nota < menor) menor = nota;
                if (nota >= 90) acimaDe90++;
                if (nota < 70 || faltas >= 20) reprovados++;
            }
            nota = lerDouble(sc, "\nNota final: ");
        }

        if (alunos == 0) {
            System.out.println("Nenhum aluno foi informado.");
        } else {
            System.out.println("\nAlunos informados: " + alunos);
            System.out.println("a) Alunos com nota >= 90: " + acimaDe90);
            System.out.println("b) Reprovados por nota (< 70) ou por falta (>= 20): " + reprovados);
            System.out.printf("c) Maior nota: %.2f | Menor nota: %.2f%n", maior, menor);
            System.out.printf("d) Média da turma: %.2f%n", soma / alunos);
        }
        sc.close();
    }

    // Lê um número com validação (aceita vírgula ou ponto)
    static double lerDouble(Scanner sc, String msg) {
        while (true) {
            System.out.print(msg);
            if (!sc.hasNextLine()) System.exit(0);
            String entrada = sc.nextLine().trim().replace(",", ".");
            try {
                return Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Digite um número.");
            }
        }
    }

    // Lê um número inteiro com validação
    static int lerInt(Scanner sc, String msg) {
        while (true) {
            System.out.print(msg);
            if (!sc.hasNextLine()) System.exit(0);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Digite um número inteiro.");
            }
        }
    }
}
