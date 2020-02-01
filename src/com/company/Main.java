package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rukxak rukxak3 = new Rukxak();
        Rukxak rukxak2 = new Rukxak();
        Rukxak rukxak = new Rukxak();
        for (int i = 0; i <21; i++) {
            rukxak.AddRux(new Kruglye("apple"));
        }
        rukxak.AddRux(new Ploskie("Book"));
        rukxak.AddRux(new Ciliindr("Coca-Cola"));
        for (int i = 0; i <51; i++) {
            rukxak2.AddRux(new Kruglye("tennis ball"));
        }
        rukxak2.AddRux(new Ploskie("Papka"));
        rukxak2.AddRux(new Ciliindr("water"));
        for (int i = 0; i <11; i++) {
            rukxak3.AddRux(new Kruglye("apple"));
        }
        for (int i = 0; i <3; i++) {
            rukxak3.AddRux(new Kruglye("tennis ball"));

        }
        rukxak3.AddRux(new Ploskie("Papka"));
        rukxak3.AddRux(new Ciliindr("Coca_cola"));
    }
}
