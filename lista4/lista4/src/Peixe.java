public class Peixe extends AnimalMarinhoAB{

    public Peixe(String nome, double peso, String tipo, int idade, String habitat, double altura) {
        super(nome, peso, tipo, idade, habitat, altura);
    }

    public void comer(int qntdComida){
        setQntdComida(getQntdComida()+qntdComida);
        System.out.println("O Peixe "+getNome()+" comeu "+qntdComida+" gramas de comida");
    }

    public void moverse(double qntdCaminho){
        setQntdCaminho(getQntdCaminho() + qntdCaminho);
        System.out.println("O Peixe "+getNome()+" nadou "+qntdCaminho+" metros");
    }

    public void dormir(int qntdHorasDormidas){
        setQntdHorasDormidas(getQntdHorasDormidas() + qntdHorasDormidas);
        System.out.println("O Peixe "+getNome()+" dormiu "+qntdHorasDormidas+" horas");
    }
}
