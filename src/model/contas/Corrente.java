package model.contas;
import model.Conta;
import model.Pessoa;

public class Corrente extends Conta {

    private Pessoa pessoa;
    private double limite;

    public Corrente(Pessoa titular,String senha, int numero, double saldo, double limite) {
        super(titular, numero, senha, saldo);
        this.limite = limite;
    }

    private double saque(){
        double valorSerSacado = 0;
        //logica aqui
        return valorSerSacado;
    }
    public void transferencia(){
        //logica
    }

    @Override
    public String toString() {
        return "Corrente : " +
                " Titular : " + pessoa +
                "; Senha : " + this.getSenha() +
                "; Numero : " + this.getNumero() +
                "; Saldo : " + this.getSaldo() +
                "; Limite : " + limite;
    }
}
