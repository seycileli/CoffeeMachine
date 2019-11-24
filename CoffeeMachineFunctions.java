import java.util.Scanner;

public class CoffeeMachineFunctions extends Resources {

    public static void espresso(int userCups) {

        if (Resources.espressoWater * userCups > Resources.totalWater) {
            //checks if there is enough water
            System.out.println("Not enough ml of Water. Please refill.");
        }
        if (Resources.espressoBeans * userCups > Resources.totalCoffeeBeans) {
            //checks if there is enough coffee beans
            System.out.println("Not enough Grams of Coffee Beans. Please refill.");
        }
        if (userCups > Resources.totalCups) {
            //checks if there is enough cups
            System.out.println("Not enough cups. Please refill");
        }
        // if there's enough resource to make the desire amount
        if (Resources.espressoWater * userCups < Resources.totalWater &&
                Resources.espressoBeans * userCups < Resources.totalCoffeeBeans
                && userCups < Resources.totalCups) {
            brewingEspresso();

            // calculating and updating the values, will subtract from the resources
            Resources.totalWater -= Resources.espressoWater;
            Resources.totalCoffeeBeans -= Resources.espressoBeans;
            Resources.totalCups -= userCups;
            Resources.totalMoney += Resources.espressoCost;
            //will add to totalMoney value

        } //closing braces for IF statement

    } //espresso method closing loop braces

    public static void latte(int userCups) {

        if (Resources.latteWater * userCups > Resources.totalWater) {
            //checks if there is enough water
            System.out.println("Not enough ml of Water. Please refill.");
        }
        if (Resources.latteMilk * userCups > Resources.totalMilk) {
            //checks if there is enough coffee beans
            System.out.println("Not enough ml of Milk. Please refill.");
        }
        if (Resources.latteBeans * userCups > Resources.totalCoffeeBeans) {
            //checks if there is enough coffee beans
            System.out.println("Not enough Grams of Coffee Beans. Please refill.");
        }
        if (userCups > Resources.totalCups) {
            //checks if there is enough cups
            System.out.println("Not enough cups. Please refill.");
        }
        if (Resources.latteWater * userCups < Resources.totalWater &&
                Resources.latteMilk * userCups < Resources.totalMilk &&
                Resources.latteBeans * userCups < Resources.totalCoffeeBeans
                && userCups < Resources.totalCups) {
            coffeeBrewing();

            // calculating and updating the values, will subtract from the resources
            Resources.totalWater -= Resources.latteWater;
            Resources.totalMilk -= Resources.latteMilk;
            Resources.totalCoffeeBeans -= Resources.latteBeans;
            Resources.totalCups -= userCups;
            Resources.totalMoney += Resources.latteCost;
            //will add to totalMoney value

        } //closing braces for IF statement

    } //latte method closing loop braces

    public static void cappuccino(int userCups) {

        if (Resources.cappuccinoWater * userCups > Resources.totalWater) { //checks if there is enough water
            System.out.println("Not enough ml of Water. Please refill.");
        }
        if (Resources.cappuccinoMilk * userCups > Resources.totalMilk) { //checks if there is enough coffee beans
            System.out.println("Not enough ml of Milk. Please refill.");
        }
        if (Resources.cappuccinoBeans * userCups > Resources.totalCoffeeBeans) {
            //checks if there is enough coffee beans
            System.out.println("Not enough Grams of Coffee Beans. Please refill.");
        }
        if (userCups > Resources.totalCups) {
            //checks if there is enough cups
            System.out.println("Not enough cups. Please refill.");
        }
        if (Resources.cappuccinoWater * userCups < Resources.totalWater
                && Resources.cappuccinoMilk * userCups < Resources.totalMilk
                && Resources.cappuccinoBeans * userCups < Resources.totalCoffeeBeans
                && userCups < Resources.totalCups) {
            coffeeBrewing();

            // calculating and updating the values, will subtract from the resources
            Resources.totalWater -= Resources.cappuccinoWater;
            Resources.totalMilk -= Resources.cappuccinoMilk;
            Resources.totalCoffeeBeans -= Resources.cappuccinoBeans;
            Resources.totalCups -= userCups;
            Resources.totalMoney += Resources.cappuccinoCost;
            //will add to totalMoney value

        } //closing braces for IF statement

    } //latte method closing loop braces

    public static void coffeeBrewing () {

        // Stage #1: Hello, Coffee!

                /*
        First, we will print out the standard output of what our coffee machine is doing.
        We will use the "System.out.println" statement in the Java language to print out our message
                */

        System.out.println
                ("\n Starting to make coffee" +
                        "\n Grinding coffee beans" +
                        "\n Boiling water" +
                        "\n Mixing boiled water with crushed coffee beans" +
                        "\n Pouring coffee into the cup" +
                        "\n Pouring some milk into the cup" +
                        "\n Coffee is ready!");


    } // Assigned to --coffeeBrewing method closing braces--

    public static void brewingEspresso () {

        // Stage #1: Hello, Coffee!

                /*
        First, we will print out the standard output of what our coffee machine is doing.
        We will use the "System.out.println" statement in the Java language to print out our message
                */

        System.out.println
                ("\n Starting to make coffee" +
                        "\n Grinding coffee beans" +
                        "\n Boiling water" +
                        "\n Mixing boiled water with crushed coffee beans" +
                        "\n Pouring coffee into the cup" +
                        "\n Coffee is ready!");

    } // Assigned to --brewingCoffee method closing braces--
}
