public class KitchenHelper {
public static double calculateIngredientQuantity(int servings, double originalQuantity)
    {
        // Your code here!
        // Calculate the adjusted ingredient quantity
        double totalQuantity = servings * originalQuantity;

        // replace 0.0 with the adjusted quantity
        return totalQuantity;
    }
    
    public static void main(String[] args) {
        // Calling the method
       // Replace the arguments with your own values

        double newQuantity = calculateIngredientQuantity(4, 8.6);
        System.out.println("The adjusted ingredient quantity is: " + newQuantity);

    }

public static void spiceUpDish(int spiceLevel)
    {
        // Your code here!
        int level = spiceLevel;

        switch(level){
            case 1:
                System.out.println("Some paprika should do");
                break;
            case 2:
                System.out.println("Add some hot garlic and basil");
                break;
            case 3:
                System.out.println("Some seasoning peppers will do the trick");
                break;
            case 4:
                System.out.println("Now we bring out the habaneros");
                break;
            case 5:
                System.out.println("Add some scotch bonnet peppers");
        }
    }


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
        // calling the methods with different arguments

        // Replace these arguments with your own values
        double newQuantity = calculateIngredientQuantity(0, 0.0);
        spiceUpDish(0);
        greetGuest("guest", "time");
    }
