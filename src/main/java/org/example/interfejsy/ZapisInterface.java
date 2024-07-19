package org.example.interfejsy;

public interface ZapisInterface {
    /*
    TYP_ZWRACANY NAZWA(EWENTUALNE PARAMTERY)
     */

    void zapisz();

    Integer wylosujLiczbe();

    default void zapiszDefault() {
        System.out.println("Zapisuje w czym?");
    }

    default Integer wylosujLiczbeDefault() {
        return 1;
    }
}
