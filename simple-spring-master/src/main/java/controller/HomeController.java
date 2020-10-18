package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sda.java6.simplejpa.entity.User;
import sda.java6.simplejpa.repository.UserRepository;

@Controller
public class HomeController {
   private final UserRepository userRepository;

    @Autowired
    public HomeController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public String home(@RequestParam String name) {
       User user = new User();
        user.setName(name);
        userRepository.save(user);

        return "index";

    }
    @GetMapping("/add-user")
    public String createUserForm(){
        return "createUserForm";
    }
    @PostMapping("/add-user")
    public String createUser(User user){
        userRepository.save(user);
        return "success";

    }
}
