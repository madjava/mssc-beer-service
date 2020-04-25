package com.eyetanfelix.msscbeerservice.bootstrap;

import com.eyetanfelix.msscbeerservice.domain.Beer;
import com.eyetanfelix.msscbeerservice.repository.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    public static final String BEER_1_UPC = "1001";
    public static final String BEER_2_UPC = "1002";
    public static final String BEER_3_UPC = "1003";

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count() == 0) {
            beerRepository.save(Beer.builder()
                    .beerName("Mango Bobs")
                    .beerStyle("IPA")
                    .quantityToBrew(200)
                    .upc(BEER_1_UPC)
                    .price(new BigDecimal("12.95"))
                    .minOnHand(12)
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Galaxy Cat")
                    .beerStyle("PALE_ALE")
                    .quantityToBrew(200)
                    .upc(BEER_2_UPC)
                    .price(new BigDecimal("11.95"))
                    .minOnHand(12)
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("No Hammer on The Bar")
                    .beerStyle("PALE_ALE")
                    .quantityToBrew(200)
                    .upc(BEER_3_UPC)
                    .price(new BigDecimal("11.95"))
                    .minOnHand(12)
                    .build());
        }
    }
}
