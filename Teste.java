public class Teste {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 10, "mamifero", 5, "terrestre", 0.5, 4);
        cachorro.comer(100);
        cachorro.dormir(3);
        cachorro.moverse(5.2);

        Peixe peixe = new Peixe("Nemo", 0.1, "peixe", 2, "aquatico", 0.3);
        peixe.comer(2);
        peixe.dormir(2);
        peixe.moverse(1.2);

        Pombo pombo = new Pombo("João", 2, "ave", 3, "terrestre", 0.4, 2, 0.1);
        pombo.comer(5);
        pombo.dormir(2);
        pombo.moverse(1.5);
    }
}   
