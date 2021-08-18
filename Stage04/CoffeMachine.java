package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static int water;
    static int milk;
    static int coffee;
    static int cups;
    static int money;

    public static void main(String[] args) {
        initState();
        printState();
        makeChoice();
        printState();
    }

    private static void makeChoice() {
        Scanner scanner = new Scanner(System.in);
        String action;
        System.out.println("Write action (buy, fill, take):");
        action = scanner.nextLine();
        switch (action) {
            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            default:
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
        int choice;

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                water -= 250;
                coffee -= 16;
                money += 4;
                cups -= 1;
                break;
            case 2:
                water -= 350;
                milk -= 75;
                coffee -= 20;
                money += 7;
                cups -= 1;
                break;
            case 3:
                water -= 200;
                milk -= 100;
                coffee -= 12;
                money += 6;
                cups -= 1;
                break;
            default:
                break;
        }
    }

    public static void initState() {
        water = 400;
        milk = 540;
        coffee = 120;
        cups = 9;
        money = 550;
    }

    public static void printState() {
        System.out.printf("The coffee machine has:%n");
        System.out.printf("%d ml of water%n", water);
        System.out.printf("%d ml of milk%n", milk);
        System.out.printf("%d g of coffee beans%n", coffee);
        System.out.printf("%d disposable cups%n", cups);
        System.out.printf("$%d of money%n", money);
    }
}
