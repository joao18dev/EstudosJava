import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        System.out.println("Sistema de conversão de moeada");
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor em reais (R$) que deseja converter: ");
        Float valorReal = teclado.nextFloat();

        Float cotacaoDolar = 5.37f;
        Float convercao = valorReal / cotacaoDolar;

        System.out.println("O valor convertido é de:  " + convercao + " dólares! ");


    }
}
