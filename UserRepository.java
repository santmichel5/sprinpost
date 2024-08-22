package com.sprinboot.postgres.postsprin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.adaschool.datapostgres.data.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
