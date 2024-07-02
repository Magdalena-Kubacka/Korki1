package org.example.car;

/*(1) Biblioteka
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
public class Biblioteka {
    public static void main(String[] args) {
        Książka[] książki = new Książka[4];

        książki[0] = new Książka("Java Podstawy", "Cay S. Horstmann", 2021);
        książki[1] = new Książka("Japonia", "Phillip Tang", 2022);
        książki[2] = new Książka("Git i GitHub", "Mariot Tsitoara", 2020);


        int miejsce = 3;
        String nowaKsiazkaTytul = "Typowa Ksiazka";
        String nowaKsiazkaAutor = "Typowy Autor";
        int nowaKsiazkaRokWydania = 2030;

        dodajKsiazke(książki, miejsce, nowaKsiazkaTytul, nowaKsiazkaAutor, nowaKsiazkaRokWydania);


//        for (Książka wyświetl : książki) {
//            System.out.println(wyświetl);
//        }

//        for (int i = 0; i < książki.length; i++) {
//            System.out.println(książki[i]);
//        }

//        String tytulWyszukiwanejKsiazki = "Git i GitHub";
//        wyszukajKsiazke(książki, tytulWyszukiwanejKsiazki);

        String nowyAutor = "Przykladowy Autor 2024";
        int szukanyRokWydania = 2022;
        aktualizuj(książki, szukanyRokWydania, nowyAutor);

        for (Książka wyświetl : książki) {
            System.out.println(wyświetl);
        }
        
    }

    private static void wyszukajKsiazke(Książka[] książki,
                                        String tytulWyszukiwanejKsiazki) {
        for (Książka książka : książki) {
            if (książka.getTytul().equals(tytulWyszukiwanejKsiazki)) {
                System.out.println("Znaleziono ksiazke " + książka);
            }
        }
    }

    private static void dodajKsiazke(Książka[] ksiazki,
                                     int miejsce,
                                     String nowaKsiazkaTytul,
                                     String nowaKsiazkaAutor,
                                     int nowaKsiazkaRokWydania) {
        Książka książka = new Książka(nowaKsiazkaTytul, nowaKsiazkaAutor, nowaKsiazkaRokWydania);
        ksiazki[miejsce] = książka;
    }

    private static void aktualizuj(Książka[] ksiazki,
                                   int rokWydania,
                                   String nowyAutor) {
        for (Książka książka : ksiazki) {
            if (książka.getRokWydania() == rokWydania) {
                książka.setAutor(nowyAutor);
            }
        }
    }

    private static void aktualizuj2(Książka[] ksiazki,
                                   int rokWydania,
                                   String nowyAutor) {
        for (int i = 0; i < ksiazki.length; i++) {
            if (ksiazki[i].getRokWydania() == rokWydania) {
                Książka książka = ksiazki[i];
                Książka książka1 = new Książka(książka.getTytul(), nowyAutor, książka.getRokWydania());
                ksiazki[i] = null;
                ksiazki[i] = książka1;
            }
        }
    }

}


/*  (1) Bilioteka v2
          Opis:
          Dodaj metode zaktualizuj, gdzie do wybranej ksiazki powinniśmy ustawić nowy rok wydania - aktualizuj(Ksiazka ksiazka, String nowyAutor)
          Można to rozegrać na kilka sposobow czyli:
          - jedzeimy po petli, nzjadujemy ksiazke o wybranym tutyle i istniejacy tytul zamieniamy
          - jedziemy po p[etli, znajdujemy ksiazke, usuwamy ja i zastepujemy nowa.*/







