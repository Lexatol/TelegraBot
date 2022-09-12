package ru.lexp.lexpbot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.lexp.lexpbot.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
