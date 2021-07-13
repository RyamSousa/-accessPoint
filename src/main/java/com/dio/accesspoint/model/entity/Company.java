package com.dio.accesspoint.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Company {

    @Id
    private Long id;
    private String description;
    private String cnpj;
    private String address;
    private String district;
    private String city;
    private String estate;
    private String phonenumber;
}
