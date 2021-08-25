import java.time.LocalDate;

public class Carte extends Publicatie {

    public static int TERMEN_IMPRUMUT = 4;
    public static double PENALIZARE = 0.5;
    protected int anPublicatie;


    public Carte(String autor, String titlu, int anPublicatie,String categorie ) {
        super.autor = autor;
        super.titlu = titlu;
        super.categorie = categorie;
        this.anPublicatie = anPublicatie;
    }

    public String toString()
    {
        return super.getId()+ ". " + this.autor+ "  " + this.titlu +
                "  " + this.categorie +"  " + this.anPublicatie;
    }
}
