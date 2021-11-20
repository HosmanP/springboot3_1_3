package crud.DAO;

import crud.model.User;

import java.util.List;

public interface UserDAO {

    User updateUser(User user);

    User getUserById(Long id);

    User saveUser(User user);

    void removeUser(Long id);

    List<User> getAllUsers();

}
