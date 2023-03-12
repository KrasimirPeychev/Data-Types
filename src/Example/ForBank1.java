package Example;

import java.math.BigDecimal;
import java.util.Scanner;

public class ForBank1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal a = new BigDecimal(scanner.nextLine());
        BigDecimal b = new BigDecimal(scanner.nextLine());

        BigDecimal result = a.add(b);
        System.out.println(a);
        System.out.println("+");
        System.out.println(b);
        System.out.println("=");
        System.out.println(result);
    }
}
