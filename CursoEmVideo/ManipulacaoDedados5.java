import java.util.Scanner;

public class ManipulacaoDedados5 {
    public static void main(String[] args){
        System.out.println("Quer contar até quanto ?");
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        int valor = teclado.nextInt();

        int contador = 0;

        while (contador <= valor){
            System.out.println(contador);
            contador = contador +1;
        }

        System.out.println("Fim da contagem");
    }
}
