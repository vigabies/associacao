//classe mãe

public class Pessoas {

    private String ID;
    private String nome;
    private String logradouro;
    private String número;
    private String CEP;
    private String bairro;
    private String cidade;
    private String UF;
    private String telefone;
    private String CPF;
    private String CNPJ;

    public Pessoas(String CEP, String CNPJ, String CPF, String ID, String UF, String bairro, String cidade, String logradouro, String nome, String número, String telefone) {
        this.CEP = CEP;
        this.CNPJ = CNPJ;
        this.CPF = CPF;
        this.ID = ID;
        this.UF = UF;
        this.bairro = bairro;
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.nome = nome;
        this.número = número;
        this.telefone = telefone;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNúmero() {
        return número;
    }

    public void setNúmero(String número) {
        this.número = número;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String cEP) {
        CEP = cEP;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String uF) {
        UF = uF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }
}
