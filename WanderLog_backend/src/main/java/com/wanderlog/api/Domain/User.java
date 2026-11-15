package com.wanderlog.api.Domain;

import jakarta.persistence.*;
import com.wanderlog.api.Enums.TravelStyle;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    private Long id;
    private String username;
    private boolean isPrivate;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private java.util.Set<TravelStyle> travelStyles = new java.util.HashSet<>();

}
