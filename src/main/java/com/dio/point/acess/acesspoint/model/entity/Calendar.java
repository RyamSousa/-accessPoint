package com.dio.point.acess.acesspoint.model.entity;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Calendar {
    private Long id;
    private DateType dateType;
    private String description;
    private LocalDateTime especialDate;
}
