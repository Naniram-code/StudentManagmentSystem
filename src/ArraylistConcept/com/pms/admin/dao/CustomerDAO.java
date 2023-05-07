package ArraylistConcept.com.pms.admin.dao;

import com.pms.model.User;

import java.util.List;

public interface CustomerDAO {
    public void addCustomer();
    public List<User> viewAllUserInfo();
    public User viewUserInfo(int id);
    public void deleteUser(int id);
    public void updateUser(int id);


}
