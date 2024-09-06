public class Colaboradores extends Pessoas {
    private String cargo;
    private String funcao;

    public Colaboradores(String CEP, String CNPJ, String CPF, String ID, String UF, String bairro, String cidade, String logradouro, String nome, String número, String telefone, String cargo, String funcao) {
        super(CEP, CNPJ, CPF, ID, UF, bairro, cidade, logradouro, nome, número, telefone);
        this.cargo = cargo;
        this.funcao = funcao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    
}
