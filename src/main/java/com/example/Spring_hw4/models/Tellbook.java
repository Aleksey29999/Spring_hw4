package com.example.Spring_hw4.models;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Data
@Getter
@Setter
public class Tellbook {
    private Integer id;
    private String name;
    private Long number;
}
