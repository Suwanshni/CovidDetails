package com.example.assessment.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="UserDetails")
public class User {

 @Id
 private String userId;

 public String getUserId() {
  return userId;
 }

 public void setUserId(String userId) {
  this.userId = userId;
 }
 
 private String userIdType;

 public String getUserIdType() {
  return userIdType;
 }

 public void setUserIdType(String userIdType) {
  this.userIdType = userIdType;
 }
 
 private String userName;

 public String getUserName() {
  return userName;
 }

 public void setUserName(String userName) {
  this.userName = userName;
 }
 
 private String phonenum;

 public String getPhonenum() {
  return phonenum;
 }

 public void setPhonenum(String phonenum) {
  this.phonenum = phonenum;
 }

 private String vaccineName;
 
 public String getVaccineName() {
  return vaccineName;
 }

 public void setVaccineName(String vaccineName) {
  this.vaccineName = vaccineName;
 }

}
