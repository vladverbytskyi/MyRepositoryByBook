package task4;

import java.util.List;
import java.util.stream.Collectors;

public class ProtectorServiceImpl implements ProtectorService {
    @Override
    public List<Protector> protectThings(List<Box> boxes) {
        return boxes.stream().flatMap(box -> box.getThings().stream()).filter(Thing::isFragile).map(Protector::new)
                    .collect(Collectors.toList());
    }
}
