package Example;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(input);


        for (int i = 0; i < n; i++) {
            int number = i;
            int sum = 0;
            while (number > 0){
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }
            boolean isSpecial = sum == 5 || sum == 7 || sum == 11;
            System.out.println(isSpecial);

        }
    }
}
