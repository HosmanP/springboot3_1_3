package crud.service;

import crud.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void saveUser(User user);
    void removeUser(Long id);
    void updateUser(User user);
    User getUserById(Long id);
}
