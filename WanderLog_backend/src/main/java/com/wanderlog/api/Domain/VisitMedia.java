package com.wanderlog.api.Domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class VisitMedia {
    @Id
    private Long id;
    private String storagePath;
    private String blurhash;
    private LocalDateTime takenAt;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
