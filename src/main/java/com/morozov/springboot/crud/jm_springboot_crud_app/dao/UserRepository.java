package com.morozov.springboot.crud.jm_springboot_crud_app.dao;

import com.morozov.springboot.crud.jm_springboot_crud_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User getUserByUsername(String name);
    User getUserByEmail(String email);

}
