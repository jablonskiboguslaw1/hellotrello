package pl.bogus.demo.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.bogus.demo.database.UserRepository;
import pl.bogus.demo.model.User;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;


    public User addUser(User user) {
        return userRepository.save(user);

    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }

    public boolean deleteUserById(Long id) {
        userRepository.deleteById(id);
        return true;

    }
//TODO optional
    public User updateUserById(Long id, User user) {
        User user1 = userRepository.findById(id).get();
        user1 = user;
        return user1;

    }

}
