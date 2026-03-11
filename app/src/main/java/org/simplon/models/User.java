package org.simplon.models;

import java.util.ArrayList;
import java.util.List;

public class User {
 private int id;
 private String pseudo;
 private String password;
 private String email;
 private List<User> usersSuivis; 
 private List<Integer> createdPostId;

 public User() {
 }

 public User(int id, String pseudo, String password, String email, List<User> usersSuivis,
   List<Integer> createdPostId) {
  this.id = id;
  this.pseudo = pseudo;
  this.password = password;
  this.email = email;
  this.usersSuivis = new ArrayList<>();
  this.createdPostId = new ArrayList<>();
 }

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getPseudo() {
  return pseudo;
 }

 public void setPseudo(String pseudo) {
  this.pseudo = pseudo;
 }

 public String getPassword() {
  return password;
 }

 public void setPassword(String password) {
  this.password = password;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public List<User> getUsersSuivis() {
  return usersSuivis;
 }

 public void setUsersSuivis(List<User> usersSuivis) {
  this.usersSuivis = usersSuivis;
 }

 public List<Integer> getCreatedPostId() {
  return createdPostId;
 }
 
 public void setCreatedPostId(List<Integer> createdPostId) {
  this.createdPostId = createdPostId;
 } 
 
 

}
