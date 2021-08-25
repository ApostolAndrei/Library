import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {

	Biblioteca biblioteca = Biblioteca.getBibliotecaPopulata();

		biblioteca.catalogPublicatii();
		biblioteca.catalogMedia();

    }
}
