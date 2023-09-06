package model;

import model.pessoas.Fisica;
import model.pessoas.Juridica;

import java.util.ArrayList;

public abstract class Pessoa {

    private String endereco;
    private ArrayList<Pessoa> listaPessoas = new ArrayList<>();

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
    public ArrayList<Pessoa> getListaPessoas() {
        return listaPessoas;
    }
    public void setListaPessoas(ArrayList<Pessoa> listaPessoas) {
        this.listaPessoas = listaPessoas;
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
