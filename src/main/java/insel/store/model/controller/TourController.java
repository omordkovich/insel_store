package insel.store.model.controller;

import insel.store.model.dto.TourDTO;
import insel.store.model.service.interfaces.TourService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Oleg Mordkovich
 * {@code @date} 15.09.2025
 */
@RestController
@RequestMapping("/tours")
public class TourController {
    private final TourService service;

    public TourController(TourService service) {
        this.service = service;
    }

    @PostMapping
    public TourDTO createTour(@RequestBody TourDTO tour) {
        return service.saveTour(tour);
    }

    @GetMapping("/{id}")
    public TourDTO findTourById(@PathVariable Long id) {
        return service.getTourById(id);
    }

    @GetMapping()
    public List<TourDTO> findAllTours() {
        return service.getAllActiveTours();
    }

    @PutMapping("{id}")
    public TourDTO updateTour(@PathVariable Long id, @RequestBody TourDTO tour) {
        return service.update(id, tour);
    }

    @DeleteMapping("/{tourId}")
    public TourDTO remove(@PathVariable("tourId") Long id) {
        return service.deleteById(id);
    }

    @PutMapping("/restore/{id}")
    public TourDTO restoreTour(@PathVariable Long id) {
        return service.restoreTourById(id);
    }

    @GetMapping("/count")
    public Long countTours() {
        return service.countAllTours();
    }
}

