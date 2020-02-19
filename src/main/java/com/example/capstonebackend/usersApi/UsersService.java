package com.example.capstonebackend.usersApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    @Autowired
    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<User> getAllUsers() {
        return this.usersRepository.findAll();
    }

    public Optional<User> getOneUser(int id) {
        return usersRepository.findById(id);
    }

    public User addOneUser(User newUser) {
        return usersRepository.save(newUser);
    }

    public User updateOneUser(User updatedUser) {
        return usersRepository.save(updatedUser);
    }

    public String removeOneUser(int id) {
        usersRepository.deleteById(id);
        return "Id " + id + " was removed";
    }
}