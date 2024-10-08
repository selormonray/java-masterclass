public class HourlyEmployee extends Employee {

    private final double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        return hourlyPayRate * 40;
    }

    public double getDoublePay() {
        return 2 * collectPay();
    }
}
