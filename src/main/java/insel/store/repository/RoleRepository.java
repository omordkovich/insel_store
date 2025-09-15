package insel.store.repository;

import insel.store.model.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Oleg Mordkovich
 * {@code @date} 15.09.2025
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByTitle(String title);
}
