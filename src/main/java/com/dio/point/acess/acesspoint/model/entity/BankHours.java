package com.dio.point.acess.acesspoint.model.entity;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class BankHours {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class BanckHoursId implements Serializable {
        private Long idBanckHours;
        private Long idMovimentation;
        private Long idUser;
    }

    @EmbeddedId
    private BanckHoursId id;
    private LocalDateTime workHour;
    private BigDecimal quantityHours;
    private BigDecimal workHours;
}

