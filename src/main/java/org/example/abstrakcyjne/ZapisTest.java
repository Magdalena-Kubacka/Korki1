package org.example.abstrakcyjne;

public class ZapisTest {
    public static void main(String[] args) {
        ZapisOryginalny zapisOryginalny = new ZapisOryginalny();
        ZapisTestowy zapisTestowy = new ZapisTestowy();

        zapisTestowy.zapisz();
        zapisOryginalny.zapisz();

        zapisOryginalny.zapiszBezAbsract();
        zapisTestowy.zapiszBezAbsract();

        zapisOryginalny.sprawdzSprawdzenie();
        zapisTestowy.sprawdzSprawdzenie();
    }
}
