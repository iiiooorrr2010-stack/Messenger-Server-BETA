package com.example.demo.UserCode.Controller;

import com.example.demo.UserCode.UserModel.FromNum;
import com.example.demo.UserCode.UserModel.User;
import com.example.demo.UserCode.UserRepository.UsersNumRepository;
import com.example.demo.UserCode.UserRepository.UsersRepository;
import com.example.demo.UtilCode.Exception.UserNotFoundWithId;
import com.example.demo.UtilCode.Exception.UserNotFoundWithNum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class UserNumController {
    @Autowired
    private UsersNumRepository usersNumRepository;
    @Autowired
    private UsersRepository usersRepository;
    @GetMapping("/get-num-user/{num}")
  public User GetUser(@PathVariable String num) {
        FromNum lowUser = usersNumRepository.findById(num)
                .orElseThrow(()
                        -> new UserNotFoundWithNum(num));

        return usersRepository.findById(lowUser.getId())
                .orElseThrow(()
                    -> new UserNotFoundWithId(lowUser.getId()));
    }
}
