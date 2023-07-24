package com.example.assessment.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.assessment.Model.User;

public interface UserRepo extends JpaRepository<User, Integer> {
 
}
