abstract public class Item  {
    private int id;
    protected boolean disponibil;
    static int count = 0;

    Item()
    {
        this.id = ++count;
        this.disponibil = true;
    }

    public int getId() {return this.id;}
    public void setId(int id) {this.id = id;}
}
