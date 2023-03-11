package com.techtacular.TourMate.Controllers;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techtacular.TourMate.Domain.User;
import com.techtacular.TourMate.Services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UserService userService;

//   @PostMapping("/register")
//   public ResponseEntity<?> registerUser(@RequestBody UserDto userDto) {
//     userService.registerUser(userDto);
//     return ResponseEntity.created(URI.create("/users")).build();
//   }

//   @PostMapping("/login")
//   public ResponseEntity<?> loginUser(@RequestBody LoginDto loginDto) {
//     String token = userService.loginUser(loginDto);
//     return ResponseEntity.ok().header("Authorization", token).build();
//   }

//   @GetMapping("/profile")
//   public ResponseEntity<User> getUserProfile(@AuthenticationPrincipal User user) {
//     return ResponseEntity.of(userService.getUserProfile(user.getId()));
//   }

//   @PutMapping("/profile")
//   public ResponseEntity<?> updateUserProfile(@AuthenticationPrincipal User user, @RequestBody UserProfileDto userProfileDto) {
//     userService.updateUserProfile(user.getId(), userProfileDto);
//     return ResponseEntity.noContent().build();
//   }
 }

