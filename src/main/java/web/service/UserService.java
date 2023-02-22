package web.service;

import web.model.User;
import java.util.List;

public interface UserService {

    //UserDao userDao = new UserDaoImpl();

    void saveNewUser(User user);

    List<User> getAllUsers();

    void updateUser(int id, User user);

    void deleteUser(int id);

    User getUserById(int id);
}
