package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfCups = 0;
        int mlOfWater = 0;
        int mlOfMilk = 0;
        int grOfCoffee = 0;

        System.out.println("Write how many cups of coffee you will need:");
        numOfCups = scanner.nextInt();
        mlOfWater = 200 * numOfCups;
        mlOfMilk = 50 * numOfCups;
        grOfCoffee = 15 * numOfCups;

        System.out.printf("For %d cups of coffee you will need:%n", numOfCups);
        System.out.printf("%d ml of water%n", mlOfWater);
        System.out.printf("%d ml of milk%n", mlOfMilk);
        System.out.printf("%d g of coffee beans%n", grOfCoffee);
    }
}
