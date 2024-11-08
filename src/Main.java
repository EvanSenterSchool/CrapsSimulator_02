public class Main {
    public static void main(String[] args) {
        //int
        int diceOne;
        int diceTwo;
        int sum_Of_Dice;
        boolean playAgain = false;

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
            System.out.printf("\n%-10s %5d","Roll 1:", diceOne);
            System.out.printf("\n%-10s %5d","Roll 2:", diceTwo);
            System.out.printf("\n%-10s %5d","Sum:", sum_Of_Dice);

            //game
            if (sum_Of_Dice == 2 || sum_Of_Dice == 3 || sum_Of_Dice == 12) {
                System.out.println("CRAPS You Lost!");
                playAgain = true;

            }
            else if (sum_Of_Dice == 7 || sum_Of_Dice == 11) {
                System.out.println("NATURAL You won!");
            }
            else {
                System.out.println("You must roll a " + sum_Of_Dice + "in order to win. A roll of 7 will result in a loss.");
            }


        }   while (!playAgain);





    }
}