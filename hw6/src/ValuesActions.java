import java.util.Comparator;
import java.util.SortedSet;

class ValuesActions {
    void sortElement() {
        SortedSet<Integer> set = new java.util.TreeSet<>(Comparator.reverseOrder());
        set.add(1);
        set.add(22);
        set.add(83);
        set.add(44);
        set.add(51);
        set.add(15);

        System.out.println("Sorted element " + set);
    }
}
