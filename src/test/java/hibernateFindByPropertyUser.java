
import com.vehicletracking.dao.UserDAOImpl;
import com.vehicletracking.domain.User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author burakzengin
 */
public class hibernateFindByPropertyUser {

    public static void main(String args[]) {

        UserDAOImpl userDAOImpl = new UserDAOImpl();
        User user = userDAOImpl.findByProperty("username", "BurakZengin");

        System.out.println(user.getId());
        System.out.println("Successfully Found");
    }
}
