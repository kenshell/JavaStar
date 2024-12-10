import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Press A to use for-loop or B for while-loop: ");
        String choice = sc.nextLine();

        // Initialize variables for the results
        int resultA = 0;
        int resultB = 0;

        if (choice.equalsIgnoreCase("A")) {
            SuperStar(sc);  // Calling SuperStar method
        } else if (choice.equalsIgnoreCase("B")) {
            whileLoop(sc);  // Calling whileLoop method
        }
    }

    // SuperStar method to demonstrate a for-loop (does not return anything)
    public static void SuperStar(Scanner sc)
    {
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.print("Enter Symbol: ");
        char c = sc.next().charAt(0);

        // Loop to print a pattern
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Print symbols
            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    // whileLoop method to demonstrate a while-loop (does not return anything)
    public static void whileLoop(Scanner sc)
    {
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.print("Enter Symbol: ");
        char c = sc.next().charAt(0);

        int i = 1;
        while (i <= n) {
            // Print leading spaces
            int j = 0;
            while (j++ < n - i) {
                System.out.print(" ");
            }
            // Print symbols
            j = 0;
            while (j++ < (i * 2) - 1) {
                System.out.print(c);
            }
            System.out.println();
            i++;
        }
    }
}
