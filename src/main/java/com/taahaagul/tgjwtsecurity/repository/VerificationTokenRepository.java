package com.taahaagul.tgjwtsecurity.repository;

import com.taahaagul.tgjwtsecurity.entity.User;
import com.taahaagul.tgjwtsecurity.entity.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {
    Optional<VerificationToken> findByToken(String token);

    VerificationToken findByUser(User user);
}
