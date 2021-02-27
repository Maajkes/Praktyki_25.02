package com.company;

import java.util.Arrays;

public class Zadanie5 {
    public static int NWD(int x, int y){

        while (x != y){
            if (x > y){
                x -= y;
            }
            else{
                y -= x;
            }
        }
        return x;
    }
    public static void main(String[] args) {

        System.out.println("Wynik: "+NWD(100,20));
    }
}