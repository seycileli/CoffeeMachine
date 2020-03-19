import java.util.Scanner;

public class coffee {

    static int water = 1200; //default value of amount of water in Coffee Machine
    static int espressoWater = 250; //cost of espresso water per cup
    static int latteWater = 350; //cost of latte water per cup
    static int cappuccinoWater = 200; //cost of cappuccino water per cup
    static int totalWater = water; // updated value of total water per use

    static int milk = 540; //default value of amount of milk in Coffee Machine
    static int latteMilk = 75; //cost of latte milk per cup
    static int cappuccinoMilk = 100; //cost of cappuccino milk per cup
    static int totalMilk = milk; // updated value of total milk per use

    static int coffeeBeans = 120; //default value of amount of coffee beans in Coffee Machine
    static int espressoBeans = 16; //cost of espresso coffee beans per cup
    static int latteBeans = 20; //cost of latte coffee beans per cup
    static int cappuccinoBeans = 12; //cost of cappuccino coffee beans per cup
    static int totalCoffeeBeans = coffeeBeans; // updated value of total coffee beans per use

    static int money = 550; //default value of amount of money in Coffee Machine
    static int espressoCost = 4; //cost of espresso coffee per cup
    static int latteCost = 7; //cost of latte coffee per cup
    static int cappuccinoCost = 6; //cost of cappuccino coffee per cup
    static int totalMoney = money; // updated value of total money per use

    static int cups = 10; //default value of amount of cups with Coffee Machine
    static int totalCups = cups; // updated value of cups per use

    static Scanner sc; //receive user input
    static int userSelection = 0; //coffee machine choice selection which is 1 through 5

    public static void main(String[] args) {

        sc = new Scanner(System.in);

        // Mini Project Name: Coffee Machine Mini Project

        mainMenu(); //calling main menu method
        buyMethod(); //calling buy method
        remaining(); //calling remaining method
        refill(); //calling refill method
        takeMoney(); //calling take money method
        coffeeBrewing(); //coffee brewing method
        brewingEspresso(); //brewing espresso method
        exit(); //exit method

    }

    private static void mainMenu() {

        do {

            System.out.println("\n [ COFFEE MACHINE MENU  ] ");
            System.out.print("\n [ (1) satin ]  [ (2) doldur ]  [ (3) almak ]  [ (4) kalan ]  [ (5) cikis  ] ");

            do {

                System.out.print(" \n [ SELECT OPTIONS ( 1 - 5 ) ] ");
                userSelection = sc.nextInt();
                System.out.println((userSelection < 1 || userSelection > 5) ? " INVALID ENTRY" : " ");

            } while (userSelection < 1 || userSelection > 5);

            switch (userSelection) {
                case 1:
                    System.out.println(" [ satin  ] ");
                    buyMethod();
                    break;
                case 2:
                    System.out.println("\n [ doldur] ");
                    refill();
                    break;
                case 3:
                    System.out.println("\n [ almak ] ");
                    takeMoney();
                    break;
                case 4:
                    System.out.println("\n [ kalan ] ");
                    remaining();
                    break;
                case 5:
                    System.out.println("\n [ cikis ] ");
                    exit();
                    break;
                default:
                    System.out.println("\n [ INVALID ENTRY ] ");
            }

        } while (userSelection != 5);

        //return; // unnecessary return

    } //mainMenu closing braces

    private static void buyMethod() {

        Scanner s = new Scanner(System.in);

        System.out.print
                ("\n [Select choice of coffee ] \n" +
                        " [ (1) Espresso ] [ (2) Latte ] [ (3) Cappuccino [ (4) MAIN MENU ] ] \n");

        String input = s.nextLine();
        //sc.nextInt();
        int userCups;

        //here we'll ask the user for which coffee they'll like to select


        if (input.equals("1")) {
            System.out.print("kac fincan kahve isterseniz? \n");
            userCups = sc.nextInt(); //prompt user input for the amount they wish to purchase

            espresso(userCups);
            remaining(); }

        if (input.equals("2")) {
            System.out.print("kac fincan kahve istersiniz? \n");
            userCups = sc.nextInt(); //prompt user input for the amount they wish to purchase

            latte(userCups);
            remaining(); }

        if (input.equals("3")) {
            System.out.print("kac fincan turk kahvesi istersiniz? \n");
            userCups = sc.nextInt(); //prompt user input for the amount they wish to purchase

            cappuccino(userCups);
            remaining(); }

        if (input.equals("4")) {
            System.out.println("\n menuye geri don  \n");
            mainMenu(); }

        if (userSelection < 1 && userSelection > 5){
            System.out.println("\n gecersiz girdi \n");
        }


    }// closing braces for buyMethod

