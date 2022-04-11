package util;

import classes.User;
import interfaces.UserInfo;

import java.util.ArrayList;

public class UserUtil implements UserInfo {

    private static User createFriend(int n, ArrayList<User> ar) {
        return new User(NAME[n], SURNAME[n], ID[n], ar);
    }


    /*
     *   showFriends() displays friend hierarchy from the end.
     *   The last users (5 level) do not have more friends (5 level is the last level. 6 does not exist).
     *   That's why parameter 'ar' in method must be null.
     *   'n' is the max index of array with friends. There are 31 users in general and each of them has 2 friends,
     *   that is, the 'n' is 30.
     *   Firstly there is generating of last 16 users and putting them in friendList;
     *   Then we made recursion of this method,
     *   but next objects will be creating with friends that contained in friendList.
     */
    public static void showFriends(int n, ArrayList<User> ar) {
        int friendsNumber = 2; //friendsNumber is the number of friends of each user
        int auxiliaryNumber = 1;

        ArrayList<User> friendList = new ArrayList<>();
        for (int i = n; i >= n / friendsNumber; i--) {
            User user = createFriend(i, ar);
            friendList.add(user);
        }
        //showing these friends
        Util.showCollection(friendList);
        //decreasing counter
        n = n / friendsNumber - auxiliaryNumber;
        if (n >= 0) {
            System.out.println("Are friends for:\n ");
            showFriends(n, friendList);

        }


    }


}
