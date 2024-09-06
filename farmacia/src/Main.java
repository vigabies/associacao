public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Associados
        Associados associado = new Associados(
            "12345-678", "00.000.000/0001-00", "000.000.000-00", 
            "1", "SP", "Bairro X", "Cidade Y", "Rua Z", 
            "Joao", "10", "11999999999", 
            123, "Ativo"
        );
        
        // Exibindo informações do associado
        System.out.println("Associado: " + associado.getNome());
        System.out.println("Situação: " + associado.getSituacao());
        System.out.println("Número: " + associado.getNumero());
        
        // Criando um objeto da classe Colaboradores
        Colaboradores colaborador = new Colaboradores(
            "12345-678", "00.000.000/0001-00", "000.000.000-00", 
            "2", "SP", "Bairro X", "Cidade Y", "Rua Z", 
            "Maria", "20", "11888888888", 
            "Gerente", "Administrativo"
        );
        
        // Exibindo informações do colaborador
        System.out.println("\nColaborador: " + colaborador.getNome());
        System.out.println("Cargo: " + colaborador.getCargo());
        System.out.println("Função: " + colaborador.getFuncao());
        
        // Criando um objeto da classe Fornecedores
        Fornecedores fornecedor = new Fornecedores(
            "12345-678", "00.000.000/0001-00", "000.000.000-00", 
            "3", "SP", "Bairro X", "Cidade Y", "Rua Z", 
            "Empresa X", "30", "11777777777", 
            "Nome Fantasia", "www.empresa.com"
        );
        
        // Exibindo informações do fornecedor
        System.out.println("\nFornecedor: " + fornecedor.getNome());
        System.out.println("Nome Fantasia: " + fornecedor.getNomefantasia());
        System.out.println("Website: " + fornecedor.getWebsite());
    }
}
