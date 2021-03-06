package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    void updateUser(User user);

    void removeUserById(Long id);

    User getUserByName(String name);

    User getUserById(Long id);

    List<User> getAllUsers();
}
