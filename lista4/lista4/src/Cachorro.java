public class Cachorro extends AnimalTerrestreAB{


    public Cachorro(String nome, double peso, String tipo, int idade, String habitat, double altura, int qntdPatas) {
        super(nome, peso, tipo, idade, habitat, altura, 4);
    }

    public void comer(int qntdComida){
        setQntdComida(getQntdComida()+qntdComida);
        System.out.println("O Cachorro "+getNome()+" comeu "+qntdComida+" gramas de comida");
    }

    public void moverse(double qntdCaminho){
        setQntdCaminho(getQntdCaminho() + qntdCaminho);
        System.out.println("O Cachorro "+getNome()+" andou "+qntdCaminho+" metros");
    }

    public void dormir(int qntdHorasDormidas){
        setQntdHorasDormidas(getQntdHorasDormidas() + qntdHorasDormidas);
        System.out.println("O Cachorro "+getNome()+" dormiu "+qntdHorasDormidas+" horas");
    }
}
