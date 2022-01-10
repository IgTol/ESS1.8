package by.itoverone.StorageSystem_18.repository;

import by.itoverone.StorageSystem_18.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserName(String userName);
}
