public class StaticDemo {
    static int count = 0;

    static {
        System.out.println("Static block executed.");
    }

    static void incrementCount() {
        count++;
    }

    public static void main(String[] args) {
        System.out.println("Initial count: " + count);

        // Calling the static method
        incrementCount();

        System.out.println("Updated count: " + count);
    }
}
