package com.mrbread.domain.repository;

import com.mrbread.domain.model.Status;
import com.mrbread.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends PertenceOrganizacaoRespository<User, UUID> {
    Optional<User> findByLogin(String login);
    Optional<User> findByLoginAndOrganizacaoIdOrg(String login, UUID idOrg);
    boolean existsByLogin(String login);
}
