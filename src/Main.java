import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String addMore;
        Party party = new Party();
        Scanner sc = new Scanner(System.in);
        System.out.println("***Welcome to the party! What would you like to do?***");
        boolean play = true;
        String end;

        try {

            while (play) {
                System.out.println("1. Add a guest");
                System.out.println("2. See who's coming");
                System.out.println("3. List of the dishes");
                System.out.println("4. Search a guest by his number");
                System.out.println("5. Exit");
                System.out.print("Write a number: ");

                int userChoice = sc.nextInt();

                switch (userChoice) {
                    case 1 -> {
                        do {
                            party.addGuest();
                            System.out.print("Would you like to add someone else? type yes or no: ");
                            addMore = sc.next();
                        } while (addMore.equals("yes"));
                    }
                    case 2 -> {
                        party.displayGuests();
                        System.out.println();
                    }
                    case 3 -> {
                        party.displayMeal();
                        System.out.print("Type yes to end, no to continue ");
                        end = sc.next();
                        if (end.equals("yes")) play = false;
                        else continue;
                    }
                    case 4 -> {
                        party.displayGuestByNumber();
                        System.out.print("Type yes to end, no to continue ");
                        end = sc.next();
                        if (end.equals("yes")) play = false;
                        else continue;
                    }
                    case 5 -> play = false;
                }

            }
        } catch (Exception e) {
            System.out.println("404 Something went wrong :/");
        }

    }


}