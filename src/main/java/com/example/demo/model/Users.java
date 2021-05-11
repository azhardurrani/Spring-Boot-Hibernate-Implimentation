package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import net.bytebuddy.asm.Advice;
import org.hibernate.annotations.ValueGenerationType;

import javax.persistence.*;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Column(name = "name")
    String name;


//    For one to one unidirectional mapping
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_details_id")
//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//    UserDetails userDetails;

    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY)
    UserDetails userDetails;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }
}
