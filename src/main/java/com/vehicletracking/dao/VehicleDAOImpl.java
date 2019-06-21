/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vehicletracking.dao;

import com.vehicletracking.domain.Vehicle;
import com.vehicletracking.util.HibernateUtil;
import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author burakzengin
 */
@Repository("VehicleDAO")
public class VehicleDAOImpl implements VehicleDAO {

    public void save(Vehicle vehicle) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            org.hibernate.Transaction tr = session.beginTransaction();
            session.save(vehicle);
            tr.commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
    }

    public List<Vehicle> findAll() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        List<Vehicle> vehicles = null;
        try {
            org.hibernate.Transaction tr = session.beginTransaction();
            CriteriaQuery cq = session.getCriteriaBuilder().createQuery(Vehicle.class);
            cq.from(Vehicle.class);
            vehicles = session.createQuery(cq).getResultList();
            tr.commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
        return vehicles;
    }
}
