package by.itoverone.StorageSystem_18.service;


import by.itoverone.StorageSystem_18.dao.UserDAO;
import by.itoverone.StorageSystem_18.exception.ValidationException;

import java.util.List;

public interface UserService {

    UserDAO saveUser(UserDAO userDAO) throws ValidationException;

    void deleteUser(Integer userId);

    UserDAO findByUserName(String userName);

    List<UserDAO> findAll();
}
