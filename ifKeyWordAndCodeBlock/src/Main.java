public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 400;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score is less than 1000");
        } else {
            System.out.println("Got here");
        }

/*
//        if with an else if and else clock

        boolean condition1= true;
        boolean condition2= true;

        if (condition1) {
//            if condition1 is true, execute this block
            System.out.println("condition1 is true");
        } else if (condition2) {
//            if condition1 is false and condition2 is true, execute this block
            System.out.println("condition1 is false and condition2 is true");
        } else {
//            execute this block if both condition1 and condition2 are false
            System.out.println("execute is both condition1 and condition2 are false");
        }*/


    }
}