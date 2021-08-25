import java.time.LocalDate;

public interface Imprumutabil {

    void imprumuta(LocalDate dataImptrumut) throws Exception;
    void returneaza(LocalDate dataRetur) throws Exception;
    double calculPenalizare(LocalDate dataRetur);
}
