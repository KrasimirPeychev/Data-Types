package Example;

import java.util.Scanner;

public class Beers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double bottleLitres = 0.5;
        double totalBeerLitres = Double.parseDouble(input);

        double bottlesFloatingPoint = totalBeerLitres / bottleLitres;
        int bottles = (int)bottlesFloatingPoint;

        System.out.printf("Total: %d bottles%n", bottles);
        System.out.printf("Remaining unbottled: %.2f litres", totalBeerLitres - bottles * bottleLitres);
    }
}
