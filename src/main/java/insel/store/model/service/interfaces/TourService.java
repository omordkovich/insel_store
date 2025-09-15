package insel.store.model.service.interfaces;

import insel.store.model.dto.TourDTO;

import java.util.List;

/**
 * @author Oleg Mordkovich
 * {@code @date} 15.09.2025
 */
public interface TourService {
    TourDTO saveTour(TourDTO tourDto);

    TourDTO getTourById(Long id);

    List<TourDTO> getAllActiveTours();

    TourDTO update(Long id, TourDTO tour);

    TourDTO deleteById(Long id);

    TourDTO restoreTourById(Long id);

    long countAllTours();
}
