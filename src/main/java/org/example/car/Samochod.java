package org.example.car;

public class Samochod {


    public String nazwa;
    public Double ilośćPaliwa;
    public Double spalanie;

    public Samochod(String nazwa, Double ilośćPaliwa, Double spalanie) {
        this.nazwa = nazwa;
        this.ilośćPaliwa = ilośćPaliwa;
        this.spalanie = spalanie;
    }

    public Double jedz(Double km) {
        return km;
    }

    public String zmienNazwe(String nazwa) {
        return nazwa;
    }

    public Double ileLposzlo(Double spalanie, Double km) {
        return (spalanie * km / 100);
    }

    public Boolean czyPrzejedzie() {
        return ilośćPaliwa >= spalanie;


    }
}

    /*
    nazwa
    ilosc paliwa wyrazona w 0-100
    spalanie paliwa na 100km

    metoda jedz(Integer km) {}

    metoda zmien nazwe(String nazwa) {}

    metoda czyPrzejade(Integer km) {}
     */



