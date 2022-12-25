package chapter6;

import chapter6.model.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapStudy {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(3, 6, -4);
        Stream<Integer> numberStream = numberList.stream();
        List<Integer> numberList2 = numberStream.map(x -> x * 2)
                .collect(Collectors.toList());

//        System.out.println("numberList2 = " + numberList2);
        Stream<Integer> numberListStream = numberList.stream();
        Stream<String> stringStream = numberListStream.map(x -> "Number is " + x);
//        System.out.println("stringStream = " + stringStream.collect(Collectors.toList()));

        User user = new User();
        user.setId(101);
        user.setName("Alice");
        user.setVerified(true);
        user.setEmailAddress("test@naver.com");

        User user2 = new User();
        user2.setId(102);
        user2.setName("Bob");
        user2.setVerified(false);
        user2.setEmailAddress("test2@naver.com");

        List<User> users = Arrays.asList(user, user2);

        Stream<User> userStream = users.stream();
        List<String> emaillAddress = userStream.map(User::getEmailAddress)
                .collect(Collectors.toList());
        System.out.println("emaillAddress = " + emaillAddress);
    }
}
