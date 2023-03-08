package com.fullstack.Medichaintest.roles;

import com.fullstack.Medichaintest.document.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {

    Users findByEmail(String email);
}
