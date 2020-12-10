package pl.bogus.demo.dao;

import org.springframework.stereotype.Repository;
import pl.bogus.demo.model.User;

import java.util.*;

@Repository("fakeDao")
public class FakeUserDataAccessService implements UserDao {

    private static List<User> DB = new ArrayList<>();

    @Override
    public int insertUser(UUID id, User user) {
        DB.add(new User(id, user.getName(), user.getEmail(), user.getPassword()));
        return 1;
    }

    @Override
    public List<User> getAllUsers() {
        return DB;
    }

    @Override
    public int deleteUserByID(UUID id) {
        if (findUserById(id).isPresent()) {
            DB.remove(findUserById(id).get());
            return 1;
        } else return 0;
    }


    @Override
    public int updateUserById(UUID id, User user) {
      return   findUserById(id).map(u-> {
            int indexOfUserToUpdate = DB.indexOf(u);
            if (indexOfUserToUpdate >= 0) {
                DB.set(indexOfUserToUpdate, new User(id, user.getName(), user.getPassword(), user.getEmail()));
                return 1;
            }
                return 0;
        }).orElse(0);
    }



    @Override
    public Optional<User> findUserById(UUID id) {

        return DB.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }


}
