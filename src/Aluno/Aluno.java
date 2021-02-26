package Aluno;
import java.util.ArrayList;
import java.util.Scanner;
public class Aluno {
    private  double peso;
    private   String nome;
    private  Integer idade;
    private  String cpf;
    private  double altura;
    private  String pacote;
    private boolean status;
    public Aluno(String nome, String cpf, boolean status, int idade, double peso, double altura, String pacote){
            this.nome = nome;
            this.idade = idade;
            this.peso = peso;
            this.altura = altura;
            this.cpf = cpf;
            this.pacote = pacote;
        }
    public String getNome () {
            return nome;
        }

        public void setNome (String nome){
            this.nome = nome;
        }

        public int getIdade () {
            return idade;
        }

        public void setIdade ( int idade){
            this.idade = idade;
        }

        public String getCpf () {
            return cpf;
        }

        public void setCpf (String cpf){
            this.cpf = cpf;
        }

        public double getPeso () {
            return peso;
        }

        public void setPeso ( double peso){
            this.peso = peso;
        }

        public double getAltura () {
            return altura;
        }

        public void setAltura ( double altura){
            this.altura = altura;
        }

        public String getPacote () {
            return pacote;
        }

        public void setPacote (String pacote){
            this.pacote = pacote;
        }
        public String toString() {
            return
                    "NOME DO ALUNO: " + nome + "\n" +
                            "IDADE DO ALUNO: " + idade + "\n" +
                            "CPF: " + cpf + "\n" +
                            "PESO: " + peso + "\n" +
                            "STATUS: " + status + "\n" +
                            "ALTURA: " + altura + "\n" +
                            "PACOTE: " + pacote + "\n" +
                    "\n";
        }
        static void cadastro(ArrayList<Aluno> alunos) {
            Scanner scanner = new Scanner(System.in);
            Pacotes pacote1 = new Pacotes();
            System.out.println("================");
            System.out.println("Cadastro de Alunos(a)");
            System.out.print("Nome do Aluno: ");
            String nome = scanner.nextLine();
            System.out.print("CPF do Aluno: ");
            String cpf = scanner.next();
            System.out.print("Idade do Aluno: ");
            int idade = scanner.nextInt();
            System.out.print("Peso do Aluno: ");
            double peso = scanner.nextDouble();
            System.out.print("Altura do Aluno: ");
            double altura = scanner.nextDouble();
            System.out.print("Status do Aluno: true para Ativo, false para Inativo: ");
            boolean status = scanner.nextBoolean();
            System.out.println("Digite o Pano do Aluno");
            System.out.println("1 - Smart");
            System.out.println("2 - Black");
            int v1 = scanner.nextInt();
            while (v1 < 1 || !(v1 <= 2)) {
                System.out.println("Digite um Valor Válido");
                System.out.println("1 - Smart");
                System.out.println("2 - Black");
                if(v1 == 1);
                    status = true;
                if (v1 == 2){
                    status = false;
                } else {
                    System.out.println("Digite um Valor válido");
                }
            }
            Aluno aluno = new Aluno(nome, cpf,status, idade, peso, altura, pacote1.getBlack());
            alunos.add(aluno);
            scanner.close();
           System.out.println("Fim");
           System.out.println(alunos);
    }
}