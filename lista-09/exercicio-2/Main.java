// Lista 09 - Exercício 2: dois objetos da classe Aluno
public class Main {
    public static void main(String[] args) {
        // dados definidos pelo construtor
        Aluno aluno1 = new Aluno("Mariana Costa", 862200, "Análise e Desenvolvimento de Sistemas");

        // dados definidos pelos métodos set()
        Aluno aluno2 = new Aluno("", 0, "");
        aluno2.setNome("Pedro Henrique");
        aluno2.setMatricula(862201);
        aluno2.setCurso("Engenharia de Software");

        System.out.println("=== Alunos ===");
        aluno1.exibirDados();
        aluno2.exibirDados();

        // usando um get()
        System.out.println("\nCurso do 2º aluno (via get): " + aluno2.getCurso());
    }
}
