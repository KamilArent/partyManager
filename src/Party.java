import java.util.*;

public class Party {
    private List<Guest> guests = new ArrayList<>();
    private Set<String> meals = new HashSet<>();
    private HashMap<Integer, Guest> phoneToGuest = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    public void addGuest() {
        System.out.print("Tell me your name: ");
        String name = sc.next();


        System.out.print("Tell me your meal: ");
        String meal = sc.next();

        System.out.print("Type your phone number: ");
        int number = sc.nextInt();

        System.out.print("Are you a vegan? ");
        String isVeg = sc.next();
        boolean isVegan;
        if (isVeg.equals("yes")) {
            isVegan = true;
        } else {
            isVegan = false;
        }

        Guest guest = new Guest(name, number, meal, isVegan);

        meals.add(meal);
        phoneToGuest.put(number, guest);
        guests.add(guest);
    }

    public void displayGuests() {
        for (Guest guest : guests) {
            guest.displayGuests();
        }
    }

    public void displayMeal(){
        for(String meal : meals){
            System.out.println(meal);
        }
    }

    public void displayGuestByNumber(){
        System.out.print("Type the phone number to find a guest: ");
        Integer number = sc.nextInt();
        Guest guest = (phoneToGuest.get(number));
        guest.displayGuests();
    }

}
