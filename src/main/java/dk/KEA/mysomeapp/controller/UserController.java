package dk.KEA.mysomeapp.controller;



import dk.KEA.mysomeapp.entity.Post;
import dk.KEA.mysomeapp.entity.User;
import dk.KEA.mysomeapp.repo.UserRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

@RestController

@RequestMapping("api/user")
public class UserController {

    UserRepository userRepository;

    public UserController (UserRepository userRepository){
        this.userRepository = userRepository;
    }


    @PostMapping()
    User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping
    Iterable<User> getAll() {
        return userRepository.findAll();
    }


    //TODO Create login function with login.html










}
