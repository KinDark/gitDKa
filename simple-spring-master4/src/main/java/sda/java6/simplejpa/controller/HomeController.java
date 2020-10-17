package sda.java6.simplejpa.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sda.java6.simplejpa.Car;
import sda.java6.simplejpa.entity.User;
import sda.java6.simplejpa.repository.UserRepository;

@Controller
public class HomeController {
    private final UserRepository userRepository;
    private final Car car;

    @Autowired
    public HomeController(UserRepository userRepository, Car car) {
        this.userRepository = userRepository;
        this.car = car;
    }

    @GetMapping("/")
    public String home(){
        System.out.println(car.getPower());
        return "index";
    }

    //Obsluga żądań wyświetlenia formularza
    @GetMapping("/add-user")
    public String createUserForm(){
        return "createUserForm";
    }

    //Obsługa żadań typu POST z danymi formularza
    @PostMapping("/add-user")
    public String createUser(User user){
        userRepository.save(user);
        return "success";
    }

    @GetMapping("/users/{id}")
    public @ResponseBody User oneUser(@PathVariable long id){
        return userRepository.findById(id).orElse(null);
    }
}
