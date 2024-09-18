package com.syntexpro.login.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "user-login")
public class Users {
    @Id
    @Column(name = "Identifier")
    private Long id;

    @Column(name = "user-name")
    @Size(max=10)
    private String username;

    @Column(name = "password")
    @Size(max=10)
    private String password;
//
////No argument constructor
//    public User() {
//    }
////Argument constructor
//    public User(Long id, String password, String username) {
//        this.id = id;
//        this.password = password;
//        this.username = username;
//    }
//
////For Getter
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
////For setter
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
////For toString
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", username='" + username + '\'' +
//                ", password='" + password + '\'' +
//                '}';
//    }
}