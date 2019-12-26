import java.util.ArrayList;
import java.util.List;

public class Fruits {
    void replaceFruits() {
        List<String> list = new ArrayList<>();
        list.add("Lemon");
        list.add("Orange");
        list.add("Apple");
        list.add("Banana");
        list.add("Avocado");

        System.out.println("List before replace: " + list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("Orange")) {
                list.set(i, "Grapefruit");
            } else {
                System.out.println("That value not present :) ");
            }
        }
        System.out.println("list after replace " + list);

    }
 }
