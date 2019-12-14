import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MyList<T extends Number> {
    private List<T> list = new ArrayList<>();
    public void addArgument(T argument) {
        this.list.add(argument);
    }
    public List<T> getList() {
        return list;
    }
    public double getMax(@NotNull List<T> list) {
        return list
                .stream()
                .mapToDouble(Number::doubleValue)
                .max().orElseThrow(NoSuchElementException::new);
    }
    public double getMin(@NotNull List<T> list) {
        return list
                .stream()
                .mapToDouble(Number::doubleValue)
                .min().orElseThrow(NoSuchElementException::new);
    }
}
