package com.fullstack.Medichaintest.roles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//import static com.sun.beans.introspect.PropertyInfo.Name.required;


@RestController
@RequestMapping(path = "api/v1/document")
public class UsersController {

    public final UserService userservice;

    @Autowired
    public UsersController(UserService userservice){
        this.userservice=userservice;
    }

    @GetMapping("getUser/{id}")
    public User getUser(@PathVariable("{id") Long id){
        return userservice.getUser(id);

    }

    @GetMapping("allUsers")
    public List<User> listUsers(){
        return userservice.listUsers();
    }

    @PostMapping("addUser")
    public void addNewUser(@RequestBody User user){
        userservice.addUser(user);
        }

    @DeleteMapping("deleteUser/{id}")
    public void deleteUser(@PathVariable("{id}") Long id){
        userservice.deleteUser(id);
    }

    @PutMapping("id")
    public void updateUser(@PathVariable("{id}") Long id,
                           @RequestParam(required =false) String firstName,
                           @RequestParam(required =false) String lastName,
                           @RequestParam(required =false) String email,
                           @RequestParam(required =false) String Password,
                           @RequestParam(required =false) boolean enabled

    ){
        userservice.updateUser(id, firstName,lastName, email, Password, enabled);
    }









}
