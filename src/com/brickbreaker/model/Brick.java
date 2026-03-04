package com.brickbreaker.model;

public class Brick {

    private int row;
    private int col;
    private int strength;

    public Brick(int row, int col, int strength) {
        this.row = row;
        this.col = col;
        this.strength = strength;
    }

    public void hit() {
        strength--;
    }

    public int getStrength() {
        return strength;
    }
}