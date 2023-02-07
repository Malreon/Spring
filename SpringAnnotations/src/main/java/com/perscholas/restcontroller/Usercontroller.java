package com.perscholas.restcontroller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.perscholas.model.User;

@RestController
public class Usercontroller {

   @PostMapping("/users")
   public void printData(@RequestBody User user) {
       System.out.println("Printing the user data:" + user);
   }
}