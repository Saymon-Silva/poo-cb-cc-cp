package model;
public abstract class Conta {

    private Pessoa titular;
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

    public Conta(String titular, int numero,int saldo, double limite){

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
