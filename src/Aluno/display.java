package Aluno;
import java.util.ArrayList;
import java.util.Scanner;
public class display {
    public static void main(String[] args) {
        Pacotes pacotes = new Pacotes();
        String planoSmart = pacotes.getSmart();
        String planoBlack = pacotes.getBlack();
        ArrayList<Aluno> alunos = new ArrayList<>();
        Aluno Aluno1 = new Aluno("Adrian Américo Silva Albuquerque", "43455453453",true, 19, 80, 208, planoBlack);
        Aluno Aluno2 = new Aluno("Aline Diani Oliveira Batista", "455453435",false, 21, 55, 108, planoSmart);
        alunos.add(Aluno1);
        alunos.add(Aluno2);
        System.out.println("""
                   #############################################
                   Digite 1 para cadastrar um Aluno
                   Digite 2 para acessar os Alunos já cadastrado
                   #############################################
                """);
        Scanner scanner = new Scanner(System.in);
        int v1;
        v1 = scanner.nextInt();
        while (v1 > 2 || v1 <1){
            System.out.println("""
                   #############################################
                   Digite 1 para cadastrar um Aluno
                   Digite 2 para acessar os Alunos já cadastrado
                   #############################################
                """);
            v1 = scanner.nextInt();
        }
        if (v1 == 1){
            Aluno.cadastro(alunos);
        }
        if (v1 == 2){
            System.out.println(alunos);
        }
    }
}
