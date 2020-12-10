package pl.bogus.demo.controller;

import org.springframework.web.bind.annotation.*;
import pl.bogus.demo.UserService;
import pl.bogus.demo.model.User;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@RequestMapping("/")
@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void addUser(@RequestBody User user) {

        userService.addUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    /*TODO Swagger doesn't work- Postman does
     *  Failed to convert value of type 'java.lang.String' to required type 'java.util.UUID';*/
    @GetMapping(path = "{id}")
    public User getUserById(@PathVariable("id") UUID id) {

        return userService.findUserById(id).orElseThrow(NoSuchElementException::new);
    }
    @DeleteMapping(path = "{id}")
    public void deleteUserById(@PathVariable("id") UUID id) {
        userService.deleteUserById(id);

    }

    @PutMapping(path = "{id}")
    public void updateUserById(@PathVariable("id") UUID id, @RequestBody User userToUpdate) {
        userService.updateUserById(id, userToUpdate);
    }
}

