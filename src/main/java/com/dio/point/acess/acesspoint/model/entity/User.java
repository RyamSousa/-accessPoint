package com.dio.point.acess.acesspoint.model.entity;

import lombok.*;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class User {

    private Long id;
    @ManyToOne
    private UserCategory userCategory;
    private String name;
    @ManyToOne
    private Company company;
    @ManyToOne
    private AccessLevel accessLevel;
    @ManyToOne
    private WorkDay workDay;
    private BigDecimal tolerance;
    private LocalDate beginWorkDay;
    private LocalDate endWorkDay;
}
