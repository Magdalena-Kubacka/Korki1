package org.example.abstrakcyjne;

public abstract class ZapisAbstract {

    private String getName() {
        return "name";
    }

    String getDefaultName() {
        return "defaultName";
    }

    abstract void zapisz();

    abstract void sprawdz();

    void zapiszBezAbsract() {
        System.out.println("Zapsisujemy bez abstract");
    }

    void sprawdzSprawdzenie() {
        sprawdz();
    }
}
