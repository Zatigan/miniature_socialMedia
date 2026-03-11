package org.simplon.models;

import java.util.Date;
import java.util.UUID;

public abstract class Message {

 private int nbOfMessage = 0;
 private UUID id;
 private String description;
 private Date timestamp;
 private User creator;

 public Message(){
    this.id = UUID.randomUUID();
 }

 public Message(String description, Date timestamp, User creator) {
  this();
  this.description = description;
  this.timestamp = timestamp;
  this.creator = creator;
 }

 public User getCreator() {
  return creator;
 }
 public void setCreator(User creator) {
  this.creator = creator;
 }
 
 public String getId() {
  return id.toString();
 }
 public void setId(UUID id) {
  this.id = id;
 }
 public String getDescription() {
  return description;
 }
 public void setDescription(String description) {
  this.description = description;
 }
 public Date getTimestamp() {
  return timestamp;
 }
 public void setTimestamp(Date timestamp) {
  this.timestamp = timestamp;
 }

}
