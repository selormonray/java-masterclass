public class Main {
    public static void main(String[] args) {
        printInformation("Hello World!");
        printInformation("");
        printInformation("\t \n");
    }

    public static void printInformation(String string) {

        int length = string.length();

        if (string.isEmpty()) {
            System.out.println("String is empty");
            return;
        }

        if (string.isBlank()) {
            System.out.println("String is blank");
        }

        System.out.printf("Length = %d %n", length);
        System.out.printf("First char = %c %n", string.charAt(0));

        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }
}