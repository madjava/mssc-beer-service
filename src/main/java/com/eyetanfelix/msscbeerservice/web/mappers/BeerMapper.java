package com.eyetanfelix.msscbeerservice.web.mappers;

import com.eyetanfelix.msscbeerservice.domain.Beer;
import com.eyetanfelix.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
