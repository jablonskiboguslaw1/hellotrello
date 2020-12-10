package pl.bogus.demo.dao;

import org.springframework.stereotype.Repository;
import pl.bogus.demo.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository("postgres")
public class UserService implements  UserDao{
    @Override
    public int insertUser(UUID id, User user) {
        return 0;
    }

    @Override
    public List<User> getAllUsers() {
        return List.of(new User(UUID.randomUUID(),"user1", "email1","pass1"));
    }

    @Override
    public int deleteUserByID(UUID id) {
        return 0;
    }

    @Override
    public int updateUserById(UUID id, User user) {
        return 0;
    }

    @Override
    public Optional<User> findUserById(UUID id) {
        return Optional.empty();
    }
}
