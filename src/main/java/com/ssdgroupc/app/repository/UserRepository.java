package com.ssdgroupc.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ssdgroupc.app.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	Optional<User> findByUserName(String userName);
}
