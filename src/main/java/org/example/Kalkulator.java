package org.example;

public class Kalkulator {
    Integer x;
    Integer y;

    public Kalkulator(Integer l, Integer i) {
        this.x = l;
        this.y = i;
    }

    public Integer dodawanie() {
        return (x + y);

    }

    public Integer odej() {
        return (x - y);

    }

    public Kalkulator() {

    }

    public Integer dodawanie1(Integer q, Integer g) {
        return (q + g);
    }

    public Integer mnożenie() {
        return (x * y);
    }

    public Integer dzielenie(){
        return (x * y);}
    public void wyświetl (){
        System.out.println("Wyświetl x: " + this.x + "Wyświetl y:" + this.y);

    }

}

