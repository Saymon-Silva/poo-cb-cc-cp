package model.contas;
import model.Conta;
import model.Pessoa;

public class Poupanca extends Conta {

    private Pessoa pessoa;

    public Poupanca(Pessoa titular,String senha, int numero, double saldo) {
        super(titular, numero, senha, saldo);
    }

    public double saque(){
        double valorSerSacado = 0;
        //logica aqui
        return valorSerSacado;
    }

    public String toString() {
        return "Poupança : " +
                " Titular : " + pessoa +
                "; Senha : " + this.getSenha() +
                "; Numero : " + this.getNumero() +
                "; Saldo : " + this.getSaldo();
    }
}
