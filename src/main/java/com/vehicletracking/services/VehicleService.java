/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vehicletracking.services;

import com.vehicletracking.domain.Vehicle;
import java.util.List;

/**
 *
 * @author burakzengin
 */
public interface VehicleService {

    public void save(Vehicle u);

    public List<Vehicle> findAll();
}
