import java.util.Scanner;

public class ManipulacaoDeDados4 {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();

        System.out.print("A nota do aluno " + nome + " é " + nota);

        if (nota >= 7) {
            System.out.print("! O aluno " + nome + " está aprovado! ");
        } else {
            System.out.print("! O aluno " + nome + " está reprovado!");
        }

    }
}
