package by.itoverone.StorageSystem_18.controller;

import by.itoverone.StorageSystem_18.dao.UserDAO;
import by.itoverone.StorageSystem_18.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private final UserService userService;


    @PostMapping("/save")
    public UserDAO saveUsers(@RequestBody UserDAO userDAO) throws by.itoverone.StorageSystem_18.exception.ValidationException {
        return userService.saveUser(userDAO);
    }

    @GetMapping("/findAll")
    public List<UserDAO> findAllUser() {
        return userService.findAll();
    }

    @GetMapping("/findByUserName")
    public UserDAO findByUserName(@RequestParam String userName) {
        return userService.findByUserName(userName);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
        return ResponseEntity.ok().build();
    }
}
