package com.unideb.unideb.thesis.about.lms.repository;

import com.unideb.unideb.thesis.about.lms.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
