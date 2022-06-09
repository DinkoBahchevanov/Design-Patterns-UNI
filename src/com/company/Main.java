package com.company;

public class Main {

    public static void main(String[] args) {
        SantaClaus santaClaus = SantaClaus.getInstance();

        santaClaus.writeOnMagicBoard("Doll");
        santaClaus.writeOnMagicBoard("Bicycle");
        
        santaClaus.checkToys();
    }
}
