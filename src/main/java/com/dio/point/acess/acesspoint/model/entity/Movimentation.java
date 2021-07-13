package com.dio.point.acess.acesspoint.model.entity;


import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Movimentation {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class MovimentationId implements Serializable {
        private Long idMoviment;
        private Long idUser;
    }

    @EmbeddedId
    private Movimentation id;
    private LocalDateTime beginDate;
    private LocalDateTime endDate;
    private BigDecimal period;
    private Ocurrence ocurrence;
    private Calendar calendar;

}
