package com.dio.accesspoint.model.entity;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Movimentation {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class IdMovimentation implements Serializable {
        private Long idUser;
        private Long idMovimentation;
    }

    @EmbeddedId
    private IdMovimentation id;
    private LocalDateTime inDate;
    private LocalDateTime outDate;
    private BigDecimal period;
    @ManyToOne
    private Occurrence occurrence;
    @ManyToOne
    private Calendar calendar;

}
