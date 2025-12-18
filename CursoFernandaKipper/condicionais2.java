package CursoFernandaKipper;

public class condicionais2 {
    public static void main(String[] args) {
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L;
        float  f = 10.5f;
        double d = 20.5;
        char c = 'a';
        boolean bool = true;
        String str = " João ";

        if (b > 99) {
            System.out.println("Verdadeiro");
        } else if (str == " João ")
            System.out.println("Verdadeiro"); 
        else {
            System.out.println("False");
        }

    }
}
