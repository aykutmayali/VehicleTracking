
import com.vehicletracking.dao.UserDAOImpl;
import com.vehicletracking.domain.User;
import org.apache.commons.codec.digest.DigestUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Elidor
 */
public class hibernateSaveUser {

    public static void main(String[] args) {

        UserDAOImpl userDAOImpl = new UserDAOImpl();

        User u = new User();
        u.setUsername("AliVeli");
        u.setPassword(DigestUtils.md5Hex("12345"));

        userDAOImpl.save(u);
        System.out.println("Successfully Added");
    }
}
