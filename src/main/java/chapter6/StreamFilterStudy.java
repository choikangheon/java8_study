package chapter6;

import chapter6.model.Order;
import chapter6.model.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterStudy {
    public static void main(String[] args) {
        Stream<Integer> numberStream = Stream.of(3, -5, 7, 10, -3);
        Stream<Integer> filteredNumberStream = numberStream.filter(x -> x > 0);
        List<Integer> filteredNumbers = filteredNumberStream.collect(Collectors.toList());
//        System.out.println(filteredNumbers);

        List<Integer> newFilteredNumbers = Stream.of(3, -5, 7, 10, -3)
                .filter(x -> x > 0)
                .collect(Collectors.toList());

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
        List<User> verifiedList = users.stream()
                .filter(User::isVerified)
                .collect(Collectors.toList());

//        System.out.println(verifiedList);

        Order order = new Order();
        order.setId(1001);
        order.setStatus(Order.OrderStatus.CREATED);

        Order order2 = new Order();
        order2.setId(1002);
        order2.setStatus(Order.OrderStatus.ERROR);

        List<Order> orders = Arrays.asList(order, order2);
        List<Order> collect = orders.stream()
                .filter(o -> o.getStatus() == Order.OrderStatus.ERROR)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
