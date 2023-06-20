package exercicio01;

public class Fiat extends Carros{
    public Fiat(String marca, int ano, double valor, String cor, int portas) {
        super(marca, ano, valor, cor, portas);
    }

    @Override
    void darPartida() {
        setDesligado(false);
        if (getVelocidade()>0){
            System.out.println("Não foi possível dar partida, o carro já está em movimento.");
        } else {
            setVelocidade(3);
            System.out.println("Iniciando motor... Minha velocidade está em 3 km/h.");
        }
    }

    @Override
    void acelerar() {
        setVelocidade(getVelocidade()+12);
        System.out.printf("Acelerando... Minha velocidade está em %d km/h.\n", getVelocidade());
    }

    @Override
    void frear() {
        if (getVelocidade()>6){
            setVelocidade(getVelocidade()-6);
            System.out.printf("Freando... Minha velocidade está em %d km/h.\n", getVelocidade());
        } else if (getVelocidade()>0) {
            setVelocidade(0);
            System.out.println("Freando... Minha velocidade está em 0 km/h.");

        } else {
            System.out.println("Já estou parado.");
        }
    }
}
