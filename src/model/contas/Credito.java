package model.contas;
import model.Conta;
import model.Pessoa;

public class Credito extends Conta {

    private int diaFatura;
    private double limite;

    public Credito(Pessoa titular, int numero,String senha, int saldo, double limite, int diaFatura) {
        super(titular, numero, senha, saldo, limite);
        this.limite = limite;
        this.diaFatura = diaFatura;
    }
}
