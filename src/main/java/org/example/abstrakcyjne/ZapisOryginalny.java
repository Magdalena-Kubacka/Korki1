package org.example.abstrakcyjne;

public class ZapisOryginalny extends ZapisAbstract{
    private String NAZWA_KLASY = ZapisOryginalny.class.getName();

    @Override
    void zapisz() {
        System.out.println("Zapisujemy w " + NAZWA_KLASY);
    }

    @Override
    void sprawdz() {
        System.out.println("Sprawdzamy zapis w " + NAZWA_KLASY);
    }

    @Override
    void zapiszBezAbsract() {
        /*
        super.getName();
         */
        super.getDefaultName();
        super.zapiszBezAbsract();
    }
}
