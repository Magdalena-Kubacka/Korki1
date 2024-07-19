package org.example.interfejsy;

public class ZapisOryginalny implements ZapisInterface {
    private static String NAZWA_KLASY = ZapisOryginalny.class.getName();

    @Override
    public void zapisz() {
        System.out.println("Aktualnie zapisuje " + NAZWA_KLASY);
    }

    @Override
    public Integer wylosujLiczbe() {
        return 20;
    }
}
