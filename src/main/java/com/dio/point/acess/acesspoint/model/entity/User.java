package com.dio.point.acess.acesspoint.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private UserCategory userCategory;
    private String name;
    private Company company;
    private AccessLevel accessLevel;
    private WorkDay workDay;
    private BigDecimal tolerance;
    private LocalDate beginWorkDay;
    private LocalDate endWorkDay;
}
