package com.codatech.samples;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Builder(toBuilder = true)
@Data
public class Beer {
    @NonNull
    private String id;
    @NonNull
    private String name;
    @NonNull
    private String style;
    private Float abv;
    private Integer srm;
    @NonNull
    private Brewery brewer;

}
