package com.tweteroo.api.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserDTO(

    @Size(
        min = 3, max = 16,
        message = "Username should be between 3 and 16 characters"
    )
    @NotBlank(
        message = "Username can't be whitespace"
    )
    String username,

    String avatar
) {}
