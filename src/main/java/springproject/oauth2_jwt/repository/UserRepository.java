package springproject.oauth2_jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springproject.oauth2_jwt.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

	UserEntity findByUsername(String username);
}
