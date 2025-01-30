package com.groupeisi.ecommerce.products.dto.responses;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductDtoResponse implements Serializable {
    private String ref;
    private String name;
    private double stock;
    private long idUser;
}
