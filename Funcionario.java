public class Funcionario extends Pessoa implements Pesquisavel {
    private String email;
    private final String id;

    public Funcionario(String nome, String cpf, String email, String id) {
        super(nome, cpf);
        this.email = email;
        if(!validarId(id)){
            throw new IllegalArgumentException("formato invalido");
        }
        this.id = id;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if(email == null || email.isBlank()){
            throw new IllegalArgumentException("formato invalido");
        }
        this.email = email;
    }
    public String getId() {
        return id;
    }
    public boolean validarId(String id) {
        if(id == null || id.isBlank()){
            return false;
        }
        return id.matches("\\d{8}");
    }


    @Override
    public boolean pesquisar(String texto) {
        if(texto == null || texto.isBlank()){
            throw new IllegalArgumentException("formato invalido");
        }
        if(getNome().toLowerCase().contains(texto) || getCpf().contains(texto) || getEmail().toLowerCase().contains(texto) || getId().toLowerCase().contains(texto)){
            return true;
        }
        return false;
    }
}
