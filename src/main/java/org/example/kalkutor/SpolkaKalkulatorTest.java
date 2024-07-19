package org.example.kalkutor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpolkaKalkulatorTest {
    public static void main(String[] args) {
        SpolkaKalkutor spolkaKalkutor = new SpolkaCywilna();
        SpolkaKalkutor spolkaPrywatna = new SpolkaPrywatna();
        SpolkaKalkutor spolkaZoo = new SpolkaZoo();

        List<SpolkaKalkutor> spolkaPrywatna1 = List.of(spolkaPrywatna, spolkaKalkutor, spolkaZoo);

        Map<String, SpolkaKalkutor> spolkaKalkutorMap = new HashMap<>();

        spolkaKalkutorMap.put(spolkaKalkutor.rodzajSpolki(), spolkaKalkutor);
        spolkaKalkutorMap.put(spolkaKalkutor.rodzajSpolki(), spolkaKalkutor);
        spolkaKalkutorMap.put(spolkaKalkutor.rodzajSpolki(), spolkaKalkutor);


        String sygnatura = "CYW";
        Integer sumeDochodow = 15000;

//        Integer i = spolkaPrywatna1.stream()
//                                   .filter(p -> p.rodzajSpolki().equals(sygnatura))
//                                   .map(spolka -> spolka.oblicz(sumeDochodow))
//                                   .findAny()
//                                   .get();

//        System.out.println(i);

        Integer oblicz = spolkaKalkutorMap.get(sygnatura)
                                          .oblicz(15000);

        System.out.println(oblicz);

    }
}
