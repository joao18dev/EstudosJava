package CursoFernandaKipper;

import java.util.ArrayList;

public class arraylist {
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

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Allana");
        nomes.add("Augusto");    

        System.out.println(nomes.get(0));
        nomes.remove(0);
        System.out.println(nomes.get(0));
        nomes.remove("Allana");
        System.out.println(nomes.get(0));
    }
} 