/**
 * Created by Mike on 1/25/2015.
 */
/**
 * Created by Mike on 1/25/2015.
 */

 import java.util.Scanner;

public class Lottery {
    public static int lottery, guess, lotteryDigit1,lotteryDigit2, guessDigit1, guessDigit2;
    final static int MULTI = 10; //This is used to break down the number in order to compare digits//multiplier used to eliminate a magical number in code//multiplier used to eliminate a magical number in code
    final static int RAND1 = 100; //This set the range of numbers that the random will be generated from.
    public static void main(String[] Args) {
        //Generate a lottery number
        lottery = (int) (Math.random() * RAND1);

        //Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        guess = input.nextInt();

        // Get digits from lottery
        lotteryDigit1 = lottery / MULTI;
        lotteryDigit2 = lottery % MULTI;

        System.out.printf("The lottery number is " + lottery);

        //Check the Guess
        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
            System.out.println("Match all digits: you win $3,000");
        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println(" Sorry, No Match ");

    }
}
