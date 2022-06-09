package com.company;

public class SantaClaus {

    private static SantaClaus instance;
    private MagicBoard magicBoard = new MagicBoard();

    private SantaClaus() {}

    public static SantaClaus getInstance() {
        if (instance == null) {
            instance = new SantaClaus();
        }
        return instance;
    }

    public void writeOnMagicBoard(String toyModel) {
        this.magicBoard.write(toyModel);
    }

    public void checkToys() {
        this.magicBoard.playWithToys();
    }
}
