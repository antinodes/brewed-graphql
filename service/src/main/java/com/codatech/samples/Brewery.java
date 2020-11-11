package com.codatech.samples;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.Singular;

import java.util.List;

@Builder(toBuilder = true)
@Data
public class Brewery {
    @NonNull
    private String id;
    @NonNull
    private String name;
    @Singular
    private List<Beer> beers;
}
