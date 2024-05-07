package org.example.car;

public class KotMain {
    public static void main(String[] args) {

        // Chce utworzyć kota o imieniu Wacek
        Kot kot = new Kot("Wacek", 10.0);

        // Chce sprawdzic jak ma na imie
        System.out.println("Kot ma na imię: " + kot.nazwa + ".");

        // Chce sprawdzic ile wazy
        System.out.println("Kot waży: " + kot.waga + " kg.");

    }
}
