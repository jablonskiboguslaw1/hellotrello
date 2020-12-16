package pl.bogus.demo.controller;

import org.springframework.web.bind.annotation.*;
import pl.bogus.demo.model.User;
import pl.bogus.demo.service.UserService;

import java.util.List;
import java.util.NoSuchElementException;

@RequestMapping("/user")
@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User addUser(@RequestBody User user) {

       return userService.addUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }


    @GetMapping("/{id}")

    public User getUserById(@PathVariable Long id) {

        return userService.findUserById(id).orElseThrow(NoSuchElementException::new);
    }

    @DeleteMapping("/{id}")
    public boolean deleteUserById(@PathVariable Long id) {
         return userService.deleteUserById(id);

    }

    @PutMapping("/{id}")
    public User updateUserById(@PathVariable Long id, @RequestBody User userToUpdate) {
         return userService.updateUserById(id, userToUpdate);
    }
}

