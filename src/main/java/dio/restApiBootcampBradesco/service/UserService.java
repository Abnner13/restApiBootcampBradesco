package dio.restApiBootcampBradesco.service;

import dio.restApiBootcampBradesco.model.User;

import java.util.List;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
     List<User> findAll();
    void delete(Long id);
    User updateUser(Long id, User userToUpdate);
}