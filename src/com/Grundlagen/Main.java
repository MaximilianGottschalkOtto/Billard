package com.Grundlagen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double summe = 0;
        long prognose = 0;
        boolean helpingvar = true;
        
        for (int i = 1; i < 100; i++) {
            Scanner scanner = new Scanner(System.in);
            Integer input = scanner.nextInt();
            if(i == 1){
                summe = input;
                prognose= Math.round(summe/i*100);
                System.out.println(prognose);
            }else if(input < 0 && helpingvar == true){
                //Minus
                helpingvar = false;
            }else if(input < 0){
                //Minus mehrmals
            }
            else {
                summe = summe + input;
                System.out.println(summe);
                prognose = Math.round(summe/i*100);
                System.out.println(prognose);
            }
        }

    }
}
