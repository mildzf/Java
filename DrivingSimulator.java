import java.util.Scanner;

public class DrivingSimulator {
    public static void main(String[] args) {

        // TODO 1: Declare the necessary variables for the car's state and add scanner object
        boolean isEngineOn = false;
        String gear = "P";
        int speed = 0;
        int choice = 0;
        Scanner keyboard = new Scanner(System.in);


        // TODO 2: Display the current state of the car (engine state, gear, speed)




        // TODO 5: Implement a switch statement to handle the different menu choices
        while (choice!=5) {
            if (isEngineOn){
                System.out.println("The engine is on");
                System.out.println("The car is currently in " + gear + " gear");
                System.out.println("The car is moving at " + speed + " MPH");
            }else {
                System.out.println("The car is currently off");
            }
            // TODO 3: Add print statements for each variable you want to display or options available to the user
            System.out.println("What would you like to do next");
            System.out.println("Please select from the menu options below");
            System.out.println("1. Turn on/off the engine");
            System.out.println("2. Change gear (P, D, R)");
            System.out.println("3. Accelerate");
            System.out.println("4. Brake");
            System.out.println("5. Exit");

            // TODO 4: Prompt the user for their choice and store it in the 'choice' variable
            System.out.print("Enter your choice: ");
            choice = keyboard.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    isEngineOn = !isEngineOn;
                    break;
                case 2:
                    if (isEngineOn){
                        System.out.print("Enter gear (P, D, R)");
                        gear = keyboard.next();
                    }else {
                        System.out.println("Start the car first");
                        break;
                    }
                    break;
                case 3:
                    if (isEngineOn && !gear.equals("P")) {
                        speed += 10;
                    } else {
                        System.out.println("Cannot accelerate while engine is off or in P gear");
                    }
                    break;
                case 4:
                    if (isEngineOn && !gear.equals("P") && speed > 0) {
                        if (speed < 10) {
                            speed = 0;
                        } else {
                            speed -= 10;
                        }
                    } else {
                        System.out.println("The car is not moving. Braking has no effect");
                    }

            }
        }
        System.out.println("The simulator is shutting down.");

        // TODO 6: Make sure the program runs until the user decides it's time to stop. Consider enclosing TODO 2 -> TODO 5 above in a while loop!


    }
}
