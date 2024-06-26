package com.example.SpringBootApplicationPart2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
@Getter
@Setter
@AllArgsConstructor
public class NewsDTO {
    private Long id;
    private Long categoryId;
    private final String title;
    private final String text;
    private final Instant date = Instant.now();

}
