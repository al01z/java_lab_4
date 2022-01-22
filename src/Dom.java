public class Dom implements Budynek{
    private double pow;
    private String adres;
    private int value;

    @Override
    public double powierzchnia(double pow) {
        return this.pow;
    }

    @Override
    public String adresBudynku(String adres){
        return this.adres;
    }

    @Override
    public int liczbaOkien(int value){
        return value;
    }

    @Override
    public void liczbaMieszkancow(int value){
        System.out.println("Liczba mieszkancow to" + value);
    }

    @Override
    public void kolorDomu(Budynek.KolorEnum kolor) {
        System.out.println("Kolor domu to" + kolor);
    }

    @Override
    public void przemaluj(String adres, KolorEnum kolor) {
        System.out.println("Przemalowuje dom " + adres + " na kolor " + kolor);
    }

    public double getPow() {
        return pow;
    }

    public String getAdres() {
        return adres;
    }

    public int getValue() {
        return value;
    }

    public void setPow(double pow) {
        this.pow = pow;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Dom{" +
                "pow=" + pow +
                ", adres='" + adres + '\'' +
                ", value=" + value +
                '}';
    }
}
