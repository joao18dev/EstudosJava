import java.util.Scanner;

public class EstruturasDeRepeticao3 {
    public static void main(String[] args0) {

        int N;
        int S = 0;
        char resp = 's';

        System.out.println("Sistema para soma de valores digitados!");

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Digite o  valor: ");
            N = teclado.nextInt();

            System.out.println("Você quer continuar ? [S/N]");
            resp = teclado.next().charAt(0);

            S = S + N;

        } while (resp != 'n');

        System.out.println("A soma de todos os números é igual a: " + S);
    }
}