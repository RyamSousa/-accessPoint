package com.dio.point.acess.acesspoint.model.entity;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class AccessLevel {
    private Long id;
    private String description;

}
