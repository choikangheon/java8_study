package chapter6;

import chapter6.model.User;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedStudy {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, -5, 7, 4);
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNumbers);

        User user = new User();
        user.setId(101);
        user.setName("Bob");
        user.setVerified(true);
        user.setEmailAddress("test@naver.com");

        User user2 = new User();
        user2.setId(102);
        user2.setName("Alice");
        user2.setVerified(false);
        user2.setEmailAddress("test2@naver.com");

        List<User> users = Arrays.asList(user, user2);
        List<User> sortedUsers = users.stream()
                .sorted(Comparator.comparing(User::getName))
                .collect(Collectors.toList());

        System.out.println(sortedUsers);
    }
}
