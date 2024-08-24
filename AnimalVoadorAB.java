public class AnimalVoadorAB extends AnimalAB {
    private int qntdAsas;
    private double envergaduraAsa;

    public AnimalVoadorAB(String nome, double peso, String tipo, int idade, String habitat, double altura, int qntdAsas, double envergaduraAsa){
        super(nome, peso, tipo, idade, habitat, altura);
        this.qntdAsas = qntdAsas;
        this.envergaduraAsa = envergaduraAsa;
    }

    public int getQntdAsas() {
        return qntdAsas;
    }

    public void setQntdAsas(int qntdAsas) {
        this.qntdAsas = qntdAsas;
    }

    public double getEnvergaduraAsa() {
        return envergaduraAsa;
    }

    public void setEnvergaduraAsa(double envergaduraAsa) {
        this.envergaduraAsa = envergaduraAsa;
    }

    //metodo especifico de animal voador
    public void voar(double qntdCaminho){

    }
}
