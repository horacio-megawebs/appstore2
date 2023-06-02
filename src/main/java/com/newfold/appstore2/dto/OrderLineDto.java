package com.newfold.appstore2.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderLineDto {
    ProductOrderLineDto productDto;
    long quantity;
}
