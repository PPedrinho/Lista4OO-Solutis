public class AnimalAB implements AnimalIF {
    private String nome;
    private String tipo;
    private int idade;
    private String habitat;
    private double altura;
    private double peso;
    private int qntdComida;
    private double qntdCaminho;
    private int qntdHorasDormidas;

    public AnimalAB(String nome, double peso, String tipo, int idade, String habitat, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.tipo = tipo;
        this.idade = idade;
        this.habitat = habitat;
        this.altura = altura;
        this.qntdComida = 0;
        this.qntdCaminho = 0;
        this.qntdHorasDormidas = 0;
    }

    //get e set

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getIdade() {
        return idade;
    }

    public String getHabitat() {
        return habitat;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public int getQntdComida() {
        return qntdComida;
    }

    public double getQntdCaminho() {
        return qntdCaminho;
    }

    public int getQntdHorasDormidas() {
        return qntdHorasDormidas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setQntdComida(int qntdComida) {
        this.qntdComida = qntdComida;
    }

    public void setQntdCaminho(double qntdCaminho) {
        this.qntdCaminho = qntdCaminho;
    }

    public void setQntdHorasDormidas(int qntdHorasDormidas) {
        this.qntdHorasDormidas = qntdHorasDormidas;
    }

    //metodos

    @Override
    public void comer(int qntdComida) {
        
    }

    @Override
    public void moverse(double qntdCaminho) {
        

    }

    @Override
    public void dormir(int qntdHorasDormidas) {
        

    }
}
