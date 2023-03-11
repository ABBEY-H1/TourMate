package com.techtacular.TourMate.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techtacular.TourMate.Domain.User;
import com.techtacular.TourMate.Repository.UserRepository;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
}

public User registerUser(User user) throws Exception {
    if (userRepository.findByUsername(user.getUsername()).isPresent()) {
      throw new Exception();
    }
    return userRepository.save(user);
  }

  public User loginUser(String username, String password) throws Exception {
    Optional<User> user = userRepository.findByUsername(username);
    if (user.isPresent() && user.get().getPassword().equals(password)) {
      return user.get();
    } else {
      throw new Exception();
    }
  }

  public User updateUser(Long id, User updatedUser) throws Exception {
    Optional<User> user = userRepository.findById(id);
    if (user.isPresent()) {
      User existingUser = user.get();
      existingUser.setUsername(updatedUser.getUsername());
      existingUser.setPassword(updatedUser.getPassword());
      existingUser.setEmail(updatedUser.getEmail());
      existingUser.setUserType(updatedUser.getUserType());
      return userRepository.save(existingUser);
    } else {
      throw new Exception();
    }
  }

  public void deleteUser(Long id) throws Exception {
    if (userRepository.existsById(id)) {
      userRepository.deleteById(id);
    } else {
      throw new Exception();
    }
  }

public Optional getUserProfile(Long id) {
    return null;
}

}
