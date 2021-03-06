import model.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamAPI01 {

    List<User> users = Arrays.asList(
        new User (101,"chloe1","1234567"),
        new User (102,"chloe2","123"),
        new User (103,"chloe3","123456"),
        new User (104,"chloe4","1234567890"),
        new User (105,"chloe5","1")
    );

@Test
public void test1(){
    List<User> userList = new ArrayList<>();
    users.stream()
         .filter((u) -> (u.getPassword().split("").length>=6))
         .forEach(System.out::println);
}
}

