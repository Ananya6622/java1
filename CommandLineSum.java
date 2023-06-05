public class CommandLineSum {
    public static void main(String[] args) {
        int sum = 0;
        int invalidCount = 0;

        for (String arg : args) {
            try {
                int number = Integer.parseInt(arg);
                sum += number;
            } catch (NumberFormatException e) {
                invalidCount++;
            }
        }

        System.out.println("Sum of valid integers: " + sum);
        System.out.println("Invalid integers entered: " + invalidCount);
    }
}
