package com.dio.point.acess.acesspoint.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.OneToMany;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    @Id
    private Long id;
    @OneToMany
    private AccessLevel accessLevel;
    private String description;
}
