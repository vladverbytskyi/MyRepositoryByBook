package task4;

import java.util.List;

public class Box {
    private List<Thing> things;

    public Box(List<Thing> things) {
        this.things = things;
    }

    public List<Thing> getThings() {
        return things;
    }
}
