package pl.coderslab;

import pl.coderslab.entity.DAO.UserDao;
import pl.coderslab.entity.User;

public class Main {

    public static void main(String[] args) {

        User user1 = new User();
        user1.setUserName("JanNowak");
        user1.setEmail("j.nowak@email.test");
        user1.setPassword("nowak1990");

        UserDao userDao1 = new UserDao();
        userDao1.create(user1);


    }


}
