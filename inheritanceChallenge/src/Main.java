public class Main {
    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "22/05/1994", "01/09/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());


        SalariedEmployee joe = new SalariedEmployee("Joe", "22/01/1996", "31/12/2022",
                30000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's pension = $" + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "12/08/1993", "11/11/2023", 25);
        System.out.println(mary);
        System.out.println("Mary's paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());


    }
}