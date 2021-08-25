import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {

	Biblioteca biblioteca = Biblioteca.getBibliotecaPopulata();

		biblioteca.catalogPublicatii();
		biblioteca.catalogMedia();



//		biblioteca.consultaMedia(12);
//		biblioteca.elibereazaMedia(13);
//		biblioteca.imprumutaPublicatie(16, LocalDate.of(2017, 12, 20));
//		biblioteca.returneazaPublicatie(3, LocalDate.of(2018, 1, 25));
//		biblioteca.consultarePublicatieDupaCategorie("Fictiune");
//		biblioteca.publicatieDupaAutor("Anna Gavalda");
//		biblioteca.publicatiiImprumutate();
//		biblioteca.imprumutaPublicatie(3, LocalDate.of(2017, 12, 20));
//		biblioteca.publicatiiImprumutate();
//		biblioteca.returneazaPublicatie(4, LocalDate.of(2018, 1, 3));
//    	LocalDate data = LocalDate.of(2017, 11, 1);
//		biblioteca.imprumutaPublicatie(1, data);
//		biblioteca.imprumutaPublicatie(2, data);
//		biblioteca.imprumutaPublicatie(3, data);
//		biblioteca.imprumutaPublicatie(4, data);
//		biblioteca.imprumutaPublicatie(5, data);
//		biblioteca.publicatiiDisponibile();
//
//		biblioteca.imprumutaPublicatie(1, LocalDate.of(2017, 12, 10));
//		biblioteca.returneazaPublicatie(1, LocalDate.of(2017, 1, 3));
//		biblioteca.imprumutaPublicatie(2, LocalDate.of(2018, 1, 1));
//		biblioteca.returneazaPublicatie(2, LocalDate.of(2018, 3, 1));
//
//
//      biblioteca.consultarePublicatieDupaCategorie(CategoriePublicatie.FICTIUNE);
//		biblioteca.imprumutaPublicatie(2, LocalDate.now());
//   	biblioteca.imprumutaPublicatie(2, LocalDate.now());

//  	biblioteca.publicatieDupaAutor("Neagu Djuvara");
//		biblioteca.imprumutaPublicatie(10, LocalDate.now());
//		biblioteca.returneazaPublicatie(11, LocalDate.now());
//
//		biblioteca.consultaMedia(14);
//		biblioteca.elibereazaMedia(15);
//		biblioteca.consultaMedia(16);
//		biblioteca.elibereazaMedia(23);



    }
}
