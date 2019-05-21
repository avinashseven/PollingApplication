package com.example.polling.repo;

import com.example.polling.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepo extends JpaRepository<RoleName, Long> {
    Optional<RoleName> findByName(RoleName roleName);
}
