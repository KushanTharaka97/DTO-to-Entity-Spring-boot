package net.dto.tutorial.controller;

import net.dto.tutorial.dto.UserLocationDto;
import net.dto.tutorial.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user-location")
    public List<UserLocationDto> getAllUsersLocations(){
        return userService.getAllUserLocations();
    }
}
