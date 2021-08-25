import java.time.LocalDate;
import java.time.Period;

import java.time.temporal.ChronoUnit;

abstract public class Publicatie extends Item implements Imprumutabil {

    protected String autor;
    protected String titlu;
    protected String categorie;
    protected LocalDate dataImprumut;



    public boolean isDisponibil() {
        return super.disponibil;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategorie() {
        return categorie;
    }

    public void imprumuta(LocalDate dataImprumut) throws Exception {

        if (this.isDisponibil()) {
            this.disponibil = false;
                System.out.println(" \nPublicatia <" + super.getId() + "> a fost imprumutata ");
                this.dataImprumut = dataImprumut;

        } else throw new Exception("Publicatia " + super.getId() + " nu este valabila");

    }
    public void returneaza(LocalDate dataRetur) throws Exception {

        if (!this.isDisponibil()) {
            this.disponibil = true;


            if (this instanceof Articol) {

                if (this.dataImprumut.plusWeeks(Articol.TERMEN_IMPRUMUT).isBefore(dataRetur)) {

                    System.out.println("Termen depasit pentru publicatia " + super.getId());
                    System.out.println("Penalizare : " + this.calculPenalizare(dataRetur) + " lei");

                } else System.out.println("Publicatia < " + super.getId() + " >" + " a fost returnata");

            } else if (this.dataImprumut.plusWeeks(Carte.TERMEN_IMPRUMUT).isBefore(dataRetur)) {

                System.out.println("Termen depasit pentru publicatia " + super.getId());
                System.out.println("Penalizare : " + this.calculPenalizare(dataRetur) + " lei");

            } else System.out.println("Publicatia < " + super.getId() + " >" + "a fost returnata");

        } else throw new Exception("Publicatia < " + super.getId() + " > nu poate fi returnata (nu a fost imprumutata)");

    }




    public double calculPenalizare(LocalDate dataRetur) {

        int daysArt = (int) ChronoUnit.DAYS.between(this.dataImprumut.plusWeeks(Articol.TERMEN_IMPRUMUT), dataRetur);
        int daysCarte = (int) ChronoUnit.DAYS.between(this.dataImprumut.plusWeeks(Carte.TERMEN_IMPRUMUT), dataRetur);

        if (this instanceof Articol && daysArt > 0) {

            return daysArt * Articol.PENALIZARE;


        } else if (this instanceof Carte && daysCarte > 0) {

            return daysCarte * Carte.PENALIZARE;
        } else
            return 0;
    }

}