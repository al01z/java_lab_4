public class Pracownik implements PracownikI {
    String nazwaZawodu, nazwaRangi, imie, nazwisko;
    int wysokoscWynagrodzenia;

    public void aJegoZawod(){
        System.out.println(nazwaZawodu);
    }

    public void aJegoWynagrodzenie(){
        System.out.println(wysokoscWynagrodzenia);

    }

    public void aJegoRanga(){
        System.out.println(nazwaRangi);

    }

    public void aJegoImie(){
        System.out.println(imie);

    }

    public void aJegoNazwisko(){
        System.out.println(nazwisko);

    }
}
