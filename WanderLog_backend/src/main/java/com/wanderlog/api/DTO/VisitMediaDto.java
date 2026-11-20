package com.wanderlog.api.DTO;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VisitMediaDto {
    private Long id;
    private String storagePath;
    private String blurhash;
    private LocalDateTime takenAt;
    private Long visitId;
}

