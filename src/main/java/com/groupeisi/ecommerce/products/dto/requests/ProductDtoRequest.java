package com.groupeisi.ecommerce.products.dto.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductDtoRequest implements Serializable {
    @NotBlank(message = "La reference est requise!")
    private String ref;
    @NotBlank(message = "Le nom est requis!")
    private String name;
    @NotNull(message = "Le stock est requis!")
    private double stock;
    @NotNull(message = "Id User est requis!")
    private long idUser;
}

