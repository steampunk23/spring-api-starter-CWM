package com.steampunk.store.repositories;

import com.steampunk.store.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    void existsByEmail();
}
