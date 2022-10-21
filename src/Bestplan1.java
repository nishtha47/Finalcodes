import java.util.Scanner;

public class Bestplan1 {

    private static Scanner input;

    public static void main(String[] args) {

        input = new Scanner(System.in);
        System.out.println("We have the following services:");
        System.out.println("Voice, Database, Admin, Email");
        System.out.println("How many services would you like?");

        // input number of services
        int choice = input.nextInt();

        // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // Logic starts here
        // when number of services required is 1
        switch (choice) {
            case 1:
                Scanner input1 = new Scanner(System.in);
                System.out.println("What type of services would you like?");
                System.out.println("1. Voice");
                System.out.println("2. Database");
                System.out.println("3. Admin");
                System.out.println("4. Email");

                // input 1 option
                int choice1 = input1.nextInt();

                switch (choice1) {
                    case 1:
                        System.out.println("$100");
                        break;
                    case 2:
                        System.out.println("$135");
                        break;
                    case 3:
                        System.out.println("$125");
                        break;
                    case 4:
                        System.out.println("$100");
                        break;

                    default:
                        System.out.println("Invalid option. Please try again");

                }
                break;

            // when number of services required is 2
            case 2:
                Scanner input2 = new Scanner(System.in);
                System.out.println("What type of services would you like?");
                System.out.println("1. Voice");
                System.out.println("2. Database");
                System.out.println("3. Admin");
                System.out.println("4. Email");

                // input 2 options
                int choice2 = input2.nextInt();
                int choice3 = input2.nextInt();

                // plan(1,4) -> $100
                if (choice2 == 1 && choice3 == 4) {
                    System.out.println("$100");

                    // plan(1,3) -> $125
                } else if (choice2 == 1 && choice3 == 3) {
                    System.out.println("$125");

                    // plan(2,3) & (3,4) -> $125
                } else if ((choice2 == 2 && choice3 == 3) || (choice2 == 3 && choice3 == 4)) {
                    System.out.println("$150");

                } else
                    System.out.println("Invalid option. Please try again");

                break;

            // when number of services required is 3
            case 3:
                Scanner input3 = new Scanner(System.in);
                System.out.println("what is the file path");
                String choicefile = input3.nextLine();

                //nput3.nextLine()
                System.out.println("What type of services would you like?");
                System.out.println("1. Voice");
                System.out.println("2. Database");
                System.out.println("3. Admin");
                System.out.println("4. Email");
                input3.useDelimiter("([,\\n])");
                // input 3 options
                int choice4 = input3.nextInt();
                int choice5 = input3.nextInt();
                int choice6 = input3.nextInt();

                // plan(1,3,4) -> $225
                if (choice4 == 1 && choice5 == 3 && choice6 == 4) {
                    System.out.println("$225");

                    // plan(1,2,3) -> $235
                } else if (choice4 == 1 && choice5 == 2 && choice6 == 3) {
                    System.out.println("$325");

                    // plan(2,3,4) -> $150
                } else if (choice4 == 2 && choice5 == 3 && choice6 == 4) {
                    System.out.println("$150");

                } else
                    System.out.println("Invalid option. Please try again");

                break;

            // when number of services required is all 4
            case 4:
                System.out.println("All 4 services will cost $250");
                break;

            default:
                System.out.println("Invalid input.");

        }
    }
}