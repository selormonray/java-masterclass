public class Main {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("Samsung Odessy 47inch", "Samsung", 47,
                "3840 x 2160");
        Motherboard theMotherboard = new Motherboard("DJ-600", "Samsung", 8, 10,
                "v3.65");
        PersonalComputer thePC = new PersonalComputer("2208", "Samsung", theCase, theMonitor,
                theMotherboard);

        /*thePC.getMonitor().drawPixelAt(10, 10, "red");
        thePC.getMotherboard().loadProgram("Windows OS");
        thePC.getComputerCase().pressPowerButton();*/
        thePC.powerUp();

    }
}