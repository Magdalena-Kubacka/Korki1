package org.example.kalkutor;

public class SpolkaZoo implements SpolkaKalkutor {
    private Double podatekZoo = 0.5;
    @Override
    public Integer oblicz(
                          Integer sumePrzychodow) {
        return (int) (sumePrzychodow * podatekZoo);
    }

    @Override
    public String rodzajSpolki() {
        return "ZOO";
    }
}
