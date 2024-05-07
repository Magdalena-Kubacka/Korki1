package org.example.car;

public class SamochodMain {
    public static void main(String[] args) {
        Integer km = 20;
        String nazwa1 = "Testowy Samochód";
       Samochod car = new Samochod("Opel", 45, 8);
        System.out.println(car.zmienNazwe(nazwa1));
        System.out.println("Samochód przejechał: " + car.jedz(km) + "km.");
        System.out.println("Samochód spalił: " + car.ileLposzlo(car.spalanie, km));
        System.out.println("Zostało benzyny: " + (car.ilośćPaliwa - car.ileLposzlo(car.spalanie, km)));
        System.out.println(car.czyPrzejedzie());

        /*
         1) Stworzyć samochody przez konstruktor

         2) Zmienić nazwe jednego samochodu, na "Testowy Samochód"

         3) Przejechać testowym samochodem 20km

         4) Zasymulować czy przejade kolejne 100km
         */

    }
}
