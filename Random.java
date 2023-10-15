import java.util.*;
public class Random
{
    
    Scanner obj = new Scanner(System.in);
    public void Choice()
    {
        java.util.Random random1 = new java.util.Random();
        Scanner obj1 = new Scanner(System.in);
        int tries = 0;
        System.out.println("Choose a range of numbers to guess the random number! ");
        System.out.print("What is the lowest number of the range? ");
        String lower = obj1.nextLine();
        int lowernum = Integer.parseInt(lower);
        System.out.print("What is the highest number of the range? ");
        String higher = obj.nextLine();
        int highernum = Integer.parseInt(higher);
        int rand1 = random1.nextInt(lowernum,highernum);
        System.out.println("The random number has been chosen!");
        System.out.println("The range is between " + lowernum + " and " + highernum);
        System.out.print("Take a guess! ");
        boolean guessCorrect = false;
        while(!guessCorrect)
        {
            String guess = obj1.nextLine();
            int guess1 = Integer.parseInt(guess);
            tries++;
            if(guess1 > rand1)
            {
                System.out.println("Too high! Guess again! ");
            } 
            else if(guess1 < rand1)
            {
                System.out.println("Too low! Guess again!");
            }
            else
            {
                guessCorrect = true;
            }
        }
        System.out.println("You guessed the number! It took you " + tries + " tries!");
    }
    // Easy function
    public void Easy()
    {
        java.util.Random random1 = new java.util.Random();
        Scanner obj1 = new Scanner(System.in);
        int tries = 0;
        int rand1 = random1.nextInt(1,10);
        System.out.println("The random number has been chosen!");
        System.out.println("The range is between 1 and 10");
        System.out.print("Take a guess! ");
        boolean guessCorrect = false;
        while(!guessCorrect)
        {
            String guess = obj1.nextLine();
            int guess1 = Integer.parseInt(guess);
            tries++;
            if(guess1 > rand1)
            {
                System.out.println("Too high! Guess again! ");
            } 
            else if(guess1 < rand1)
            {
                System.out.println("Too low! Guess again!");
            }
            else
            {
                guessCorrect = true;
            }
        }
        System.out.println("You guessed the number! It took you " + tries + " tries!");
    }
    //Medium function
    public void Medium()
    {
        java.util.Random random1 = new java.util.Random();
        Scanner obj1 = new Scanner(System.in);
        int tries = 0;
        int rand1 = random1.nextInt(1,50);
        System.out.println("The random number has been chosen!");
        System.out.println("The range is between 1 and 50");
        System.out.print("Take a guess! ");
        boolean guessCorrect = false;
        while(!guessCorrect)
        {
            String guess = obj1.nextLine();
            int guess1 = Integer.parseInt(guess);
            // keeps track on the amount of tries
            tries++;
            // greater than; too high
            if(guess1 > rand1)
            {
                System.out.println("Too high! Guess again! ");
            } 
            // less than; too low
            else if(guess1 < rand1)
            {
                System.out.println("Too low! Guess again!");
            }
            else
            {
                guessCorrect = true;
            }
        }
        // when guessCorrect == true, it will print this statement out
        System.out.println("You guessed the number! It took you " + tries + " tries");
    }
    // Hard function
    public void Hard()
    {
        java.util.Random random1 = new java.util.Random();
        Scanner obj1 = new Scanner(System.in);
        int tries = 0;
        int rand1 = random1.nextInt(1,500);
        System.out.println("The random number has been chosen!");
        System.out.println("The range is between 1 and 500");
        System.out.print("Take a guess! ");
        boolean guessCorrect = false;
        while(!guessCorrect)
        {
            String guess = obj1.nextLine();
            int guess1 = Integer.parseInt(guess);
            tries++;
            if(guess1 > rand1)
            {
                System.out.println("Too high! Guess again! ");
            } 
            else if(guess1 < rand1)
            {
                System.out.println("Too low! Guess again!");
            }
            else
            {
                guessCorrect = true;
            }
        }
        System.out.println("You guessed the number! It took you " + tries + " tries");
    }



}
