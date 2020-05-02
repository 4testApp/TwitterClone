package com.startspring.twitterclone.repositories;

import com.startspring.twitterclone.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
