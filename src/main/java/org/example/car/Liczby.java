package org.example.car;
/*
        (2) Fibonacci
        Opis: Napisz program w języku Java, który wyświetli pierwsze 20 liczb Fibonacciego. ( po prostu sa to liczby od 0 w ktorej dodajemy do siebie poprzednia cyfre tzn
        Pierwszym elementem jest 0 a drugim jest 1 tzn że 0 + 1 = 1
        trzeci element to bedzie suma dwóch poprzednich czyli 1 + 1 = 2, wiec lecimy od poczatku 0 | 1 | 1 | 2
        kolejny element to 1 + 2 = 3 czyli mamy 0 | 1 | 1 | 2 | 3
        kolejny element to 2 + 3 = 5 czyli mamy 0 | 1 | 1 | 2 | 3 | 5
        kolejny to 3 + 5 ... itd

        Liczby Fibonacciego to ciąg, w którym każda liczba jest sumą dwóch poprzednich liczb. Dwie pierwsze liczby w tym ciągu to 0 i 1.
         */
public class Liczby {

       public static void main(String[] args) {

           int a = 0;
           int b = 1;
           int suma;
           for (int i = 1; i <= 20; i++) {
               suma = a + b;
               a = b;
               b = suma;
               System.out.println(suma);
           }

       }
}





