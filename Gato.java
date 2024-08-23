public class Gato extends AnimalTerrestreAB {

    public Gato(String nome, double peso, String tipo, int idade, String habitat, double altura, int qntdPatas) {
        super(nome, peso, tipo, idade, habitat, altura, 4);
    }

    @Override
    public void comer(int qntdComida){
        setQntdComida(getQntdComida()+qntdComida);
        System.out.println("O Gato "+getNome()+" comeu "+qntdComida+" gramas de comida");
    }

    @Override
    public void moverse(double qntdCaminho){
        setQntdCaminho(getQntdCaminho() + qntdCaminho);
        System.out.println("O Gato "+getNome()+" andou "+qntdCaminho+" metros");
    }

    @Override
    public void dormir(int qntdHorasDormidas){
        setQntdHorasDormidas(getQntdHorasDormidas() + qntdHorasDormidas);
        System.out.println("O Gato "+getNome()+" dormiu "+qntdHorasDormidas+" horas");
    }
}

