package com.wanderlog.api.Domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VisitMedia {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String storagePath;
    private String blurhash;
    private LocalDateTime takenAt;

    @ManyToOne(fetch = FetchType.LAZY)
    private Visit visit;


}
