package com.example.demo.service;

import com.example.demo.model.UserDetails;
import com.example.demo.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserDetailsService {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    public List<UserDetails> getAllUserDetails(){
        return userDetailsRepository.findAll();
    }

    public UserDetails saveUserDetails(UserDetails userDetails){

        return userDetailsRepository.save(userDetails);
    }
}
