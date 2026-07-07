public class Hospede extends Pessoa implements Pesquisavel{

    public Hospede(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public boolean pesquisar(String texto) {
        if(texto == null || texto.isBlank()){
            throw new IllegalArgumentException("formato invalido");
        }
        if(getNome().toLowerCase().contains(texto) || getCpf().contains(texto)){
            return true;
        } return false;
    }
}
