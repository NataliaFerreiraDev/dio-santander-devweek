package br.com.dio.santanderdevweek2023.service;

import br.com.dio.santanderdevweek2023.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
