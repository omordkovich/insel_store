package insel.store.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

import java.util.Objects;

/**
 * @author Oleg Mordkovich
 * {@code @date} 15.09.2025
 */


@Schema(description = "Class that describes Tour")
public class TourDTO {

    public TourDTO() {
    }

    @Schema(description = "Tour unique identifier", example = "777", accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @Schema(description = "Tour name", example = "ЗЛАТА ПРАГА, Страговский монастырь")
    private String title;

    @Schema(description = "Short description of tour")
    private String summary;

    @Schema(description = "Long description of tour")
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TourDTO tourDTO)) return false;
        return Objects.equals(id, tourDTO.id) && Objects.equals(title, tourDTO.title) && Objects.equals(summary, tourDTO.summary) && Objects.equals(description, tourDTO.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, summary, description);
    }

    @Override
    public String toString() {
        return String.format("Tour name: %s, summary: %s description: %s, active: %s", title, summary, description);
    }
}
