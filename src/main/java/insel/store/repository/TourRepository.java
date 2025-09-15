package insel.store.repository;

import insel.store.model.entity.Tour;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Oleg Mordkovich
 * {@code @date} 15.09.2025
 */
public interface TourRepository extends JpaRepository<Tour, Long> {
    List<Tour> findByActiveTrue();
}
