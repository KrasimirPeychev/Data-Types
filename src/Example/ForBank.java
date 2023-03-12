package Example;

import java.math.BigDecimal;
import java.util.Scanner;

public class ForBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        BigDecimal bigDecimal = new BigDecimal(line);

        BigDecimal result = bigDecimal.multiply(new BigDecimal(2));

        System.out.println(result);
    }
}
