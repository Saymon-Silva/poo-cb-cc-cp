import model.Conta;
import java.util.ArrayList;

public class Banco {

    private String nome;
    private String endereco;
    private int agencia;
    private double juros;
    private double taxaServico;
    private ArrayList<Conta> contas = new ArrayList<>();

    public Banco(int agencia, String nome, String endereco, double juros, double taxaServico){
        this.endereco = endereco;
        this.agencia = agencia;
        this.nome = nome;
        this.juros = juros;
        this.taxaServico = taxaServico;
    }
//    public Conta cadastrarConta(){
        //logica
        //return new Conta(nome,agencia);
//    }
}
