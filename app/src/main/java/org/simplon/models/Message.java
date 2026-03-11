package org.simplon.models;

import java.util.Date;

public abstract class Message {
 private int id;
 private String description;
 private Date timestamp;

 public Message(int id, String description, Date timestamp) {
  this.id = id;
  this.description = description;
  this.timestamp = timestamp;
 }

 public int getId() {
  return id;
 }
 public void setId(int id) {
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
