package org.example.car;

/*Dodaj metody do klasy Biblioteka takie jak dodajKsiazke(Ksiazka k), wyszukajKsiazke(String tytul), wyswietlKsiazki().
        Użyj pętli do iteracji przez listę książek w metodach wyszukajKsiazke i wyswietlKsiazki.*/
public class Książka extends Object{
    private String tytuł;
    private String autor;
    private Integer rokWydania;

    public Książka(String tytuł,
                   String autor,
                   Integer rokWydania) {
        this.tytuł = tytuł;
        this.autor = autor;
        this.rokWydania = rokWydania;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTytul() {
        return this.tytuł;
    }

    public Integer getRokWydania() {
        return rokWydania;
    }

    @Override
    public String toString() {
        return "Książka{" +
                       "tytuł='" + tytuł + '\'' +
                       ", autor='" + autor + '\'' +
                       ", rokWydania=" + rokWydania +
                       '}';
    }


}








