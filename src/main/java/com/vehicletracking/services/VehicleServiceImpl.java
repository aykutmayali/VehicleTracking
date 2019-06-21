/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vehicletracking.services;

import com.vehicletracking.dao.VehicleDAO;
import com.vehicletracking.domain.Vehicle;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author burakzengin
 */
@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleDAO vehicleDAO;

    public void save(Vehicle u) {
        vehicleDAO.save(u);
    }

    public List<Vehicle> findAll() {
        return vehicleDAO.findAll();
    }

}
