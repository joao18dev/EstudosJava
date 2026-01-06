package CursoFernandaKipper;

public class POO {
    public static void main(String[] args){
        Carro meuCarro = new Carro(  "Palio");
        Carro meuCarro2 = new Carro(  "Porsche");
        Carro meuCarro3 = new Carro( "BMW");

        meuCarro2.acelerar();
    }
}

class Carro {

    String modelo;

    public Carro(String modelo){
        this.modelo = modelo;
    }

    public void acelerar(){
        System.out.println("Acelerando o meu " + modelo);
    }
}
