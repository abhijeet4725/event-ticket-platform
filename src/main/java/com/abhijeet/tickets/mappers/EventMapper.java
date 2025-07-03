package com.abhijeet.tickets.mappers;

import com.abhijeet.tickets.domain.CreateEventRequest;
import com.abhijeet.tickets.domain.CreateTicketTypeRequest;
import com.abhijeet.tickets.domain.dtos.CreateEventRequestDto;
import com.abhijeet.tickets.domain.dtos.CreateEventResponseDto;
import com.abhijeet.tickets.domain.dtos.CreateTicketTypeRequestDto;
import com.abhijeet.tickets.domain.entites.Event;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EventMapper {

    CreateTicketTypeRequest fromDto(CreateTicketTypeRequestDto dto);

    CreateEventRequest fromDto(CreateEventRequestDto dto);

    CreateEventResponseDto toDto(Event event);

}
