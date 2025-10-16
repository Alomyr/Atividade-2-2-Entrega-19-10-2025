package src.main.java.com.atividadeDePratica.lp2;
public class Main {
    public static void main(String[] args) {
        // Repositório sem Generics - aluno deve arrumar
        Repositorio<Aluno> repoAluno = new Repositorio();
        Repositorio<String> repo = new Repositorio<>();

        // Testando com String
        repo.adicionar("Banana");
        repo.adicionar("Maçã");

        // Testando com Aluno

        Aluno a1 = new Aluno("2021001", "Maria");
        Aluno a2 = new Aluno("2021002", "João");

        repoAluno.adicionar(a1);
        repoAluno.adicionar(a2);

        System.out.println("Busca por João:");
        Aluno resultado = repoAluno.buscar("João");
        System.out.println(resultado);

        System.out.println("\nListando todos:");
        repo.listar();
    }
}
