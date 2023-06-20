package exercicio03;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) throws ParseException {
        DateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,###.00");

        //Funcionário 1
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Antonio");
        funcionario1.setSalario(2000);
        funcionario1.setDataAdmissao(dataFormat.parse("15/07/2020"));

        System.out.printf("Nome: %s\nSalário: R$ %s\nData de admissão: %s\nIdentificador: %d\n\n", funcionario1.getNome(),df.format(funcionario1.getSalario()),funcionario1.getDataAdmissao(),funcionario1.getIdentificador());

        //Funcionário 2
        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Roberta");
        funcionario2.setSalario(3500);
        funcionario2.setDataAdmissao(dataFormat.parse("12/04/2018"));

        System.out.printf("Nome: %s\nSalário: R$ %s\nData de admissão: %s\nIdentificador: %d\n\n", funcionario2.getNome(),df.format(funcionario2.getSalario()),funcionario2.getDataAdmissao(),funcionario2.getIdentificador());

        //Funcionário 3
        Funcionario funcionario3 = new Funcionario();
        funcionario3.setNome("Ariel");
        funcionario3.setSalario(2900);
        funcionario3.setDataAdmissao(dataFormat.parse("19/12/2022"));

        System.out.printf("Nome: %s\nSalário: R$ %s\nData de admissão: %s\nIdentificador: %d\n\n", funcionario3.getNome(),df.format(funcionario3.getSalario()),funcionario3.getDataAdmissao(),funcionario3.getIdentificador());
    }

}
