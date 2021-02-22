package edu.sulymka.registerofgraduates.service;

import edu.sulymka.registerofgraduates.model.User;

import java.util.List;

public interface UserService {
    User create (User user);
    User update (User user);
    void delete(Long id);
    User readById (Long id);
    List<User> getAll();
}
