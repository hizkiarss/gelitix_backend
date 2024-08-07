package com.gelitix.backend.ticketType.dto;

import com.gelitix.backend.event.entity.Event;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
@Data
public class CreateTicketTypeDto {

    @NotBlank
    private Long id;

    @NotBlank
    private String name;

    @NotNull
    private BigDecimal price;

    @NotNull
    private Integer quantity;

//    @NotNull
//    private Long eventId;
}