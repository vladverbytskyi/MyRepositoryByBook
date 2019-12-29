package task2;

import java.util.List;
import java.util.Map;

public interface UserService {
    Map<String, List<String>> getLoggedUsers(List<User> users);
}
