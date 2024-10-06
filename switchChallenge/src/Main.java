public class Main {
    public static void main(String[] args) {

        char alphabet = 'T';
        switchChallenge(alphabet);
    }

    public static String switchChallenge(char alphabet) {
        String natoName = "";
        switch (alphabet) {
            case 'A':
                System.out.println(alphabet + " is Able");
                break;
            case 'B':
                System.out.println(alphabet + " is Baker");
                break;
            case 'C':
                System.out.println(alphabet + " is Charlie");
                break;
            case 'D':
                System.out.println(alphabet + " is Dog");
                break;
            case 'E':
                System.out.println(alphabet + " is Easy");
                break;
            default:
                System.out.println("The alphabet " + alphabet + " you entered was not found");
                break;
        }
        return natoName;
    }
}