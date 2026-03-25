import java.util.Scanner;

class Solution {

    static class PatternPrinter {

        void printPattern(int n) {

            for (int i = 1; i <= n; i++) {

                // Print spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }

                // Print numbers
                for (int j = 1; j <= i; j++) {

                // Avoid trailing space
                    if (j == i)
                        System.out.print(j);
                    else
                        System.out.print(j + " ");
                }

                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PatternPrinter obj = new PatternPrinter();
        obj.printPattern(n);
    }
}