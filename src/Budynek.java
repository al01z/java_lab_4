public interface Budynek {
    double powierzchnia(double pow);

    String adresBudynku(String adres);

    int liczbaOkien(int value);

    void liczbaMieszkancow(int value);

    void kolorDomu(KolorEnum kolor);

    enum KolorEnum {
        TURKUSOWY, POPIELATY, GRAFITOWY, BORDOWY, AKWAMARYNOWY
    }

    void przemaluj(String adres, KolorEnum kolor);
}
