package com.brickbreaker.main;

import com.brickbreaker.dao.GameDAO;
import com.brickbreaker.service.GameService;

public class BrickBreakerMain {

    public static void main(String[] args) {

        GameDAO dao = new GameDAO();
        dao.initializeGame();

        GameService service = new GameService(dao);

        System.out.println("Initial Grid:");
        service.displayGrid();

        System.out.println("\nCommand: St (Straight)");
        service.moveStraight();
        service.displayGrid();
    }
}