package com.example.capstonebackend.usersApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UsersController {

    @Autowired
    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return this.usersService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getOneUser(@PathVariable int id) {
        User user = usersService.getOneUser(id).orElseThrow(IllegalArgumentException::new);
        return user;
    }

    @PostMapping
    public User addOneUser(@RequestBody User newUser) {
        if(newUser.getName() == null
                || newUser.getPassword() == null
                || newUser.getAdmin() == null) {
            throw new IllegalArgumentException("Not all fields are valid. Go back and make sure all fields are valid " +
                    "before API call is made.");
        }
        return usersService.addOneUser(newUser);
    }

    @PatchMapping("/{id}")
    public User updateOneUser(@RequestBody User updatedUser) {
        User User = usersService.getOneUser(updatedUser.getId()).orElseThrow(IllegalArgumentException::new);
        return usersService.updateOneUser(updatedUser);
    }

    @DeleteMapping("/{id}")
    public String removeOneUser(@PathVariable int id) {
        User user = usersService.getOneUser(id).orElseThrow(IllegalArgumentException::new);
        return usersService.removeOneUser(id);
    }
}