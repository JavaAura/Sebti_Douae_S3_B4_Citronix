package com.citron.citronix.mapper;

import com.citron.citronix.dto.SaleDTO;
import com.citron.citronix.entity.Harvest;
import com.citron.citronix.entity.Sale;
import org.mapstruct.*;
import org.springframework.stereotype.Component;


@Mapper(componentModel = "spring")
@Component

public interface SaleMapper {

    SaleDTO toDTO(Sale sale);

    @Mapping(target = "harvests", ignore = true)
    Sale toEntity(SaleDTO saleDTO);


}
