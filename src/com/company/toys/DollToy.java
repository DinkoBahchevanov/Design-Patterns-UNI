package com.company.toys;

public class DollToy extends Toy implements Doll {

    @Override
    public void playWithDoll() {
        System.out.println("Playing with Doll yeaaah!");
    }

    @Override
    public void play() {
        this.playWithDoll();
    }
}
