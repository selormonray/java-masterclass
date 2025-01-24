import java.util.ArrayList;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println(list);
        System.out.println(list.getClass().getName());

        ArrayList<String> groceries = new ArrayList<>();
        groceries.add("yogurt");
        System.out.println(groceries);

    }
}
