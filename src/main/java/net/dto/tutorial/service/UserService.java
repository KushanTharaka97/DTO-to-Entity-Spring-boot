package net.dto.tutorial.service;

import net.dto.tutorial.dto.UserLocationDto;
import net.dto.tutorial.model.User;
import net.dto.tutorial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements UserServiceInterface{
    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public List<UserLocationDto> getAllUserLocations() {
        return userRepository.findAll()
                .stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public UserLocationDto convertEntityToDto(User user) {
        UserLocationDto userLocationDto = new UserLocationDto();
        userLocationDto.setEmail(user.getEmail());
        userLocationDto.setUserId(user.getId());
        userLocationDto.setPlace(user.getLocation().getPlace());
        userLocationDto.setLongitude(user.getLocation().getLongitude());
        userLocationDto.setLatitude(user.getLocation().getLatitude());
        return null;
    }
}
