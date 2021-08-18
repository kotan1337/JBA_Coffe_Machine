package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        final int WATER = 200;
        final int MILK = 50;
        final int COFFEE = 15;

        Scanner scanner = new Scanner(System.in);
        int numOfCups;
        int mlOfWater;
        int mlOfMilk;
        int grOfCoffee;
        int cupsByWater;
        int cupsByMilk;
        int cupsByCoffee;
        int minCups;

        System.out.printf("Write how many ml of water the coffee machine has:%n");
        mlOfWater = Integer.parseInt(scanner.next());
        System.out.printf("Write how many ml of milk the coffee machine has:%n");
        mlOfMilk = Integer.parseInt(scanner.next());
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        grOfCoffee = Integer.parseInt(scanner.next());
        System.out.println("Write how many cups of coffee you will need:");
        numOfCups = Integer.parseInt(scanner.next());

        cupsByWater = mlOfWater / WATER;
        cupsByMilk = mlOfMilk / MILK;
        cupsByCoffee = grOfCoffee / COFFEE;

        minCups = Math.min(cupsByWater, Math.min(cupsByMilk, cupsByCoffee));

        if (minCups < numOfCups) {
            System.out.printf("No, I can make only %d cup(s) of coffee%n", minCups);
        } else if (minCups == numOfCups) {
            System.out.printf("Yes, I can make that amount of coffee%n");
        } else {
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)%n",
                    minCups - numOfCups);
        }
    }
}
