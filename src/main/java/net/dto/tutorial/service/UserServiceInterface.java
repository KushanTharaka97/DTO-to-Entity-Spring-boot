package net.dto.tutorial.service;

import net.dto.tutorial.dto.UserLocationDto;
import net.dto.tutorial.model.User;

import java.util.List;

public interface UserServiceInterface {
    public List<UserLocationDto> getAllUserLocations();
    public UserLocationDto convertEntityToDto(User user);
}
