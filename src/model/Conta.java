package model;
public class Conta {

    private Pessoa titular;
    private Banco banco;
    private String senha;
    private int numero;
    private double saldo;
    private int qtddTransacoes;

    //region(get/set)
    public int getNumero() {
        return numero;
    }
    public String getSenha() {
        return senha;
    }
    public double getSaldo() {
        return saldo;
    }
    public int getQtddTransacoes() {
        return qtddTransacoes;
    }
    //endregion
    public Conta(Pessoa titular, int numero,String senha, double saldo){
        this.titular = titular;
        this.numero = numero;
        this.senha = senha;
        this.banco.getContas().add(this);
    }

    public void pagamento(){
        //provavelmenye um double futuramente, usado pra extrair esse valor do saldo;
    }
    public void credito(){
        //não sei para qual intuito da criação deste metodo.
    }
    public double saldo(){
        return this.getSaldo();
    }
}
