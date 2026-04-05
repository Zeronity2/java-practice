import java.util.*;

class SpeedUtil {
    public static void calculateSpeed(double distance, double time) {
        try {
            if (distance < 0.0 || distance > 10000.0) {
                throw new Exception("Distance is out of range");
            }
            if (time <= 0.0) {
                throw new Exception("Time must be positive");
            }
            double speed = distance / time;
            if (speed <= 0.0) {
                throw new Exception("Calculated speed must be greater than zero");
            }
            System.out.printf("%.2f\n", speed);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class SpeedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine().trim());
        for (int i = 0; i < testCases; i++) {
            try {
                String[] input = scanner.nextLine().trim().split(" ");
                double distance = Double.parseDouble(input[0]);
                double time = Double.parseDouble(input[1]);
                SpeedUtil.calculateSpeed(distance, time);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format: For input string: \"" + scanner.nextLine() + "\"");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}