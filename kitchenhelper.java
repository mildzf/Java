public class KitchenHelper {
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
 public static void main(String[] args) {
    	// calling the method
        // Replace this argument with your own value
        
        spiceUpDish(5);
    }
}
