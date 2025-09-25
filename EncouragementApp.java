import java.util.Scanner;
public class EncouragementApp {
    static Scanner userinput = new Scanner(System.in);
    public static void main(String[] args) {

        //Get user's age:
        System.out.print("How old are you (Enter a number in years)? ");
        int age = userinput.nextInt();
        userinput.nextLine();

        //Get user's "status":
        System.out.print("How are you doing today (Enter: Good or Bad)? ");
        String status = userinput.nextLine();

        //Create a separation:
        System.out.println("\n");

        //Print a message if the user is doing well and is less than 18 years old.
        if(age<18 && status.equalsIgnoreCase("Good")) {System.out.println("I'm glad to hear your doing well. School must be going smoothly.");
        }

        //Print a message if the user is doing badly and is less that 18 years old.
        if (age<18 && status.equalsIgnoreCase("Bad")) {System.out.println("I am sorry to hear that. Remember that the Lord cares for his children.");
        }

        //Print a message if the user is between the ages of 17 and 40 and is doing well.
        if (age>17 && age<40 && status.equalsIgnoreCase("Good")) {System.out.println("Don't forget to thank the Lord for the blessings He gives.");
        }

        //Print a message if the user is between the ages of 17 and 40 and is doing badly.
        if (age>17 && age<40 && status.equalsIgnoreCase("Bad")) {System.out.println("Trust in the Lord with all your heart and lean not on your own understanding, ");
        System.out.println("in all your ways acknowledge Him and He will direct your paths.");
        System.out.println("\t\t\t\t\tProverbs 3:5-6");
        }

        //Print a message if the user is older than 39 and is doing well.
        if (age>39 && status.equalsIgnoreCase("Good")) {
            System.out.println("May you have many more years of walking with the Lord.");
        }

        //Print a message if the user is older than 39 and is doing badly.
        if (age>39 && status.equalsIgnoreCase("Bad")) {
            System.out.println("O praise the Lord, all ye nations:");
            System.out.println("praise him, all ye people.");
            System.out.println("For his merciful kindness is great toward us:");
            System.out.println("and the truth of the Lord endureth for ever.");
            System.out.println("Praise ye the Lord.");
            System.out.println("\t\t\tPsalm 117");
        }
}}
