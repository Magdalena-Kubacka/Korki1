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
          Książka[] książki = new Książka[10];

          książki[0] = new Książka("Java Podstawy", "Cay S. Horstmann", 2021);
          książki[1] = new Książka("Japonia", "Phillip Tang", 2022);
          książki[2] = new Książka("Git i GitHub", "Mariot Tsitoara", 2020);


          System.out.println(książki[0]);


          for (Książka wyświetl : książki) {
              System.out.println(wyświetl);
          }


      }

  }


/*  (1) Bilioteka v2
          Opis:
          Dodaj metode zaktualizuj, gdzie do wybranej ksiazki powinniśmy ustawić nowy rok wydania - aktualizuj(Ksiazka ksiazka, String nowyAutor)
          Można to rozegrać na kilka sposobow czyli:
          - jedzeimy po petli, nzjadujemy ksiazke o wybranym tutyle i istniejacy tytul zamieniamy
          - jedziemy po p[etli, znajdujemy ksiazke, usuwamy ja i zastepujemy nowa.*/







