package com.radhsyn83;

public class SelisihBilangan extends Bilangan{

    public SelisihBilangan(int x, int y) {
        super(x, y);
    }

    public void tampilSelisih(){
        System.out.println("Hasil Selisih = " + (getX() - getY()));
    }
}