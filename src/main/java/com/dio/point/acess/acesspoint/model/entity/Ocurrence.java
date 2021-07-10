package com.dio.point.acess.acesspoint.model.entity;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Ocurrence {
    private Long id;
    private String name;
    private String decription;
}
