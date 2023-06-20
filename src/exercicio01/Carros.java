package exercicio01;

abstract class Carros {
    private String marca;
    private int ano;
    private double valor;
    private String cor;
    private int portas;
    private int velocidade;
    private boolean desligado;

    public Carros(String marca, int ano, double valor, String cor, int portas) {
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
        this.cor = cor;
        this.portas = portas;
        this.velocidade = 0;
        this.desligado = true;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isDesligado() {
        return desligado;
    }

    public void setDesligado(boolean desligado) {
        this.desligado = desligado;
    }

    abstract void darPartida();
    abstract void acelerar();
    abstract void frear();

    void desligar(){
        while(getVelocidade()>0){
            frear();
        }
        System.out.println("Carro desligado.");
        desligado = true;
    }
}
