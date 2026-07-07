import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reserva {
    private final Hospede hospede;
    private final Quarto quarto;
    private final LocalDateTime dataReserva;
    private LocalDateTime dataLiberacao;

    public Reserva(Hospede hospede, Quarto quarto, LocalDateTime dataReserva, LocalDateTime dataLiberacao) {
        this.hospede = hospede;
        this.quarto = quarto;
        this.dataReserva = LocalDateTime.now();
        this.dataLiberacao = LocalDateTime.now();
    }

    public Hospede getHospede() {
        return hospede;
    }
    public Quarto getQuarto() {
        return quarto;
    }
    public LocalDateTime getDataReserva() {
        return dataReserva;
    }
    public LocalDateTime getDataLiberacao(){
        return dataLiberacao;
    }
    
    public void registrarLiberacao(){
        this.dataLiberacao = LocalDateTime.now();
    }

    public boolean foiLiberado(){
        if(dataLiberacao != null){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Reserva" +
        "\nhospede: " + hospede +
        "\nquarto: " + quarto + 
        "\ndataReserva: " + dataReserva +
        "\ndataLiberacao: " + dataLiberacao;
    }
}
