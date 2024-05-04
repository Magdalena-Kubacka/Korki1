package org.example;


public class Main {
    public static void main(String[] args) {
        Integer z = 10;
        Integer b = 20;

        Kalkulator cal = new Kalkulator(z, b);

        System.out.println(cal.x);
        System.out.println(cal.dodawanie());
        System.out.println(cal.odej());
        System.out.println(cal.dodawanie1(40, 39));
        System.out.println(cal.mnożenie());
        System.out.println(cal.dzielenie());
       Integer wynik = cal.mnożenie();
        System.out.println(wynik);
        cal.wyświetl();

    }
}