package insel.store.model.service.mapping;

import insel.store.model.dto.TourDTO;
import insel.store.model.entity.Tour;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author Oleg Mordkovich
 * {@code @date} 15.09.2025
 */

@Mapper(componentModel = "spring")
public interface TourMappingService {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "active", constant = "true")
    Tour mapDtoToEntity(TourDTO dto);

    TourDTO mapEntityToDto(Tour entity);
}
