package com.fullstack.Medichaintest.roles;

import com.fullstack.Medichaintest.document.Document;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByName(String name);
}
