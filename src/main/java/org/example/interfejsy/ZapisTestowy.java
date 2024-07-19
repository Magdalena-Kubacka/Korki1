package org.example.interfejsy;

public class ZapisTestowy implements ZapisInterface {
    private static String NAZWA_KLASY = ZapisTestowy.class.getName();

    @Override
    public void zapisz() {
        System.out.println("Aktualnie zapisuje " + NAZWA_KLASY);
    }

    @Override
    public Integer wylosujLiczbe() {
        return 10;
    }
}
