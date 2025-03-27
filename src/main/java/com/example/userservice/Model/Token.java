package com.example.userservice.Model;

import jakarta.persistence.ManyToOne;
import lombok.Getter;
import jakarta.persistence.Entity;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Token extends BaseModel{
    private String value;
    @ManyToOne
    private User user;
    private Date expiryAt;

}
