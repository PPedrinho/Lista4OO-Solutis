public class Pombo extends AnimalVoadorAB{

    public Pombo(String nome, double peso, String tipo, int idade, String habitat, double altura, int qntdAsas, double envergaduraAsa) {
        super(nome, peso, tipo, idade, habitat, altura, qntdAsas, envergaduraAsa);
    }

    @Override
    public void comer(int qntdComida){
        setQntdComida(getQntdComida()+qntdComida);
        System.out.println("O Pombo "+getNome()+" comeu "+qntdComida+" gramas de comida");
    }

    @Override
    public void moverse(double qntdCaminho){
        setQntdCaminho(getQntdCaminho() + qntdCaminho);
        System.out.println("O Pombo "+getNome()+" voou "+qntdCaminho+" metros");
    }

    @Override
    public void dormir(int qntdHorasDormidas){
        setQntdHorasDormidas(getQntdHorasDormidas() + qntdHorasDormidas);
        System.out.println("O Pombo "+getNome()+" dormiu "+qntdHorasDormidas+" horas");
    }
}
