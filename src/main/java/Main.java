import java.time.LocalTime;

public class Main {
    public static void main(String[] args){

        //Below values are for testing

        LocalTime openingTime = LocalTime.parse("09:30:00");
        LocalTime closingTime = LocalTime.parse("23:00:00");
        Restaurant restaurant = new Restaurant("Amelie's cafe","Chennai",openingTime,closingTime);
        restaurant.addToMenu("Hakka Noodles",200);
        restaurant.addToMenu("Garlic Bread", 420);
    }
}
