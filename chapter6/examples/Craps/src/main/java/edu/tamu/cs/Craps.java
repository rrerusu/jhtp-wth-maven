package edu.tamu.cs;

import java.security.SecureRandom;

public class Craps {
    private static final SecureRandom randomNumbers = new SecureRandom();

    // enum type with constants that represent the game status
    private enum Status {CONTINUE, WON, LOST};

    private static final int SNAKE_EYES = 2,
        TREY = 3,
        SEVEN = 7,
        YO_LEVEN = 11,
        BOX_CARS = 12;
    
    public static void main(String[] args) {
        int myPoint = 0,
            sumOfDice = rollDice();
        Status gameStatus;

        switch(sumOfDice) {
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d\n", myPoint);
                break;
        }

        while(gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice();
            if(sumOfDice == myPoint)
                gameStatus = Status.WON;
            else
                if(sumOfDice == SEVEN)
                    gameStatus = Status.LOST;
        }

        if(gameStatus == Status.WON)
            System.out.printf("Player wins\n");
        else
            System.out.printf("Player loses\n");
    }

    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6),
            die2 = 1 + randomNumbers.nextInt(6),
            sum = die1 + die2;
        
        System.out.printf("Player rolled %d + %d = %d\n",
            die1, die2, sum);
        
        return sum;
    }
}
