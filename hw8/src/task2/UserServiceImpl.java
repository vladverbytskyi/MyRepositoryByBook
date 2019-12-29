package task2;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {

    @Override
    public Map<String, List<String>> getLoggedUsers(List<User> users) {
        return users.stream().filter(user -> user.getLoginDate().isBefore(LocalDate.now().minusWeeks(1))).collect(
                Collectors.groupingBy(User::getTeam, Collectors.mapping(User::getEmail, Collectors.toList())));
    }
}
