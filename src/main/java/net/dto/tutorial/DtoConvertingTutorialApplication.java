package net.dto.tutorial;

import net.dto.tutorial.model.Location;
import net.dto.tutorial.model.User;
import net.dto.tutorial.repository.LocationRepository;
import net.dto.tutorial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DtoConvertingTutorialApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DtoConvertingTutorialApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LocationRepository locationRepository;

    public DtoConvertingTutorialApplication(UserRepository userRepository, LocationRepository locationRepository) {
        this.userRepository = userRepository;
        this.locationRepository = locationRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Location location = new Location();
        location.setPlace("Places01");
        location.setDescription("Place example checking");
        location.setLatitude(0.00);
        location.setLongitude(0.00);
        locationRepository.save(location);

        User user = new User();
        user.setEmail("Hello@Gmail.com");
        user.setFirstName("FirstName Hello");
        user.setLastName("LastName Hello");
        user.setPassword("Hihihio");
        user.setLocation(location);
        userRepository.save(user);

        User user1 = new User();
        user1.setEmail("haklnal@Gmail.com");
        user1.setFirstName("ndfak Hello");
        user1.setLastName("Nadeeka Hello");
        user1.setPassword("Hino");
        user1.setLocation(location);
        userRepository.save(user1);
    }
}
