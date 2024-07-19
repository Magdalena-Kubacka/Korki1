package org.example.interfejsy;

public class ZapisTest {
    public static void main(String[] args) {
        ZapisOryginalny zapisOryginalny = new ZapisOryginalny();
        ZapisTestowy zapisTestowy = new ZapisTestowy();

        zapisOryginalny.zapisz();
        zapisTestowy.zapisz();

        Integer i = zapisTestowy.wylosujLiczbe();
        Integer i1 = zapisOryginalny.wylosujLiczbe();

        System.out.println("Testowy " + i + " Oryginaly " + i1);

        zapisOryginalny.zapiszDefault();
        zapisTestowy.zapiszDefault();

        /*

         */
    }
}
