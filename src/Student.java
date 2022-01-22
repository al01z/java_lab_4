public class Student implements StudentI{
    String nrIndeksu, nazwaKierunku, nazwaSpecjalizacji, imie, nazwisko;

    public void aJegoIndeks(){
        System.out.println(nrIndeksu);
    }

    public void aJegoKierunek(){
        System.out.println(nazwaKierunku);
    }

    public void aJegoSpecjalizacja(){
        System.out.println(nazwaSpecjalizacji);
    }

    public void aJegoImie(){
        System.out.println(imie);
    }

    public void aJegoNazwisko(){
        System.out.println(nazwisko);
    }
}
