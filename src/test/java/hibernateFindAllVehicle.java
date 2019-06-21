
import com.vehicletracking.dao.VehicleDAOImpl;
import com.vehicletracking.domain.Vehicle;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author burakzengin
 */
public class hibernateFindAllVehicle {

    public static void main(String args[]) {

        VehicleDAOImpl vehicleDAOImpl = new VehicleDAOImpl();
        List<Vehicle> models = vehicleDAOImpl.findAll();
        for (Vehicle model : models) {
            System.out.println(model.getLicenceNumber());
        }
    }
}
