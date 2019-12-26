import java.util.ArrayList;
import java.util.List;

public class ElementChecker {
    void checkElement() {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(2);
        list1.add(5);
        list1.add(11);
        list1.add(15);
        list1.add(564);
        list1.add(784);
        list1.add(864);

        list2.add(18);
        list2.add(321);
        list2.add(148);
        list2.add(2);
        list2.add(5615);
        list2.add(15);
        list2.add(185);

        System.out.println("List 1 contains: " + list1);
        System.out.println("List 2 contains: " + list2);

        for (Integer integer : list1) {
            for (Integer value : list2) {
                if (integer.equals(value)) {
                    System.out.println("Similar element: " + integer);
                }
            }
        }


     }
}
