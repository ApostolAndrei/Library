import java.time.LocalDate;

public class Articol extends Publicatie {


    public static int TERMEN_IMPRUMUT = 4;
    public static double PENALIZARE = 0.1;
    protected String publicatie;
    protected LocalDate dataPublicatie;

    public Articol(String autor, String titlu, String categorie,  String publicatie, LocalDate dataPublicatie ) {
        super.autor = autor;
        super.titlu = titlu;
        super.categorie= categorie;
        this.publicatie = publicatie;
        this.dataPublicatie = dataPublicatie;
    }

    public String toString()
    {
        return  super.getId()+ ". " + this.autor+ "  " + this.titlu + "  " + this.categorie + "  "
                + this.publicatie + " " + this.dataPublicatie;
    }
}
