public class SwitchStatement {
    public static void main(String[] args) {

        int day = 6;
        printDayOfTheWeek(day);
        printDayOfTheWeek2(day);
        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);
    }

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0 -> System.out.println("Day number " + day + " is SUNDAY");
            case 1 -> System.out.println("Day number " + day + " is MONDAY");
            case 2 -> System.out.println("Day number " + day + " is TUESDAY");
            case 3 -> System.out.println("Day number " + day + " is WEDNESDAY");
            case 4 -> System.out.println("Day number " + day + " is THURSDAY");
            case 5 -> System.out.println("Day number " + day + " is FRIDAY");
            case 6 -> System.out.println("Day number " + day + " is SATURDAY");
            default -> System.out.println("Invalid Day");
        }
    }

    public static void printDayOfTheWeek2(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> {
                yield "SUNDAY";
            }
            case 1 -> "MONDAY";
            case 2 -> "TUESDAY";
            case 3 -> "WEDNESDAY";
            case 4 -> "THURSDAY";
            case 5 -> "FRIDAY";
            case 6 -> "SATURDAY";
            default -> "Invalid Day";
        };
        System.out.println(day + " stands for " + dayOfWeek);
    }

    public static void printWeekDay(int day) {
        String dayOfWeek = "Invalid Day";

        if (day == 0) {
            dayOfWeek = "Sunday";
        } else if (day == 1) {
            dayOfWeek = "Monday";
        } else if (day == 2) {
            dayOfWeek = "Tuesday";
        } else if (day == 3) {
            dayOfWeek = "Wednesday";
        } else if (day == 4) {
            dayOfWeek = "Thursday";
        } else if (day == 5) {
            dayOfWeek = "Friday";
        } else if (day == 6) {
            dayOfWeek = "Saturday";
        }
        System.out.println(day + " stands for " + dayOfWeek);
    }


}
