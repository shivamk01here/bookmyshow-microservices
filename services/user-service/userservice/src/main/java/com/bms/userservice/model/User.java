// src/main/java/com/bms/userservice/model/User.java
package com.bms.userservice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users") // Explicit table name to avoid conflicts with SQL reserved word "user"
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder // Makes object creation easier and cleaner
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, unique = true, length = 150)
    private String email;

    @Column(nullable = false)
    private String password;
}
