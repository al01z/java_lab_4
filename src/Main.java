import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć tablicę 6-cio elementową, uzupełnić przykładowymi wartościami (dowolny typ tablicy),
        b) wprowadzić z klawiatury numer indexu tablicy który chcemy wyświetlić, użyć metody next() --> scan.next();
        c) zabezpieczyć kod przed wprowadzeniem:
           - za dużej liczby (index > tab.length),
           - wprowadzeniem innego znaku niż liczba,
        d) użyć metody finally aby wyświetlić komunikat zakończenia programu
        e) wprowadzanie indeksu niech będzie zapętlone do momentu wprowadzenia poprawnego indeksu

           PODPOWIEDZI:
           scan.next() - można wprowadzać dowolny znak z klawiatury,
           index = Integer.parseInt(scan.next()); - parsowanie zmiennej do typu int (liczbowego calkowitego)

           warto stworzyć flagę np. isIndexCorrect = false, i niech pętla sie wykonuje, dopuki flaga jest false,
           boolean isIndexCorrect
           white(!isIndexCorrect) {}
        */
        boolean isIndexCorrect;
        String wejscie = "";
        String wyjscie= "";
        int index = -1;
        isIndexCorrect = false;
        int[] tablica = {2,56,58,31,44,256};
        Scanner scanner = new Scanner(System.in);
        while(!isIndexCorrect) {
            try {
                System.out.println("Podaj indeks do wyświetlenia:");
                wejscie = scanner.next();
                index = Integer.parseInt(wejscie);
                System.out.println(tablica[index]);
                isIndexCorrect = true;
            }
            catch (NumberFormatException e) {
                    System.out.println("Błąd, wprowadzony znak nie jest cyfrą!");
            }
            catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Błąd Podałeś index: " + index + ", a dozwolone są od 0 do " + (tablica.length - 1));
            }
            finally {
                System.out.println("Koniec Programu.");
            }
        }





        /* zad.2
        a) stworzyć dowolny przykład z NullPonterException,
        b) stworzyć dowolny przykład z ArithmeticException ,
        c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,
         */

        try {
            String name = null;
            name.toString();
        } catch (NullPointerException e) {
            System.out.println("Błąd nie można wywołać metody toString() na null");
            throw e; // rzuca komunikat z klasy Exception
        }

        try {
            int a = 0;
            int b = 3;
            int c = 5;
            int x = (b*c)/a;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException " + e.getMessage());
        }

    }
}
