import java.util.Scanner;

public class ManipulacaoDeDados3 {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do Aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do Aluno: ");
        float nota = teclado.nextFloat();

        System.out.println("A nota de " + nome + " é " + nota);
    }
}
