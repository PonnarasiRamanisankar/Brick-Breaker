package com.brickbreaker.dao;

import com.brickbreaker.model.*;

public class GameDAO {

    private Position[][] grid = new Position[7][7];
    private Ball ball;

    public void initializeGame() {

        for(int i=0;i<7;i++) {
            for(int j=0;j<7;j++) {

                if(i==0 || i==6 || j==0 || j==6)
                    grid[i][j] = new Position(i,j,'w');
                else
                    grid[i][j] = new Position(i,j,' ');
            }
        }

        // Add bricks (strength = 1)
        grid[2][2] = new Position(2,2,1);
        grid[2][3] = new Position(2,3,1);
        grid[2][4] = new Position(2,4,1);
        grid[3][2] = new Position(3,2,1);
        grid[3][3] = new Position(3,3,1);
        grid[3][4] = new Position(3,4,1);

        // Ground
        grid[6][1].setValue('g');
        grid[6][2].setValue('g');
        grid[6][3].setValue('o');
        grid[6][4].setValue('g');
        grid[6][5].setValue('g');

        ball = new Ball(6,3,5);
    }

    public Position[][] getGrid() {
        return grid;
    }

    public Ball getBall() {
        return ball;
    }
}