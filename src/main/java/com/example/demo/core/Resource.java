package com.example.demo.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Resource {

    private Object resource;
    private String type;
    private Object url;
}
