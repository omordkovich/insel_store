package insel.store.model.service;

import insel.store.model.dto.TourDTO;
import insel.store.model.entity.Tour;
import insel.store.model.service.interfaces.TourService;
import insel.store.model.service.mapping.TourMappingService;
import insel.store.repository.TourRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Oleg Mordkovich
 * {@code @date} 15.09.2025
 */

@Service
public class TourServiceImpl implements TourService {

    private final TourRepository repository;
    private final TourMappingService mapper;

    public TourServiceImpl(TourRepository repository, TourMappingService mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public TourDTO saveTour(TourDTO tourDto) {
        Tour tour = mapper.mapDtoToEntity(tourDto);
        return mapper.mapEntityToDto(repository.save(tour));
    }

    @Override
    public TourDTO getTourById(Long id) {
        return null;
    }

    @Override
    public List<TourDTO> getAllActiveTours() {
        return repository.findAll().stream()
                .filter(Tour::isActive)
                .map(mapper::mapEntityToDto)
                .toList();
    }

    @Override
    public TourDTO update(Long id, TourDTO tour) {
        return null;
    }

    @Override
    public TourDTO deleteById(Long id) {
        Tour tour = repository.findById(id).orElse(null);
        if (tour != null) {
            tour.setActive(false);
            return mapper.mapEntityToDto(tour);
        }
        return null;
    }

    @Override
    public TourDTO restoreTourById(Long id) {
        Tour tour = repository.findById(id).orElse(null);
        if (tour != null) {
            tour.setActive(true);
            return mapper.mapEntityToDto(tour);
        }
        return null;
    }

    @Override
    public long countAllTours() {
        return repository.findAll().stream()
                .filter(Tour::isActive)
                .count();
    }
}
