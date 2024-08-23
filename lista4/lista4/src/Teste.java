public class Teste {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Cachorro", 5.0, "Mamifero", 5, "casa", 0.5, 4);
        Gato miau = new Gato("Miau", 5.0, "Mamifero", 5, "casa", 0.5, 4);
        cachorro.comer(10);
        miau.comer(10);
        
        //cachorro.moverse(5.0);
    }
}
