package project.service;


import project.dm.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