    public static void remaining () {

        /*
        This method will the remaining value, whether the coffee machine has been filled
        or has been being used
         */

        System.out.println
                ("\n [ mevcut kahve makinasi kaynaklari  ] \n" +
                        totalWater +
                        " suyun kalan litesi  \n" +
                        totalMilk +
                        "  sutun kalan litresi \n" +
                        totalCoffeeBeans +
                        " kalan  kahve cekirdekleri \n" +
                        totalCups +
                        " tek kullanimlik bardak  \n" +
                        "$" + totalMoney +
                        " \n");

    } // Assigned to --remaining method closing braces--

    public static void refill () {

        /*
        the value of each item below are the default amount
        that is the amount we will use when a user wants to refill our coffee machine
         */

        System.out.println("lutfen aşağıdaki her bir öğe icin dolum miktarini girin ");

        System.out.print("\n kac lt su :? ");

        totalWater += sc.nextInt();

        System.out.print("\n kac lt sut : ?");

        totalMilk += sc.nextInt();

        System.out.print("\n kac gram kahve Çekirdeği:? ");

        totalCoffeeBeans += sc.nextInt();

        System.out.println("\n ne kadar bardak(s)?: ");

        totalCups += sc.nextInt();

        System.out.println("\n [ kalan yeni kaynaklar  ] ");
        remaining();


    } // Assigned to --refill method closing braces--

    public static void takeMoney () { //money added from user after buying coffee

        /*
        The value of total money will be taken when user calls this method
         */

        int takeMoney = totalMoney; //current value of money in coffee machine, which is what user will take
        int newBalance = totalMoney -= totalMoney; //new balance after user receives value of total money

        System.out.println
                ("sen bu kadar para aldin " + takeMoney + " sen kac para aldin kahve makinasindan " +
                        " yeni kahve makinasi dengesi" + (newBalance));


    } //closing braces takeMoney method

    public static void exit () {

        //this method will terminate the program

        System.exit(0);

    }

    public static void espresso( int userCups ) {

        int newEspressoCost = (espressoCost * userCups);
        int newEspressoWater = espressoWater * userCups;
        int newEspressoCoffeeBeans = espressoBeans * userCups;

        if (espressoWater * userCups > totalWater) { //checks if there is enough water
            System.out.println("yeterli lt su yok lutfen doldurun ");
        }
        if (espressoBeans * userCups > totalCoffeeBeans) { //checks if there is enough coffee beans
            System.out.println("kahve cekirdekleri yetersiz lutfen doldurun .");
        }
        if (userCups > totalCups) { //checks if there is enough cups
            System.out.println("yeterli bardak yok lutfen doldurun ");
        }
        // if there's enough resource to make the desire amount
        if (espressoWater * userCups < totalWater && espressoBeans * userCups < totalCoffeeBeans
                && userCups < totalCups) {
            brewingEspresso();

            // calculating and updating the values, will subtract from the resources

            totalWater -= newEspressoWater;
            totalCoffeeBeans -= newEspressoCoffeeBeans;
            totalCups -= userCups;
            totalMoney += newEspressoCost; //will add to totalMoney value

        } //closing braces for IF statement

    } //espresso method closing loop braces

