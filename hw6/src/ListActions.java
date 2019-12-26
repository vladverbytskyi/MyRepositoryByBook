import java.util.ArrayList;
import java.util.List;

public class ListActions {
    void addNumbers() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(9);
        list.add(11);
        list.add(18);
        list.add(20);
        list.add(22);

        System.out.println("List  before remove: " + list);
        list.removeIf(integer -> integer % 3 == 0);
        System.out.println("List  after remove: " + list);
    }
}
