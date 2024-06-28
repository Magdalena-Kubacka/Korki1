package org.example.car;
/*Dodaj metody do klasy Biblioteka takie jak dodajKsiazke(Ksiazka k), wyszukajKsiazke(String tytul), wyswietlKsiazki().
        Użyj pętli do iteracji przez listę książek w metodach wyszukajKsiazke i wyswietlKsiazki.*/
public class Książka {
    private String tytuł;
    private String autor;
    private Integer rokWydania;

    public Książka(String tytuł, String autor, Integer rokWydania) {
        this.tytuł = tytuł;
        this.autor = autor;
        this.rokWydania = rokWydania;
    }
    public String wyszukajKsiążkę (){
        return tytuł;
    }


    }








