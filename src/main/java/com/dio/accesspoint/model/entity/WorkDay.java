package com.dio.accesspoint.model.entity;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Audited
public class WorkDay {

    @Id
    @GeneratedValue
    private Long id;
    private String description;
}
