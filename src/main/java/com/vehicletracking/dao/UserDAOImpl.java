/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vehicletracking.dao;

import com.vehicletracking.domain.User;
import com.vehicletracking.util.HibernateUtil;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Elidor
 */
@Repository("UserDAO")
public class UserDAOImpl implements UserDAO {

    @Override
    public void save(User u) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            org.hibernate.Transaction tr = session.beginTransaction();
            session.save(u);
            tr.commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
    }

    @Override
    public void delete(User u) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            org.hibernate.Transaction tr = session.beginTransaction();
            session.delete(u);
            tr.commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
    }

    @Override
    public List<User> findByProperty(String propName, Object propValue) {

        List<User> userList = null;
        Transaction transaction = null;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            transaction = session.beginTransaction();
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<User> query = builder.createQuery(User.class);
            Root<User> root = query.from(User.class);
            query.select(root).where(builder.equal(root.get(propName), propValue));
            Query<User> q = session.createQuery(query);
            userList = q.getResultList();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return userList;
    }

}
