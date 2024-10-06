public class Hello {

    public static void main(String[] args) {
//    System.out.println("Selorm Onray");

        boolean isAlien = true;
        if (!isAlien) {
            System.out.println("He is an ALIEN!!!, I am scared of him!!!!");
        } else {
            System.out.println("Selorm is not an alien");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the High Score!!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.print("Greater than the top score and less than the 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("this is no error");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("this is not supposed to happen");
        }

    /*structure of ternary operator
        operand1 ? operand2 : operand3

            test if operand1 is true, if it is true, return operand2 otherwise return operand3
          operand1 is always boolean and the 2 and 3 do not have to be boolean

   */
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar != "Volkswagen";
        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }


//        Exercise
        double myFirstDoubleVariable = 20.00d;
        double mySecondDoubleVariable = 80.00d;
        double myTotalDouble = (100 * (myFirstDoubleVariable + mySecondDoubleVariable));
        System.out.println("My total value is " + myTotalDouble);
        double remainder = myTotalDouble % 40.00d;
        System.out.println("The remainder is " + remainder);
        boolean isNoRemainder = remainder == 0;
        System.out.println("isNoRemainder = " + isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }

    }
}
