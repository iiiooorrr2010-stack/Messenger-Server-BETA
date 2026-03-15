package com.example.demo.UserCode.UserRepository;

import com.example.demo.UserCode.UserModel.FromNum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersNumRepository extends JpaRepository<FromNum, String> {
}
