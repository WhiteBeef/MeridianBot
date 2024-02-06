package ru.whitebeef.meridianbot.repository;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.whitebeef.meridianbot.dto.UserDTO;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserDTO, Long> {
    Optional<UserDTO> getUserById(@NotNull Long id);

}
