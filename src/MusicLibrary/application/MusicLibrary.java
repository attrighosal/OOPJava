package MusicLibrary.application;

import MusicLibrary.entities.User;

import java.util.Date;
import java.util.HashMap;

public class MusicLibrary {

  private HashMap<Integer, User> userMap = new HashMap<>();

  public User registerUser(String firstName, String lastName,
                           String city, String locality,
                           String state, int pinCode,
                           String emailId, String phoneNo) {
    User.Address address =
        new User.Address(city, locality, state, pinCode);
    User.Contact contact = new User.Contact(emailId, phoneNo);
    User user = new User(firstName, lastName, address, contact, new Date());
    userMap.put(user.getUserId(), user);
    return user;
  }
}
