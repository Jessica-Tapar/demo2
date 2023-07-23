package com.demo.demo2.entity;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "Login")
public class User {
    @Id
    private String Username;
    private String Password;
}


