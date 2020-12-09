package pl.bogus.demo.dao;

import pl.bogus.demo.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserDao {

    int insertUser(UUID id, User user);

    default int insertUser(User user) {
        UUID id = UUID.randomUUID();
        return insertUser(id, user);
    }

    List<User> getAllUsers();


    int deleteUserByID(UUID id);

    int  updateUserById(UUID id, User user);

    Optional<User> findUserById(UUID id);
}