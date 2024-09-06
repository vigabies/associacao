
public class Associados extends Pessoas {

    private String situacao;
    private int numero;

    //construtor
    public Associados(String CEP, String CNPJ, String CPF, String ID, String UF, String bairro, String cidade, String logradouro, String nome, String número, String telefone, int numero, String situacao) {
        super(CEP, CNPJ, CPF, ID, UF, bairro, cidade, logradouro, nome, número, telefone);
        this.numero = numero;
        this.situacao = situacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
