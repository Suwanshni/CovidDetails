package com.example.assessment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.assessment.Model.User;
import com.example.assessment.Service.UserService;

@Controller
public class UserController {

 @Autowired
 UserService service;

 @GetMapping("/")
 public String firsString(@ModelAttribute User user, Model model) {
  List<User> record = service.showAll();
  model.addAttribute("records", record);
  return "display";
 }

 @GetMapping("/index")
 public String indexString() {
  return "index";
 }

 @PostMapping("/index")
 public String postData(@ModelAttribute User u, Model mode) { // Binding the values
  mode.addAttribute("userId", u.getUserId());
  service.addnew(u); // Wrapping the data
  return "redirect:/";
 }

}
