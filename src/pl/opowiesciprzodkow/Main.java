import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;

        while (shouldContinue){
            System.out.println("Select options");
            System.out.println("1.view guests");
            System.out.println("2.Add quests");
            System.out.println("3.view meals");
            System.out.println("4.Find phone number");
            System.out.println("5.Exit");

        int userChoice = scanner.nextInt();

            switch(userChoice)
            {
                case 1 -> System.out.println("1 selected");
                case 2 -> System.out.println("2 selected");
                case 3 -> System.out.println("3 selected");
                case 4 -> System.out.println("4 selected");
                case 5 -> shouldContinue = false;
            }

        }


    }
}