    public static void latte( int userCups ) {

        int newLatteCost = (latteCost * userCups);

        int newLatteWater = latteWater * userCups;

        int newLatteMilk = latteMilk * userCups;

        int newLatteCoffeeBeans = latteBeans * userCups;

        if (latteWater * userCups > totalWater) { //checks if there is enough water
            System.out.println("yeterli lt su yok lutfen doldurun ");
        }
        if (latteMilk * userCups > totalMilk) { //checks if there is enough coffee beans
            System.out.println("yeterli lt sut yok lutfen doldurun .");
        }
        if (latteBeans * userCups > totalCoffeeBeans) { //checks if there is enough coffee beans
            System.out.println("yeterli gram kahve cekirdekleri yok lutfen doldurun .");
        }
        if (userCups > totalCups) { //checks if there is enough cups
            System.out.println("yeterli bardak yok lutfen doldurun.");
        }
        if (latteWater * userCups < totalWater && latteMilk * userCups < totalMilk &&
                latteBeans * userCups < totalCoffeeBeans
                && userCups < totalCups) {
            coffeeBrewing();

            // calculating and updating the values, will subtract from the resources

            totalWater -= newLatteWater;
            totalMilk -= newLatteMilk;
            totalCoffeeBeans -= newLatteCoffeeBeans;
            totalCups -= userCups;
            totalMoney += newLatteCost; //will add to totalMoney value

        } //closing braces for IF statement

    } //latte method closing loop braces

    public static void cappuccino( int userCups) {

        int newCappuccinoCost = (cappuccinoCost * userCups);
        int newCappuccinoWater = cappuccinoWater * userCups;
        int newCappuccinoMilk = cappuccinoMilk * userCups;
        int newCappuccinoCoffeeBeans = cappuccinoBeans * userCups;

        if (cappuccinoWater * userCups > totalWater) { //checks if there is enough water
            System.out.println("yeterli lt su yok lutfen doldurun .");
        }
        if (cappuccinoMilk * userCups > totalMilk) { //checks if there is enough coffee beans
            System.out.println("yeterli lt sut yok lutfen doldurun .");
        }
        if (cappuccinoBeans * userCups > totalCoffeeBeans) { //checks if there is enough coffee beans
            System.out.println("kahve cekirdikleri yeterli gram degil lutfen doldurun .");
        }
        if (userCups > totalCups) { //checks if there is enough cups
            System.out.println("yeterli bardak yok lutfen doldurun .");
        }
        if (cappuccinoWater * userCups < totalWater && cappuccinoMilk * userCups < totalMilk &&
                cappuccinoBeans * userCups < totalCoffeeBeans
                && userCups < totalCups) {
            coffeeBrewing();

            // calculating and updating the values, will subtract from the resources

            totalWater -= newCappuccinoWater;
            totalMilk -= newCappuccinoMilk;
            totalCoffeeBeans -= newCappuccinoCoffeeBeans;
            totalCups -= userCups;
            totalMoney += newCappuccinoCost; //will add to totalMoney value

        } //closing braces for IF statement

    } //latte method closing loop braces

    public static void coffeeBrewing () {

        // Stage #1: Hello, Coffee!

                /*
        First, we will print out the standard output of what our coffee machine is doing.
        We will use the "System.out.println" statement in the Java language to print out our message
                */

        System.out.println
                ("\n kahve yapimina basla " +
                        "\n kahve cekirdeklerini Öğütme" +
                        "\n suyu kaynatmak" +
                        "\n kaynamis suyun ezilmis kavhe çekirdekleri ile karıştırılması" +
                        "\n kahveyi fincanin icine dokme" +
                        "\n sutu fincanin icine dokme" +
                        "\n Artik kahveni icebilirsin!");


        //return; // unnecessary return

    } // Assigned to --coffeeBrewing method closing braces--

    public static void brewingEspresso () {

        // Stage #1: Hello, Coffee!

                /*
        First, we will print out the standard output of what our coffee machine is doing.
        We will use the "System.out.println" statement in the Java language to print out our message
                */

        System.out.println
                ("\n kahve yapmaya basla" +
                        "\n kahve cekirdeklerini öğütme" +
                        "\n suyu kaynat" +
                        "\n Haslanmis suyun ezilmis kahve çekirdekleri ile kaynatilmasi " +
                        "\n kahveyi fincanin icine dok" +
                        "\n Artik kahven hazir !");


        //return; // unnecessary return

    } // Assigned to --brewingCoffee method closing braces--

} // closing main method braces
