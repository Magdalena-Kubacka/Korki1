package org.example.kalkutor;

public class SpolkaPrywatna implements SpolkaKalkutor {
    private Double podatekPrywatny = 0.15;
    private Integer zwrotZPkb = 500;
    @Override
    public Integer oblicz(
                          Integer sumePrzychodow) {
        return (int) (sumePrzychodow * podatekPrywatny + zwrotZPkb);
    }

    @Override
    public String rodzajSpolki() {
        return "PRYW";
    }
}
