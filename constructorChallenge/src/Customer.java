public class Customer {

    private final String name;
    private final double creditLimit;
    private final String emailAddress;
    private String customerPhoneAddress;
    private String customerEmail;

    public Customer() {
        this("Sel Ah", "sel@gggggg.com");
    }

    public Customer(String name, String emailAddress) {
        this(name, 45200, emailAddress);

    }

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getCustomerPhoneAddress() {
        return customerPhoneAddress;
    }

    public String getEmployeesData() {
        return customerEmail;
    }


}
