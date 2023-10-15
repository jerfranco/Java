import java.util.*;
public class Program {
    public static void main(String arg[])
    {
        Random rand = new Random();
        String response = "";
        String options[] = {"1","2","3","4","5"};
        while(response != "5")
        {
            while(!Arrays.asList(options).contains(response))
            {
                // Main menu
                System.out.println("------------------------------");
                System.out.println("Welcome to the guessing number ");
                System.out.println("------------------------------\n");
                System.out.println("Choose one of the 5 options below to get started! ");
                System.out.println("1. Easy\n2. Medium\n3. Hard\n4. Make your own\n5. Quit");
                Scanner scanner = new Scanner(System.in);
                response = scanner.nextLine();
            }
            switch (response)
            {
                case "1":
                // Easy mode
                    rand.Easy();
                    break;
                case "2":
                // Medium mode
                    rand.Medium();
                    break;
                case "3":
                // Hard mode
                    rand.Hard();
                    break;
                case "4":
                // Custom mode
                    rand.Choice();
                    break;
                case "5":
                    System.exit(0);
                    break;   
            }
            response = "";
        }
    }
}
