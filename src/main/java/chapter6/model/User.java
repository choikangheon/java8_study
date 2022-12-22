package chapter6.model;

import java.util.List;
import java.util.stream.LongStream;

public class User {
    private int id;

    private String name;
    private String emailAddress;
    private boolean isVerified;


    public User(int id, String name, String emailAddress, boolean isVerified) {
        this.id = id;
        this.name = name;
        this.emailAddress = emailAddress;
        this.isVerified = isVerified;
    }

    public User(){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public List<Integer> getFriendUserids() {
        return friendUserids;
    }

    public void setFriendUserids(List<Integer> friendUserids) {
        this.friendUserids = friendUserids;
    }

    private List<Integer> friendUserids;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", isVerified=" + isVerified +
                ", friendUserids=" + friendUserids +
                '}';
    }
}
