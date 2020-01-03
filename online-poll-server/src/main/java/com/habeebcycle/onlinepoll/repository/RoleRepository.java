package com.habeebcycle.onlinepoll.repository;

import com.habeebcycle.onlinepoll.model.Role;
import com.habeebcycle.onlinepoll.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(RoleName roleName);
}
