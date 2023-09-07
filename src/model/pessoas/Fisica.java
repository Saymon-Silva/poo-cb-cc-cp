package model.pessoas;
import model.Pessoa;

public class Fisica extends Pessoa {
    private long cpf;
    private String nomeCompleto;//"nome", podia ser nome.


    public Fisica(String endereco, String nomeCompleto, long cpf) {
        super(endereco);
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
    }

    //region(get/set)
    public long getCpf() {
        return cpf;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    //endregion
    public String toString() {
        return "Fisica : " +
                "CPF : " + cpf +
                "; Nome : " + nomeCompleto +
                ", Endereço : " + this.getEndereco();
    }
}
