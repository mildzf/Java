/**
 * The GreetGuest class contains a simple method for greeting a guest
 * based on their name and the time of day.
 */
public class GreetGuest {
    public static void greetGuest(String name, String timeOfDay)
    {
        String message = "";
        if (timeOfDay.equalsIgnoreCase("morning")){
            message = "morning";              
        } else if (timeOfDay.equalsIgnoreCase("afternoon")){
            message = "afternoon";
        } else if (timeOfDay.equalsIgnoreCase("evening")){
            message = "evening";
        } else {
            ;
        }
        System.out.println("Hi " + name + ", good " + message);
    }

    public static void main(String[] args) {
    	// calling the method
        // Replace these arguments with your own values
        
        greetGuest("Harry", "Morning");
    }
}
