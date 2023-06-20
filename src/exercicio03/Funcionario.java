package exercicio03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Funcionario {
    private String nome;
    private Date dataAdmissao;
    private double salario;
    private static int identificador=0;
    public Funcionario() {
        ++identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataAdmissao() {
        if (dataAdmissao!=null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            return dateFormat.format(dataAdmissao);
        } else {
            return "00/00/0000";
        }
    }

    public void setDataAdmissao(Date dataAdmissao){
        Date dataAtual = new Date();
        if (dataAdmissao.after(dataAtual)) {
            System.out.println("A data de admissão não pode ser uma data futura.");
        } else {
            this.dataAdmissao = dataAdmissao;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 700){
            System.out.println("Valor inválido. O Salário deve ser de pelo menos R$ 700,00");
        } else {
            this.salario = salario;
        }
    }

    public int getIdentificador() {
        return identificador;
    }
}
