package com.engeto.example;

public class Main {

    public static void main(String[] args) {

        String Fiz = "Fizz";     //metoda static - není vztažená ke konkrétní instanci třídy, ke konkrétnímu objektu
        String Buz = "Buzz";
        String FizBuz = "FizzBuzz";

        for (int i = 1; i <= 100; i++) {    //++ zvýším i o 1 dokud nedojdu ke 100

            if ((i % 3 == 0)) System.out.println("Fizz");           //pokud je dělitelné 3, vypiš místo toho Fizz
            else if ((i % 5 == 0)) System.out.println("Buzz");      //pokud je dělitelné 5, vypiš místo toho Buzz

            else if ((i % 3 == 0) && (i % 5 == 0)) System.out.println("FizzBuzz");  //pokud je dělitelné 3 a zároveň 5, vypiš FizzBuzz
            else System.out.println(i);     //pokud nesplňuje ani jednu předchozí podmínku, jen to číslo vypiš

            //pozn:
            //dělení %
            //&& a zároveň
        }
    }
}