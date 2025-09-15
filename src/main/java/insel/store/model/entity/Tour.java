package insel.store.model.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

import java.util.Objects;

/**
 * @author Oleg Mordkovich
 * {@code @date} 15.09.2025
 */

@Entity
@Table
@Schema(description = "Class that describes Tour")
public class Tour {

    public Tour() {
    }

    @Schema(description = "Tour unique identifier", example = "777", accessMode = Schema.AccessMode.READ_ONLY)
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Schema(description = "Tour name", example = "ЗЛАТА ПРАГА, Страговский монастырь")
    @Column
    private String title;

    @Schema(description = "Short description of tour")
    @Column
    private String summary;

    @Schema(description = "Long description of tour")
    @Column
    private String description;

    @Schema(description = "Is tour available", accessMode = Schema.AccessMode.READ_ONLY)
    @Column
    private boolean active;

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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Tour tour)) return false;
        return active == tour.active && Objects.equals(id, tour.id) && Objects.equals(title, tour.title) && Objects.equals(summary, tour.summary) && Objects.equals(description, tour.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, summary, description, active);
    }

    @Override
    public String toString() {
        return String.format("Tour name: %s, summary: %s description: %s, active: %s", title, summary, description, active ? "yes" : "no");
    }
}
