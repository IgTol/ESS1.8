package by.itoverone.StorageSystem_18.dao;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDAO {

    private Integer userId;
    private String userName;
    private String userEmail;
    private String userPass;
    private Integer access;
}
