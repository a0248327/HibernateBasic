package com.blog.cavalr.hibernate;

public class UserManager {

    public static void main(String[] args) {

        UserDao userDao = new UserDao();

        /* create new user */
        User user = new User();
        user.setUserName("user01");
        user.setFirstName("fname01");
        user.setLastName("lname01");

        userDao.saveUser(user);

        /* find user by name */
        User fromDB = userDao.findUserByName("user01");
        System.out.println(fromDB);

        assert fromDB != null;

        /* delete user */
        userDao.deleteUser(fromDB);

    }
}
