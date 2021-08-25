import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    List < Media > media = new ArrayList < > ();
    List < Publicatie > publicatii = new ArrayList < > ();


    public void adaugaMedia(Media media) {
        this.media.add(media);
    }

    public void adaugaPublicatie(Publicatie publicatie) {
        this.publicatii.add(publicatie);
    }

    public void publicatiiDisponibile() {
        System.out.println("Publicatii disponibile: ");
        for (Publicatie p: publicatii) {
            if (p.isDisponibil())
                System.out.println(p.toString());
        }
    }

    public void publicatiiImprumutate() {
        System.out.println("Publicatii imprumutate: ");
        for (Publicatie p: publicatii) {
            if (!p.isDisponibil())
                System.out.println(p.toString());
        }
    }

    public void publicatieDupaAutor(String Autor) {
        System.out.println("Publicatii dupa autor");

        for (Publicatie p: publicatii) {
            if (p.getAutor().equals(Autor))
                System.out.println(p.toString());
        }
    }

    public void consultarePublicatieDupaCategorie(String Categorie) {
        System.out.println("Publicatii dupa Categorie: ");

        for (Publicatie p: publicatii) {
            if (p.getCategorie().equals(Categorie))
                System.out.println(p.toString());
        }
    }

    public void catalogMedia() {

        System.out.println("Catalog Media: ");
        for (Media m: media) {
            System.out.println(m.toString());
        }
    }

    public void catalogPublicatii() {

        System.out.println("Catalog Publicatie: ");
        for (Publicatie p: publicatii) {
            System.out.println(p.toString());
        }
    }

    public void imprumutaPublicatie(int id, LocalDate dataImprumut) throws Exception {

        try {
            this.publicatii.get(id - 1).imprumuta(dataImprumut);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Publicatia <" + id + "> nu a putut fi imprumutata");
        }

    }

    public void returneazaPublicatie(int id, LocalDate dataRetur) throws Exception {
        try {
            this.publicatii.get(id - 1).returneaza(dataRetur);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Publicatia <" + id + "> nu a putut fi imprumutata");
        }
    }



    public void consultaMedia(int id) throws Exception {
        try {
            media.get(id - publicatii.size() - 1).consulta();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Media nu a fost gasita");
        }
    }



    public void elibereazaMedia(int id) {
        try {
            media.get(id - publicatii.size() - 1).elibereaza();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Media nu a fost gasita");
        }
    }


    public static Biblioteca getBibliotecaPopulata() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adaugaPublicatie(new Carte("Jonathan Coe", "Casa somnului", 1997, CategoriePublicatie.FICTIUNE));
        biblioteca.adaugaPublicatie(new Carte("Anna Gavalda", "Impreuna", 2004, CategoriePublicatie.FICTIUNE));
        biblioteca.adaugaPublicatie(new Articol("Pavel Carol", "Scurta istorie a macaroanelor", CategoriePublicatie.STIINTA, "Good Food", LocalDate.of(2011,
                10, 3)));
        biblioteca.adaugaPublicatie(new Articol("John Meyer", "Internetul in mileniul 3", CategoriePublicatie.STIINTA, "The Scientist", LocalDate.of(1999,
                12, 1)));
        biblioteca.adaugaPublicatie(new Carte("Neagu Djuvara", "O scurta istorie ilustrata a romanilor", 2013, CategoriePublicatie.ISTORIE));
        biblioteca.adaugaPublicatie(new Carte("Frank Herbert", "Dune", 1965, CategoriePublicatie.SF));
        biblioteca.adaugaPublicatie(new Articol("Francois Auteuil", "Limba franceza a evului mediu", CategoriePublicatie.ISTORIE, "Journal de lAcademie Francaise", LocalDate.of(1867, 6, 17)));
        biblioteca.adaugaPublicatie(new Articol("Ygor Swozkowicz", "Plante farmaceutice", CategoriePublicatie.STIINTA, "British Journal of Natural History",
                LocalDate.of(1960, 10, 9)));
        biblioteca.adaugaPublicatie(new Carte("Franz Kafka", "Procesul", 1925, CategoriePublicatie.FICTIUNE));
        biblioteca.adaugaMedia(new Film("DVD", "Inglourious Basterds", 2009, CategorieFilm.ACTIUNE, "Quentin Tarantino"));
        biblioteca.adaugaMedia(new Film("Blu-Ray", "Casablanca", 1941, CategorieFilm.DRAMA, "Michael Curtiz"));
        biblioteca.adaugaMedia(new Film("Blu-Ray", "Superbad", 2007, CategorieFilm.COMEDIE, "Greg Mottola"));
        biblioteca.adaugaMedia(new Film("HDDVD", "BD la munte si la mare", 1971, CategorieFilm.COMEDIE, "Mircea Dragan"));
        biblioteca.adaugaMedia(new Album("CD", "Pink Floyd", "The Wall", CategorieMuzica.ROCK));
        biblioteca.adaugaMedia(new Album("Vinil", "Orchestra Filarmonica Viena", "Beethoven - Simfonia nr. 5", CategorieMuzica.CLASICA));
        biblioteca.adaugaMedia(new Album("CD", "Stromae", "Racine Carree", CategorieMuzica.POP));
        biblioteca.adaugaMedia(new Album("CD", "Satyricon", "The Age of Nero", CategorieMuzica.ROCK));
        return biblioteca;
    }

}