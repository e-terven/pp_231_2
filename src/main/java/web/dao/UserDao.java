package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void saveNewUser(User user);

    List<User> getAllUsers();

    void updateUser(int id, User user);

    void deleteUser(int id);

    User getUserById(int id);
}
