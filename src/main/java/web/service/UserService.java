package web.service;

import web.model.User;
import java.util.List;

public interface UserService {

    //UserDao userDao = new UserDaoImpl();

    void createNewUser(User user);

    List<User> getAllUsers();

    void updateUser(User user);

    void deleteUser(User user);

    User getUserById(int id);
}
