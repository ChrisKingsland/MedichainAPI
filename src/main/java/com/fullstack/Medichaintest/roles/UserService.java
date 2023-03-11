package com.fullstack.Medichaintest.roles;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {


    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public User getUser(Long id){
        return userRepository.getById(id);
    }

    public List<User> listUsers(){
        return userRepository.findAll();
    }

    public void addUser(User user){
        Optional<User> user1 = userRepository.findById(user.getId());

        if( user1.isPresent()){
            throw new IllegalStateException("This user already exist");
        }
        userRepository.save(user);

    }

    public void deleteUser(Long id){
        boolean exists = userRepository.existsById(id);

        if(!exists){
            throw new IllegalStateException("Document with id: " + id +" does not exist ");
        }

        userRepository.deleteById(id);
    }

    public void updateUser(Long id, String firstName, String lastName, String email, String Password, boolean enabled){

        User user = userRepository.findById(id).orElseThrow(() -> new IllegalStateException("Document with id: " + id +" does not exist "));
        //find user and update specified params
        //Optional<User> optionalUser = userRepository.findById(id);
        user.setEmail(email);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPassword(Password);
        user.setEnabled(enabled);
    }








}
