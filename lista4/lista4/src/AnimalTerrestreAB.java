public class AnimalTerrestreAB extends AnimalAB {
    private int qntdPatas;

    public int getQntdPatas() {
        return qntdPatas;
    }

    public void setQntdPatas(int qntdPatas) {
        this.qntdPatas = qntdPatas;
    }

    public AnimalTerrestreAB(String nome, double peso, String tipo, int idade, String habitat, double altura, int qntdPatas) {  
        super(nome, peso, tipo, idade, habitat, altura);
        this.qntdPatas = qntdPatas;
    }
    
}
