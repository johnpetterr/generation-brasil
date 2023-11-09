package org.generation.lojaDeGames.repository;

import java.util.Optional;

import org.generation.lojaDeGames.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	public Optional<User> findByUser(String user);
}
