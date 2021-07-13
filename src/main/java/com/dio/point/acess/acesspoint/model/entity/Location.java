package com.dio.point.acess.acesspoint.model.entity;

import lombok.*;

import javax.persistence.OneToMany;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Location {
    private Long id;
    @OneToMany
    private AccessLevel accessLevel;
    private String description;
}
