/**
 * Created November 23, 2019
 *
 * By: Seyhan A. Cileli
 *
 * Github: HanSupreme
 *
 * "Spread Love!"
 *         - Sey'
 */

import java.util.Scanner;

public class MainRunner {

    static Scanner sc;
    static int userSelection = 0;

    public static void main(String[] args) {

    sc = new Scanner(System.in);

    mainMenu(); //calling main menu method
    buyMethod(); //calling buy method
    remaining(); //calling remaining method
    refill(); //calling refill method
    takeMoney(); //calling take money method
    CoffeeMachineFunctions.coffeeBrewing(); //coffee brewing method
    CoffeeMachineFunctions.brewingEspresso(); //brewing espresso method
    exit(); //exit method

}

    private static void mainMenu() {

        do {

            System.out.println("\n [ COFFEE MACHINE MENU  ] ");
            System.out.print("\n [ (1) Buy ]  [ (2) Fill ]  [ (3) Take ]  [ (4) Remaining ]  [ (5) Exit ] ");

            do {

                System.out.print(" \n [ SELECT OPTIONS ( 1 - 5 ) ] ");
                userSelection = sc.nextInt();
                System.out.println((userSelection < 1 || userSelection > 5) ? " INVALID ENTRY" : " ");

            } while (userSelection < 1 || userSelection > 5);

            switch (userSelection) {
                case 1:
                    System.out.println(" [ BUY ] ");
                    buyMethod();
                    break;
                case 2:
                    System.out.println("\n [ FILL ] ");
                    refill();
                    break;
                case 3:
                    System.out.println("\n [ TAKE ] ");
                    takeMoney();
                    break;
                case 4:
                    System.out.println("\n [ REMAINING ] ");
                    remaining();
                    break;
                case 5:
                    System.out.println("\n [ EXIT ] ");
                    exit();
                    break;
                default:
                    System.out.println("\n [ INVALID ENTRY ] ");
            }

        } while (userSelection != 5);

    } //mainMenu closing braces

    private static void buyMethod() {

        Scanner s = new Scanner(System.in);

        System.out.print
                ("\n [Select choice of coffee ] \n" +
                        " [ (1) Espresso ] [ (2) Latte ] [ (3) Cappuccino [ (4) MAIN MENU ] ] \n");

        String input = s.nextLine();
        int userCups;

        //here we'll ask the user for which coffee they'll like to select

        if (input.equals("1")) {
            System.out.print("How many cup(s) would you like? \n");
            userCups = sc.nextInt(); //prompt user input for the amount they wish to purchase
            CoffeeMachineFunctions.espresso(userCups);
            remaining(); }

        if (input.equals("2")) {
            System.out.print("How many cup(s) would you like? \n");
            userCups = sc.nextInt(); //prompt user input for the amount they wish to purchase
            CoffeeMachineFunctions.latte(userCups);
            remaining(); }

        if (input.equals("3")) {
            System.out.print("How many cup(s) would you like? \n");
            userCups = sc.nextInt(); //prompt user input for the amount they wish to purchase
            CoffeeMachineFunctions.cappuccino(userCups);
            remaining(); }

        if (input.equals("4")) {
            System.out.println("\n Back to Main Menu \n");
            mainMenu(); }

        if (userSelection < 1 && userSelection > 5){
            System.out.println("\n INVALID ENTRY \n");
        }
    }// closing braces for buyMethod

    public static void remaining () {

        System.out.println
                ("\n [ Current Coffee Machine Resources ] \n" +
                        Resources.totalWater +
                        " ml of water \n" +
                        Resources.totalMilk +
                        " ml of milk \n" +
                        Resources.totalCoffeeBeans +
                        " grams of coffee beans \n" +
                        Resources.totalCups +
                        " of disposable cups \n" +
                        "$" + Resources.totalMoney +
                        " \n");

    } // Assigned to --remaining method closing braces--

    public static void refill () {

        System.out.println("Please enter refill amount for each item below: ");

        System.out.print("\n How many ml of water: ");

        Resources.totalWater += sc.nextInt();

        System.out.print("\n How many ml of milk: ");

        Resources.totalMilk += sc.nextInt();

        System.out.print("\n How many grams of Coffee Beans: ");

        Resources.totalCoffeeBeans += sc.nextInt();

        System.out.println("\n How many cup(s): ");

        Resources.totalCups += sc.nextInt();

        System.out.println("\n [ New remaining resources ] ");
        remaining();


    } // Assigned to --refill method closing braces--

    public static void takeMoney () { //money added from user after buying coffee

        int takeMoney = Resources.totalMoney;
        int newBalance = Resources.totalMoney -= Resources.totalMoney;

        System.out.println
                ("You took $" + takeMoney + " From the Coffee Machine." +
                        " The new Coffee Machine balance $" + (newBalance));


    } //closing braces takeMoney method

    public static void exit () {

        System.exit(0);

    }

}