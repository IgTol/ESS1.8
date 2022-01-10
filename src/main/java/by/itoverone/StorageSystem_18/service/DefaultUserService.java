package by.itoverone.StorageSystem_18.service;

import by.itoverone.StorageSystem_18.dao.UserConverter;
import by.itoverone.StorageSystem_18.dao.UserDAO;
import by.itoverone.StorageSystem_18.entity.User;
import by.itoverone.StorageSystem_18.exception.ValidationException;
import by.itoverone.StorageSystem_18.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Objects.isNull;

@Service
@AllArgsConstructor
public class DefaultUserService implements UserService{
    private final UserRepository userRepository;
    private final UserConverter userConverter;

    private void validateUserDAO(UserDAO userDAO) throws ValidationException {
        if (isNull(userDAO)) {
            throw new ValidationException("Object User is null");
        }
        if (isNull(userDAO.getUserName()) || userDAO.getUserName().isEmpty()) {
            throw new ValidationException("User name is empty");
        }
    }

    @Override
    public UserDAO saveUser(UserDAO userDAO) throws ValidationException {
        validateUserDAO(userDAO);
        User savedUser = userRepository.save(userConverter.fromUserDAOToUser(userDAO));
        return userConverter.fromUserToUserDAO(savedUser);
    }

    @Override
    public void deleteUser(Integer userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public UserDAO findByUserName(String userName) {
        User user = userRepository.findByUserName(userName);
        if (user != null) {
            return userConverter.fromUserToUserDAO(user);
        }
        return null;
    }

    @Override
    public List<UserDAO> findAll() {
        return null;
    }
}
