package by.itoverone.StorageSystem_18.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column
    private String userName;

    @Column
    private String userEmail;

    @Column
    private String userPass;

    @Column
    private Integer access;
}
