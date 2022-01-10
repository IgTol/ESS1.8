package by.itoverone.StorageSystem_18.dao;

import by.itoverone.StorageSystem_18.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {
    public User fromUserDAOToUser(UserDAO userDAO) {
        User user = new User();
        user.setUserId(userDAO.getUserId());
        user.setUserName(user.getUserName());
        user.setUserEmail(userDAO.getUserEmail());
        user.setUserPass(userDAO.getUserPass());
        user.setAccess(userDAO.getAccess());
        return user;
    }

    public UserDAO fromUserToUserDAO(User user) {
        return UserDAO.builder()
                .userId(user.getUserId())
                .userName(user.getUserName())
                .userEmail(user.getUserEmail())
                .userPass(user.getUserPass())
                .access(user.getAccess())
                .build();
    }
}
