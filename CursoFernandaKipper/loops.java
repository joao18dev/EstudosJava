package CursoFernandaKipper;

import java.util.ArrayList;

public class loops {
    public static void main(String[] args) {
        byte b = 100;
        short s = 10000;
        /* int i = 100000; */
        long l = 100000L;
        float  f = 10.5f;
        double d = 20.5;
        char c = 'a';
        boolean bool = true;
        String str = " João ";

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Allana");
        nomes.add("Augusto");    

        for(int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        int contador = 0;
        while(contador < 5  ){
            System.out.println("Estou no while");
            contador++;
        }

    }
}