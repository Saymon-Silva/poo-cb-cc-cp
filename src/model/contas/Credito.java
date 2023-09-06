package model.contas;
import model.Conta;

public class Credito extends Conta {

    private int diaFatura;
    private double limite;

    public Credito(String titular, int numero, int saldo, double limite) {
        super(titular, numero, saldo, limite);
    }
}
