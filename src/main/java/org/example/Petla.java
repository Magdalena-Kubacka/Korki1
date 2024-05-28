package org.example;

public class Petla {
    public static void main(String[] args) {
        int counter = 0;
        int szukana = 16;
        int[] ints = {};

        String[] uzytkownicy = new String[]{"Bartek", "Ola", "Magda", "Tosiek"};

        for (int i = 0; i < ints.length; i++) {
            System.out.println("Zwykly fori, element numer " + ints[i]);
        }

        for (int anInt : ints) {
            System.out.println("Skrocony for, element numer " + anInt);
        }


        for (String jakasTamNazwa : uzytkownicy) {
            if (jakasTamNazwa.equals("Bartek")) {
                System.out.println(jakasTamNazwa);
            }
        }

        System.out.println(uzytkownicy[2]);

        String[] strings = new String[3];
        String[] strings1 = new String[strings.length - 1];


        /*
        1) Wstawić null za wybrane miejsce

        2) Przeiterować po danej tablicy i sprawdzić czy imie do usuniecia znajduje sie w tablicy
        2a) Stworzyc nowa tablice z dlugoscia mniejsza niz aktualna o 1
        2b) Jezeli sie znajduje to imie na wybranej pozycji trzeba pominąć w nowej tablicy

         */



        /*
        for ( : nazwa kolekcji)
         */


        /*
        int[] = [1,3,4]
        indexy = [0,1,2]
        int[1] = 3;
        int[3] = exception
         */


        /*
        (1) Biblioteka
        Opis:
    Napisz program do zarządzania biblioteką. Użyj klasy Ksiazka,
    aby przechowywać informacje o każdej książce (tytuł, autor, rok wydania).
    Program powinien umożliwiać dodawanie książek do biblioteki, wyświetlanie wszystkich książek oraz wyszukiwanie książek po tytule.

        Szczegóły:
    Stwórz klasę Ksiazka z polami String tytul, String autor, int rokWydania.
    Stwórz klasę Biblioteka, która będzie przechowywać listę książek w tablicy lub kolekcji.
    Dodaj metody do klasy Biblioteka takie jak dodajKsiazke(Ksiazka k), wyszukajKsiazke(String tytul), wyswietlKsiazki().
    Użyj pętli do iteracji przez listę książek w metodach wyszukajKsiazke i wyswietlKsiazki.
         */

        /*
        (1) Bilioteka v2
        Opis:
        Dodaj metode zaktualizuj, gdzie do wybranej ksiazki powinniśmy ustawić nowy rok wydania - aktualizuj(Ksiazka ksiazka, String nowyAutor)
        Można to rozegrać na kilka sposobow czyli:
        - jedzeimy po petli, nzjadujemy ksiazke o wybranym tutyle i istniejacy tytul zamieniamy
        - jedziemy po p[etli, znajdujemy ksiazke, usuwamy ja i zastepujemy nowa.

         */

        /*
        (2) Fibonacci
        Opis: Napisz program w języku Java, który wyświetli pierwsze 20 liczb Fibonacciego. ( po prostu sa to liczby od 0 w ktorej dodajemy do siebie poprzednia cyfre tzn
        Pierwszym elementem jest 0 a drugim jest 1 tzn że 0 + 1 = 1
        trzeci element to bedzie suma dwóch poprzednich czyli 1 + 1 = 2, wiec lecimy od poczatku 0 | 1 | 1 | 2
        kolejny element to 1 + 2 = 3 czyli mamy 0 | 1 | 1 | 2 | 3
        kolejny element to 2 + 3 = 5 czyli mamy 0 | 1 | 1 | 2 | 3 | 5
        kolejny to 3 + 5 ... itd

        Liczby Fibonacciego to ciąg, w którym każda liczba jest sumą dwóch poprzednich liczb. Dwie pierwsze liczby w tym ciągu to 0 i 1.
         */
    }
}
