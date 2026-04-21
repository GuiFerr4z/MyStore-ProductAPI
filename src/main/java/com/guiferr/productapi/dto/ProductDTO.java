package com.guiferr.productapi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public record ProductDTO(

    @NotBlank
    String name,

    @NotNull
    @Positive
    Double price,

    @NotNull
    @PositiveOrZero
    Integer quantity

) {}