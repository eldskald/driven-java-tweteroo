package com.tweteroo.api.dtos;

import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotBlank;

public record TweetDTO(

    @Size(
        min = 3, max = 16,
        message = "Username should be between 3 and 16 characters"
    )
    @NotBlank(
        message = "Username can't be whitespace"
    )
    String username,

    String avatar,

    @Size(
        min = 1, max = 200,
        message = "Tweet can't be more than 200 characters long"
    )
    @NotBlank(
        message = "Tweet can't be whitespace"
    )
    String text
) {}
