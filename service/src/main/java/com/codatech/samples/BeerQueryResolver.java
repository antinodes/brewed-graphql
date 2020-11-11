package com.codatech.samples;

import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BeerQueryResolver implements GraphQLQueryResolver {
    public Beer getBeer(String id) {
        return sampleBeer().build();
    }

    public Brewery getBrewery(String id) {
        return sampleBrewer()
                .beer(sampleBeer().build())
                .build();
    }

    private static Beer.BeerBuilder sampleBeer() {
        return Beer.builder()
                .id("CF1")
                .brewer(sampleBrewer().build())
                .name("Cabin Fever")
                .style("Brown Ale")
                .abv(6.5f);
    }

    private static Brewery.BreweryBuilder sampleBrewer() {
        return Brewery.builder()
                .id("NH1")
                .name("New Holland");
    }
}
