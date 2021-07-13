package com.dio.accesspoint.model.entity;

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
@Entity
public class BankHours {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class IdBanckHours implements Serializable {
        private Long idBankHours;
        private Long idMovimentation;
        private Long idUser;
    }

    @EmbeddedId
    private IdBanckHours id;
    private LocalDateTime workDate;
    private BigDecimal amountHours;
    private BigDecimal balanceHours;
}
