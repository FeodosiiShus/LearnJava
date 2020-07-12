package stepik.oop.friend;

public class Friend {
    String myName;
    Friend myFriend;
    void letsBeFriends(Friend a){
        myFriend = a;
        System.out.println(myFriend);
    }
}
