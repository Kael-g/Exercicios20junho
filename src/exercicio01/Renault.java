package exercicio01;

public class Renault extends Carros{

    public Renault(String marca, int ano, double valor, String cor, int portas) {
        super(marca, ano, valor, cor, portas);
    }

    @Override
    void darPartida() {
        setDesligado(false);
        if (getVelocidade()>0){
            System.out.println("Não foi possível dar partida, o carro já está em movimento.");
        } else {
            System.out.println("Iniciando motor... Minha velocidade está em 0 km/h.");
        }
    }

    @Override
    void acelerar() {
        setVelocidade(getVelocidade()+10);
        System.out.printf("Acelerando... Minha velocidade está em %d km/h.\n", getVelocidade());
    }

    @Override
    void frear() {
        if (getVelocidade()>0){
            setVelocidade(getVelocidade()-5);
            System.out.printf("Freando... Minha velocidade está em %d km/h.\n", getVelocidade());
        } else {
            System.out.println("Já estou parado.");
        }
    }
}
