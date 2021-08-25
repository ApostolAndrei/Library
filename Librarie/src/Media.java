abstract public class Media extends Item implements Consultabil{

    protected String suport;

    public Media(String suport) {
        super();
        this.suport = suport;

    }

    public void consulta()
    {
        disponibil = ( disponibil = true ) ? false : false ;
        System.out.println("Media <" + super.getId() + "> este in consultare");
    }

   public void elibereaza()
    {
        disponibil = ( disponibil = false ) ? true : true ;
        System.out.println("Media <" + super.getId() + "> este libera");
    }

}
