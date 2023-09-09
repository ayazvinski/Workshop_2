package pl.coderslab.entity.DAO;

import pl.coderslab.entity.User;

public class MainDao {

    public static void main(String[] args) {

//        User user1 = new User();
//        user1.setUserName("AnetaSun");
//        user1.setEmail("a.jadłowska@email.test");
//        user1.setPassword("jadłowskaSun");
//
//        userDao1.create(user1);
//        User read = userDao1.read(2);

//        UserDao userDao2 = new UserDao();

//        User user2 = userDao2.read(4);
//        user2.setUserName("JanNowak-Zmieniony");
//        user2.setEmail("j.nowak@email.test - Zmieniony");
//        user2.setUserName("nowak1990Zmieniony");
//
//        userDao2.update(user2);

        UserDao userDaoAll = new UserDao();
        User userFind = new User();
//        userFind.setUserName("TestAll");
//        userFind.setEmail("test22All@meail.test");
//        userFind.setPassword("testALL");
//        userDaoAll.create(userFind);
        User[] allUsers = userDaoAll.findAll();
        for (User user : allUsers) {
            System.out.println(user.toString());
        }


    }
}
