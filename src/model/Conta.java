package model;
public class Conta {

    private Pessoa titular;
    private Banco banco;
    private String senha;
    private int numero;
    private double saldo;
    private double limite;
    private int qtddTransacoes;

    //region(get/set)
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public double getLimite() {
        return limite;
    }
    public int getQtddTransacoes() {
        return qtddTransacoes;
    }
    //endregion
    public Conta(Pessoa titular, int numero,String senha, double saldo, double limite){
        this.titular = titular;
        this.numero = numero;
        this.senha = senha;
        this.saldo = saldo;
        this.limite = limite;
        this.banco.getContas().add(this);
    }

    public void pagamento(){
        //provavelmenye um double futuramente, usado pra extrair esse valor do saldo;
    }
    public void credito(){
        //não sei para qual intuito da criação deste metodo.
    }
    public void saldo(){
        //usado para mostrar o saldo presente na conta.
    }
}
