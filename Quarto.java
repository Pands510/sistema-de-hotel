public class Quarto implements Pesquisavel{
    private int num;
    private boolean disponibilidade;

    public Quarto(int num){
        this.num = num;
        this.disponibilidade = true;
    }

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public void alugar(){
        if(!disponibilidade){
            throw new IllegalArgumentException("ja alugado");
        }
        disponibilidade = false;
    }

    public void liberar(){
        if(disponibilidade){
            throw new IllegalArgumentException("nao alugado");
        }
        disponibilidade = false;
    }

    @Override
    public boolean pesquisar(String texto) {
        if(texto == null || texto.isBlank()){
            throw new IllegalArgumentException("formato invalido");
        }
        if(Integer.toString(num).contains(texto)){
            return true;
        } return false;
    }
}
