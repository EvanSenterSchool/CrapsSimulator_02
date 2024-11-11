import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int
        int diceOne;
        int diceTwo;
        int diceThree;
        int diceFour;
        int reRoll;
        int sum_Of_Dice;
        String playerInput;

        boolean playAgain = false;
        boolean secondPart = false;
        boolean do_You_Wanna_PlayAgain = false;

        Scanner scan = new Scanner(System.in);

        //rules of the game
        System.out.println("Rule 1: If the sum is 2, 3, or 12 it is called 'craps' or 'crapping out' and the game is over with a loss.");
        System.out.println("Rule 2: If the sum is 7 or 11 it is called a 'natural' and the game is over with a win.");
        System.out.println("Rule 3: For all other values, the sum becomes 'the point' and the user makes subsequent rolls until they either roll a 7, in which case they lose, or they roll the point sum in which case they win.");

        do {
            //random
            diceOne = (int) (Math.random() * 6) + 1;
            diceTwo = (int) (Math.random() * 6) + 1;

            //sum
            sum_Of_Dice = diceOne + diceTwo;

            //System out roll
            System.out.printf("\n%-10s %5d", "Roll 1:", diceOne);
            System.out.printf("\n%-10s %5d", "Roll 2:", diceTwo);
            System.out.printf("\n%-10s %5d", "Sum:", sum_Of_Dice);

            //game
            if (sum_Of_Dice == 2 || sum_Of_Dice == 3 || sum_Of_Dice == 12) {
                System.out.println();
                System.out.println("CRAPS You Lost!");
                playAgain = true;

            } else if (sum_Of_Dice == 7 || sum_Of_Dice == 11) {
                System.out.println();
                System.out.println("NATURAL You won!");
                playAgain = true;

            } else {
                System.out.println();
                System.out.println("You must roll a " + sum_Of_Dice + " in order to win. A roll of 7 will result in a loss.");
                do {
                    diceThree = (int) (Math.random() * 6) + 1;
                    diceFour = (int) (Math.random() * 6) + 1;

                    reRoll = diceThree + diceFour;

                    if (reRoll == sum_Of_Dice) {
                        System.out.println();
                        System.out.println("You rolled the sum of your die ");
                        secondPart = true;
                        playAgain = true;
                    } else if (diceThree == 7) {
                        System.out.println();
                        System.out.println("Oh Craps you got a 7");
                        secondPart = true;
                        playAgain = true;
                    }


                } while (!secondPart);
            }

            do {
                System.out.println("Would you like to play again Y/N");
                playerInput = scan.nextLine();
                if (playerInput.equalsIgnoreCase("Y")) {
                    playAgain = false;
                    secondPart = false;
                    do_You_Wanna_PlayAgain = true;
                } else if (playerInput.equalsIgnoreCase("N")) {
                    do_You_Wanna_PlayAgain = true;
                } else {
                    System.out.println("Error please enter only Y or N");
                    do_You_Wanna_PlayAgain = false;
                }
            } while (!do_You_Wanna_PlayAgain);


        }   while (!playAgain);

    }
}