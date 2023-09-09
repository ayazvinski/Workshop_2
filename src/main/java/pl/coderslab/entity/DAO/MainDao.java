package pl.coderslab.entity.DAO;

import pl.coderslab.entity.User;

public class MainDao {

    public static void main(String[] args) {

        User user1 = new User();
        UserDao userDao1 = new UserDao();
        user1.setUserName("JanNowak");
        user1.setEmail("j.nowak@email.test");
        user1.setPassword("nowak1990");

        //   userDao1.create(user1);
        //   User read = userDao1.read(2);
    }
}
