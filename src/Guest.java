public class Guest {
    private String name;
    private int number;
    private String meal;
    private boolean isVegan;

    public Guest(String name, int number, String meal, boolean isVegan) {
        this.name = name;
        this.number = number;
        this.meal = meal;
        this.isVegan = isVegan;
    }

    public void displayGuests(){
        System.out.println("Name: " + name);
        System.out.println("Meal: " + meal);
        System.out.println("Phone number: " + number);
        String isVeganString = isVegan ? "tak" : "nie";
        System.out.println("Veganin: " + isVeganString);
        System.out.println();
    }

}
