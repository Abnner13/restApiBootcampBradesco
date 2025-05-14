package dio.restApiBootcampBradesco.service;

import dio.restApiBootcampBradesco.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}