package model.contas;
import model.Conta;
import model.Pessoa;

public class Corrente extends Conta {

    public Corrente(Pessoa titular,String senha, int numero, int saldo, double limite) {
        super(titular, numero, senha, saldo, limite);
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
