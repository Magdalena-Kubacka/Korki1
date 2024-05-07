package org.example.car;

public class Samochod {


    public String nazwa;
    public Integer ilośćPaliwa;
    public Integer spalanie;

    public Samochod(String nazwa, Integer ilośćPaliwa, Integer spalanie) {
        this.nazwa = nazwa;
        this.ilośćPaliwa = ilośćPaliwa;
        this.spalanie = spalanie;
    }

    public Integer jedz(Integer km){
        return km;
    }
public String zmienNazwe(String nazwa) {
        return nazwa;
    }
    public Integer ileLposzlo (Integer spalanie, Integer km){
        return (spalanie * km /100);
    }
    public Integer czyPrzejedzie(){
        if (ilośćPaliwa >=8){
            System.out.println("Mam paliwo aby jechać 100 km.");
        }else
            System.out.println("Brak paliwa.");
        return null;
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



