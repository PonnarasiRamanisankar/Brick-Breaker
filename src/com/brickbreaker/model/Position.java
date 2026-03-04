package com.brickbreaker.model;

public class Position {

    private int row;
    private int col;
    private char value;      
    private int strength;   

    public Position(int row, int col, char value) {
        this.row = row;
        this.col = col;
        this.value = value;
        this.strength = 0;
    }

    public Position(int row, int col, int strength) {
        this.row = row;
        this.col = col;
        this.value = 'b';
        this.strength = strength;
    }

    public int getRow() {
    	return row; 
    	}
    public int getCol() { 
    	return col; 
    	}

    public char getValue() {
    	return value; 
    	}
    public void setValue(char value) {
    	this.value = value; 
    	}

    public int getStrength() {
    	return strength;
    	}
    public void setStrength(int strength) { 
    	this.strength = strength;
    	}
}