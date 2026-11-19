import java.util.Scanner;

// Lista 01 - Exercício 7: circunferência, círculo e esfera a partir do raio
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = lerDouble(sc, "Informe o raio: ");
        double comprimento = 2 * Math.PI * r;
        double areaCirculo = Math.PI * r * r;
        double areaEsfera = 4 * Math.PI * r * r;
        double volumeEsfera = 4.0 / 3.0 * Math.PI * r * r * r;
        System.out.printf("a) Comprimento da circunferência: %.2f%n", comprimento);
        System.out.printf("b) Área do círculo: %.2f%n", areaCirculo);
        System.out.printf("c) Área da superfície da esfera: %.2f%n", areaEsfera);
        System.out.printf("d) Volume da esfera: %.2f%n", volumeEsfera);
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
}
