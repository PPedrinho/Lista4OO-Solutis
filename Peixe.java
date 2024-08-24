public class Peixe extends AnimalMarinhoAB{

    public Peixe(String nome, double peso, String tipo, int idade, String habitat, double altura) {
        super(nome, peso, tipo, idade, habitat, altura);
    }

    @Override
    public void comer(int qntdComida){
        setQntdComida(getQntdComida()+qntdComida);
        System.out.println("O Peixe "+getNome()+" comeu "+qntdComida+" gramas de comida");
    }

    @Override
    public void nadar(double qntdCaminho){
        setQntdCaminho(getQntdCaminho() + qntdCaminho);
        System.out.println("O Peixe "+getNome()+" nadou "+qntdCaminho+" metros");
    }

    @Override
    public void dormir(int qntdHorasDormidas){
        setQntdHorasDormidas(getQntdHorasDormidas() + qntdHorasDormidas);
        System.out.println("O Peixe "+getNome()+" dormiu "+qntdHorasDormidas+" horas");
    }
}
