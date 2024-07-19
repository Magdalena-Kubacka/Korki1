package org.example.abstrakcyjne;

public class ZapisTestowy extends ZapisAbstract {
    private String NAZWA_KLASY = ZapisTestowy.class.getName();

    @Override
    void zapisz() {
        System.out.println("Zapisujemy w " + NAZWA_KLASY);
    }

    @Override
    void sprawdz() {
        System.out.println("Sprawdzamy zapis w " + NAZWA_KLASY);
    }
}

