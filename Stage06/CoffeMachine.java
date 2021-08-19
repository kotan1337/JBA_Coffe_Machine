package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static int water;
    static int milk;
    static int coffee;
    static int cups;
    static int money;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String action = "";
        initState();

        while (!"exit".equals(action)) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = scanner.nextLine();
            CoffeeMachine.makeChoice(action);
        }
    }

    private static void makeChoice(String action) {
        switch (action) {
            case "buy":
                buy();
                System.out.println();
                break;
            case "fill":
                fill();
                System.out.println();
                break;
            case "take":
                take();
                System.out.println();
                break;
            case "remaining":
                remaining();
                System.out.println();
                break;
            case "exit":
                break;
            default:
                System.out.println("Unknown option");
                System.out.println();
                break;
        }
    }

    private static void take() {
        System.out.printf("I gave you $%d%n", money);
        money = 0;
    }

    private static void fill() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write how many ml of water you want to add:");
        water += sc.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        milk += sc.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        coffee += sc.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        cups += sc.nextInt();
    }

    private static void buy() {
        Scanner sc = new Scanner(System.in);
        String choice;

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        choice = sc.nextLine();

        switch (choice) {
            case "1":
                espresso();
                break;
            case "2":
                latte();
                break;
            case "3":
                cappuccino();
                break;
            case "back":
                break;
            default:
                System.out.println("Unknown option");
                break;
        }
    }

    private static void cappuccino() {
        if (water >= 200 && milk >= 100 && coffee >= 12 && cups >= 1) {
            water -= 200;
            milk -= 100;
            coffee -= 12;
            money += 6;
            cups -= 1;
            System.out.println("I have enough resources, making you a coffee!");
        } else {
            if (water < 200) {
                System.out.println("Sorry, not enough water!");
            }

            if (milk < 100) {
                System.out.println("Sorry, not enough milk!");
            }

            if (coffee < 12) {
                System.out.println("Sorry, not enough coffee!");
            }

            if (cups < 1) {
                System.out.println("Sorry, not enough cups!");
            }
        }
    }

    private static void latte() {
        if (water >= 350 && milk >= 75 && coffee >= 20 && cups >= 1) {
            water -= 350;
            milk -= 75;
            coffee -= 20;
            money += 7;
            cups -= 1;
            System.out.println("I have enough resources, making you a coffee!");
        } else {
            if (water < 350) {
                System.out.println("Sorry, not enough water!");
            }

            if (milk < 75) {
                System.out.println("Sorry, not enough milk!");
            }

            if (coffee < 20) {
                System.out.println("Sorry, not enough coffee!");
            }

            if (cups < 1) {
                System.out.println("Sorry, not enough cups!");
            }
        }
    }

    private static void espresso() {
        if (water >= 250 && coffee >= 16 && cups >= 1) {
            water -= 250;
            coffee -= 16;
            money += 4;
            cups -= 1;
            System.out.println("I have enough resources, making you a coffee!");
        } else {
            if (water < 250) {
                System.out.println("Sorry, not enough water!");
            }

            if (coffee < 16) {
                System.out.println("Sorry, not enough coffee!");
            }

            if (cups < 1) {
                System.out.println("Sorry, not enough cups!");
            }
        }
    }

    public static void initState() {
        water = 400;
        milk = 540;
        coffee = 120;
        cups = 9;
        money = 550;
    }

    public static void remaining() {
        System.out.printf("The coffee machine has:%n");
        System.out.printf("%d ml of water%n", water);
        System.out.printf("%d ml of milk%n", milk);
        System.out.printf("%d g of coffee beans%n", coffee);
        System.out.printf("%d disposable cups%n", cups);
        System.out.printf("$%d of money%n", money);
    }
}
