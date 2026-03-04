package com.brickbreaker.service;

import com.brickbreaker.dao.GameDAO;
import com.brickbreaker.model.*;

public class GameService {

    private GameDAO dao;

    public GameService(GameDAO dao) {
        this.dao = dao;
    }

    public void moveStraight() {

        Ball ball = dao.getBall();
        Position[][] grid = dao.getGrid();

        int r = ball.getRow();
        int c = ball.getCol();

        for(int i=r-1; i>=0; i--) {

            if(grid[i][c].getStrength() > 0) {
                grid[i][c].setStrength(
                        grid[i][c].getStrength() - 1);

                if(grid[i][c].getStrength() == 0) {
                    grid[i][c].setValue(' ');
                }

                ball.decreaseLife();
                break;
            }

            if(grid[i][c].getValue() == 'w')
                break;
        }
    }

    public void displayGrid() {

        Position[][] grid = dao.getGrid();

        for(int i=0;i<7;i++) {
            for(int j=0;j<7;j++) {

                if(grid[i][j].getStrength() > 0)
                    System.out.print(grid[i][j].getStrength()+" ");
                else
                    System.out.print(grid[i][j].getValue()+" ");
            }
            System.out.println();
        }

        System.out.println("Ball count: "
                + dao.getBall().getLives());
    }
}