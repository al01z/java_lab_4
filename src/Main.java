public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */
        Kwadrat jakisKwadrat = new Kwadrat(5);
        Prostokat jakisProstokat = new Prostokat(3,5);

        System.out.println("Pole kwadratu to:" + jakisKwadrat.pole());
        System.out.println("Obwod kwadratu to:" + jakisKwadrat.obwod());
        System.out.println("Pole prostokatu to:" + jakisProstokat.pole());
        System.out.println("Obwod prostokatu to:" + jakisProstokat.obwod());


    }
}
