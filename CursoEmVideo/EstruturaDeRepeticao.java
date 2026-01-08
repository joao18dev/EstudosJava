import java.util.Scanner;

public class EstruturaDeRepeticao {
    public static void main(String[] args0){

        int cont = 1;
        int N;
        int S = 0;

        System.out.println("Sistema para soma de valores digitados!");

        Scanner teclado = new Scanner(System.in);

        while (cont <= 5){
            System.out.print("Digite o " + cont + " valor: ");
            N = teclado.nextInt();

            S = S + N;
            cont = cont + 1;
        }

        System.out.println("A soma de todos os números é igual a: " + S);







    }
}
