package com.jwt.JwtAuthService.account;


import com.jwt.JwtAuthService.user.User;
import com.jwt.JwtAuthService.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@AllArgsConstructor
@RestController
public class AccountController {

    private final UserRepository userRepository;

    @GetMapping("/account")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/account/{id}")
    public ResponseEntity<User> getOneUser(@PathVariable Integer id){
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.map(ResponseEntity::ok).orElse(ResponseEntity.noContent().build());
    }
}
