package net.lkrnac.book.eiws.chapter04.restcontroller;

import java.util.Collection;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("PMD.AvoidSynchronizedAtMethodLevel")
public class UserService {
  private final UserRepository userRepository;

  @Autowired
  public UserService(UserRepository userRepository) {
    super();
    this.userRepository = userRepository;
  }

  public Collection<User> getAllUsers() {
	  System.out.println("inside getAllUsers");
    return userRepository.getAllUsers();
  }

  public User getUser(int identifier) {
    return userRepository.getUser(identifier);
  }

  public int addUser(User user) {
    return userRepository.addUser(user);
  }

  public void updateOrAddUser(int identifier, User user) {
    userRepository.updateOrAddUser(identifier, user);
  }

  public User deleteUser(int identifier) {
    return userRepository.deleteUser(identifier);
  }

  public Collection<User> getUsersInterval(int lowerId, int upperId) {
    return userRepository.getUsersInterval(lowerId, upperId);
  }

}
