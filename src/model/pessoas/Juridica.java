package model.pessoas;
import model.Pessoa;

public class Juridica extends Pessoa {

    private long cnpj;
    private String razaoSocial;//creio que solteiro/casado/viuvo

    public Juridica(String endereco, long cnpj, String razaoSocial) {
        super(endereco);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    //region(get/set)
    public long getCnpj() {
        return cnpj;
    }
    @Override
    public String getEndereco() {
        return super.getEndereco();
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    @Override
    public void setEndereco(String endereco) {
        super.setEndereco(endereco);
    }
    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    //endregion
    @Override
    public String toString() {
        return "Juridica : " +
                "CNPJ : " + cnpj +
                "; Razão Social : " + razaoSocial +
                ", Endereço : " + this.getEndereco();
    }
}
