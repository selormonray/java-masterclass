public class OverLoadChallenge {
    public static void main(String[] args) {

        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");

    }

    //    1 inch = 5.24 cm
    public static double convertToCentimeters(int heightInInches) {
        return (heightInInches * 2.54);
    }

    public static double convertToCentimeters(int feet, int inches) {
//        return ((heightInFeet * 12) + heightInInches) * 2.54;
//        return convertToCentimeters((heightInFeet * 12) + heightInInches);
        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        double result = convertToCentimeters(totalInches);
        return result;

    }
}
