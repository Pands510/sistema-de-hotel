public abstract class Pessoa {
    private String nome;
    private final String cpf;
    
    public Pessoa(String nome, String cpf) {
        this.nome = nome;

        if(!validarCpf(cpf)){
            throw new IllegalArgumentException("formato invalido");
        }
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("formato invalido");
        }
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }

    public boolean validarCpf(String cpf){
        if(cpf == null || cpf.isBlank()){
            return false;
        }
        return cpf.matches("\\d{11}");
    }

    @Override
    public String toString() {
        return "Pessoa" +
        "\nnnome: " + nome +
        "\ncpf: " + cpf;
    }
}
