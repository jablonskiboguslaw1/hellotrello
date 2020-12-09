package pl.bogus.demo;

import org.springframework.stereotype.Service;
import pl.bogus.demo.dao.UserDao;
import pl.bogus.demo.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public int addUser(User user) {
        return userDao.insertUser(user);
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
    public Optional<User> findUserById(UUID id){
        return  userDao.findUserById(id);
    }
    public int deleteUserById(UUID id){
       return userDao.deleteUserByID(id);

    }
    public int updateUserById(UUID id , User user){
      return   userDao.updateUserById(id, user);

    }

}
