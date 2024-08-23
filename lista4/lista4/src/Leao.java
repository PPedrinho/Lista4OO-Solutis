public class Leao extends AnimalTerrestreAB {

    public Leao(String nome, double peso, String tipo, int idade, String habitat, double altura, int qntdPatas) {
        super(nome, peso, tipo, idade, habitat, altura, 4);
    }

    public void comer(int qntdComida){
        setQntdComida(getQntdComida()+qntdComida);
        System.out.println("O Leão "+getNome()+" comeu "+qntdComida+" gramas de comida");
    }

    public void moverse(double qntdCaminho){
        setQntdCaminho(getQntdCaminho() + qntdCaminho);
        System.out.println("O Leão "+getNome()+" andou "+qntdCaminho+" metros");
    }

    public void dormir(int qntdHorasDormidas){
        setQntdHorasDormidas(getQntdHorasDormidas() + qntdHorasDormidas);
        System.out.println("O Leão "+getNome()+" dormiu "+qntdHorasDormidas+" horas");
    }
}
