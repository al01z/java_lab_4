public class Kwadrat extends Figura{
    private int bok;

    public Kwadrat(int bok) {
        this.bok = bok;
    }

    public int pole(){
        return (this.bok * this.bok);
    }

    public int obwod() {
        return (4 * this.bok);
    }

}
