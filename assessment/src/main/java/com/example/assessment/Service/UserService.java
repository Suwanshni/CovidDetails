package com.example.assessment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assessment.Model.User;
import com.example.assessment.Repo.UserRepo;

@Service
public class UserService {

 @Autowired
 UserRepo userRepo;

 public void addnew(User user){
  userRepo.save(user);
 }

 public List<User> showAll(){
  return userRepo.findAll();
 }

}
