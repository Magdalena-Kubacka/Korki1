package org.example.kalkutor;

public class SpolkaCywilna implements SpolkaKalkutor{
    private String nazwa = "Cywilna";
    private Double podatekCywilny = 0.2;
    private Integer zwrotZNowegoPrawa = 15000;

    @Override
    public Integer oblicz(Integer sumePrzychodow) {
        return (int) (sumePrzychodow * podatekCywilny) + zwrotZNowegoPrawa;
    }

    @Override
    public String rodzajSpolki() {
        return "CYW";
    }
}
