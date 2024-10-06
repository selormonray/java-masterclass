public class Car {

    private String make = "Tesla";
    private String model = "X";
    private String colour = "Green";
    private int doors = 4;
    private boolean convertible = true;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {

        if (make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake) {
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {
        System.out.println(doors + "-Door " +
                colour + " " +
                make + " " +
                model + " " +
                ((convertible) ? "Convertible" : " "));
    }
}
