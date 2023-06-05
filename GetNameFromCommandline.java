public class GetNameFromCommandline {
    public static void main(String[] args) {
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Name: " + name);
        } else {
            System.out.println("No name provided.");
        }
    }
}
