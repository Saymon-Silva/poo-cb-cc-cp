package model.contas;
import model.Conta;
import model.Pessoa;

public class Poupanca extends Conta {

    public Poupanca(Pessoa titular, int numero, String senha, int saldo, double limite) {
        super(titular, numero, senha, saldo, limite);
    }

    public double saque(){
        double valorSerSacado = 0;
        //logica aqui
        return valorSerSacado;
    }
}
