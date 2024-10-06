public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

        kitchen.doKitchenWork();
        kitchen.setKitchenState(true, false, true);

        kitchen.getDishWasher().setHasWorkToDo(true);
        kitchen.getIceBox().setHasWorkToDo(true);
        kitchen.getBrewMaster().setHasWorkToDo(true);

        kitchen.getBrewMaster().brewCoffee();
        kitchen.getIceBox().orderFood();
        kitchen.getDishWasher().doDishes();
    }
}