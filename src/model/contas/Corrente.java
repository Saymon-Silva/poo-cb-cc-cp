package model.contas;
import model.Conta;

public class Corrente extends Conta {

    public Corrente(String titular, int numero, int saldo, double limite) {
        super(titular, numero, saldo, limite);
    }

    private double saque(){
        double valorSerSacado = 0;
        //logica aqui
        return valorSerSacado;
    }
    public void transferencia(){
        //logica
    }
}
