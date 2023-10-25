package com.rpatel747.simpleapi;

import org.springframework.data.repository.CrudRepository;

import com.rpatel747.simpleapi.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}
