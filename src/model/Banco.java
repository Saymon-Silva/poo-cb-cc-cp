package model;

import model.Conta;
import java.util.ArrayList;

public class Banco {

    private Conta conta;
    private String nome;
    private String endereco;
    private int agencia;
    private double juros;
    private double taxaServico;
    private ArrayList<Conta> contas = new ArrayList<>();

    public Banco(String nome,int agencia, double juros, double taxaServico,  String endereco){
        this.endereco = endereco;
        this.agencia = agencia;
        this.nome = nome;
        this.juros = juros;
        this.taxaServico = taxaServico;
    }
    public static Conta cadastrarConta(Pessoa titular, int numero,String senha, double saldo) {
       return new Conta(titular,numero, senha, saldo);
    }

    //region(get/set)
    public String getEndereco() {
        return endereco;
    }
    public ArrayList<Conta> getContas() {
        return contas;
    }
    public double getJuros() {
        return juros;
    }
    public double getTaxaServico() {
        return taxaServico;
    }
    public int getAgencia() {
        return agencia;
    }
    public String getNome() {
        return nome;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }
    public void setJuros(double juros) {
        this.juros = juros;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTaxaServico(double taxaServico) {
        this.taxaServico = taxaServico;
    }
    //endregion


    @Override
    public String toString() {
        return "Banco{" +
                "Nome : " + nome +
                "; Agencia : " + agencia +
                "; Juros : " + juros +
                "; Taxa de Serviço : " + taxaServico +
                "; Endereço : " + endereco;
    }
}
