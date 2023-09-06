package model.contas;
import model.Conta;

public class Poupanca extends Conta {

    public Poupanca(String titular, int numero, int saldo, double limite) {
        super(titular, numero, saldo, limite);
    }

    public double saque(){
        double valorSerSacado = 0;
        //logica aqui
        return valorSerSacado;
    }
}
