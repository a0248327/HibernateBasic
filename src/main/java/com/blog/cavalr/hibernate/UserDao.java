package com.blog.cavalr.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UserDao {

    private SessionFactory sessionFactory;

    public UserDao() {
        sessionFactory = HibernateHelper.sessionFactory();
    }

    public void saveUser(User user) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();

    }

    public User findUserByName(String userName) {

        return (User) sessionFactory.openSession().get(User.class, userName);

    }

    public void deleteUser(User user) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(user);
        transaction.commit();
    }
}
