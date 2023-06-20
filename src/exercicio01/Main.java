package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Renault renault = new Renault("Clio",2016,32000,"prata",2);
        Fiat fiat = new Fiat("Uno",2010,18000,"branco",4);
        Hyundai hyundai = new Hyundai("hb20",2020,48000,"preto",4);

        System.out.println("---------- TESTE DRIVE RENAULT ----------");
        renault.darPartida();
        do {
            switch(menu()){
                case 1:
                    renault.acelerar();
                    break;
                case 2:
                    renault.frear();
                    break;
                case 3:
                    renault.desligar();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while(!renault.isDesligado());

        System.out.println("\n---------- TESTE DRIVE FIAT ----------");
        fiat.darPartida();
        do {
            switch(menu()){
                case 1:
                    fiat.acelerar();
                    break;
                case 2:
                    fiat.frear();
                    break;
                case 3:
                    fiat.desligar();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while(!fiat.isDesligado());

        System.out.println("\n---------- TESTE DRIVE HYUNDAI ----------");
        hyundai.darPartida();
        do {
            switch(menu()){
                case 1:
                    hyundai.acelerar();
                    break;
                case 2:
                    hyundai.frear();
                    break;
                case 3:
                    hyundai.desligar();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while(!hyundai.isDesligado());

    }

    public static int menu(){
        System.out.println("O que deseja fazer? [ 1 / 2 / 3 ]");
        System.out.println("1 - Acelerar");
        System.out.println("2 - Fear");
        System.out.println("3 - Desligar");
        return new Scanner(System.in).nextInt();
    }

}