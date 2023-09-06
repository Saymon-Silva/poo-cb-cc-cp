package model;

import model.pessoas.Fisica;
import model.pessoas.Juridica;

import java.util.ArrayList;

public abstract class Pessoa {

    private String endereco;
    private static ArrayList<Pessoa> listaPessoas = new ArrayList<>();

    public Pessoa(String endereco){
        this.endereco = endereco;
        listaPessoas.add(this);
    }

    //region(get/set)
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public static ArrayList<Pessoa> getListaPessoas() {
        return listaPessoas;
    }
    public static void setListaPessoas(ArrayList<Pessoa> listaPessoas) {
        listaPessoas = listaPessoas;
    }
    //endregion

    public Pessoa saberPessoaReal(long valorCC){//valorCC = valorCnpj/valorCpf
        for (Pessoa pessoa: listaPessoas) {
            if (pessoa instanceof Fisica){
                if(((Fisica)pessoa).getCpf() == valorCC){
                    return pessoa;
                }
            }
            else if(pessoa instanceof Juridica){
                if(((Juridica)pessoa).getCnpj() == valorCC){
                    return pessoa;
                }
            }
        }
        return null;
    }
}
