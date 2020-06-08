package com.learning.ssm_swagger.service.user;

import com.learning.ssm_swagger.entity.user.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User get(int id);

    List<User> getAll();

    void add(User user);

    void update(User user);

    void delete(int id);
}
