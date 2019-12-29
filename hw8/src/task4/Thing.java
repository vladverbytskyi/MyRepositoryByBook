package task4;

public class Thing {
    private boolean isFragile;
    private String name;

    public Thing(boolean isFragile, String name) {
        this.isFragile = isFragile;
        this.name = name;
    }

    public boolean isFragile() {
        return isFragile;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Thing{" + "name='" + name + '\'' + '}';
    }
}
