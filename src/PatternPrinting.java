import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            // Print n stars horizontally separated by spaces
            for (int i = 0; i < n; i++) {
                System.out.print("*");
                if (i < n - 1) {
                    System.out.print(" ");
                }
            }
            // Move to the next line after the horizontal row
            System.out.println();

            // Print n stars vertically, each on a new line
            for (int i = 0; i < n; i++) {
                System.out.println("*");
            }
        }
        scanner.close();
    }
}