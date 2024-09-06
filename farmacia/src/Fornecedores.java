public class Fornecedores extends Pessoas {
    private String nomefantasia;
    private String website;

    public Fornecedores(String CEP, String CNPJ, String CPF, String ID, String UF, String bairro, String cidade, String logradouro, String nome, String número, String telefone, String nomefantasia, String website) {
        super(CEP, CNPJ, CPF, ID, UF, bairro, cidade, logradouro, nome, número, telefone);
        //Quando você usa super() no construtor de uma classe-filha, está chamando o construtor da classe-mãe para garantir que os atributos da superclasse sejam corretamente inicializados.
        this.nomefantasia = nomefantasia;
        this.website = website;
    }

    public String getNomefantasia() {
        return nomefantasia;
    }
    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }
    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }

    
}
