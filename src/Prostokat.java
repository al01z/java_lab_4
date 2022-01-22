public class Prostokat extends Figura{
    private int bok1;
    private int bok2;

    public Prostokat(int bok1, int bok2) {
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    public int pole() {
        return (this.bok1 * this.bok2);
    }

    public int obwod() {
        return (2*this.bok1)+(2*this.bok2);
    }
}
