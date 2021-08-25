public class Album  extends Media{

    protected String artist;
    protected String titlu;
    protected String gen;

    public Album(String suport, String artist, String titlu, String gen) {
        super(suport);
        this.artist = artist;
        this.titlu = titlu;
        this.gen = gen;
    }

    public String toString()
    {
        return super.getId()+ ". " + super.suport+ "  " + this.artist + "  "
                + this.titlu +"  " + this.gen;
    }

}
