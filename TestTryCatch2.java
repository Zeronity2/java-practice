import java.util.*;

class BakerySalesManagerUtil {
    public static void processSales(Scanner scanner) {
        try {
            int d = Integer.parseInt(scanner.nextLine().trim());
            if (d < 1 || d > 30) {
                throw new IllegalArgumentException("Error: Number of days sales must be between 1 and 30");
            }
            int[] sales = new int[d];
            for (int i = 0; i < d; i++) {
                sales[i] = Integer.parseInt(scanner.nextLine().trim());
            }
            int index = Integer.parseInt(scanner.nextLine().trim());
            int newValue = Integer.parseInt(scanner.nextLine().trim());
            if (index < 0 || index >= d) {
                throw new ArrayIndexOutOfBoundsException("Error: Invalid index. Please provide a valid day number");
            }
            System.out.println(sales[index]);
            sales[index] = newValue;
            System.out.println(sales[index]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integer sales amounts");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}

class BakerySalesManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BakerySalesManagerUtil.processSales(scanner);
        scanner.close();
    }
}