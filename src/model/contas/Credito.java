package model.contas;
import model.Conta;
import model.Pessoa;

public class Credito extends Conta {

    private Pessoa pessoa;
    private int diaFatura;
    private double limite;

    public Credito(Pessoa titular,String senha, int numero, double saldo, double limite, int diaFatura) {
        super(titular, numero, senha, saldo);
        this.limite = limite;
        this.diaFatura = diaFatura;
    }

    @Override
    public String toString() {
        return "Credito : " +
                " Titular : " + pessoa +
                "; Senha : " + this.getSenha() +
                "; Numero : " + this.getNumero() +
                "; Saldo : " + this.getSaldo() +
                "; Limite : " + limite +
                "; Dia da Fatura : " + diaFatura;
    }
}
