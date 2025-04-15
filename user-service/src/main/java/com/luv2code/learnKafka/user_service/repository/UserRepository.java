package com.luv2code.learnKafka.user_service.repository;

import com.luv2code.learnKafka.user_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
